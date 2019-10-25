-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-10-2019 a las 00:14:55
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_uster`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `drivers`
--

CREATE TABLE `drivers` (
  `Iddrivers` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `surname` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `License` varchar(1) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `drivers`
--

INSERT INTO `drivers` (`Iddrivers`, `name`, `surname`, `License`) VALUES
(1, 'franklin', 'Cashabmba', 'B'),
(2, 'frankln', 'cashabamba', 'c'),
(6, 'Monica', 'Pastor', 'B');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trips`
--

CREATE TABLE `trips` (
  `idTrips` int(11) NOT NULL,
  `idVehicle` int(11) DEFAULT NULL,
  `idDrivers` int(11) DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `trips`
--

INSERT INTO `trips` (`idTrips`, `idVehicle`, `idDrivers`, `date`) VALUES
(1, 7, 2, '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehicles`
--

CREATE TABLE `vehicles` (
  `Id` int(11) NOT NULL,
  `Brand` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Model` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Plate` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `LicenseRequired` varchar(1) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `vehicles`
--

INSERT INTO `vehicles` (`Id`, `Brand`, `Model`, `Plate`, `LicenseRequired`) VALUES
(1, 'kia', 'kia', '1235kht', 'Y'),
(2, 'kia', 'rio', '1234abc', 'Y'),
(6, 'kia', 'kia', '1234', 'B'),
(7, 'kia', 'rioz', '1234ooo', 'C'),
(11, 'skoda', 'skoda', '1234frt', 'c'),
(12, 'kia', 'k', 'k', 'V'),
(13, 'f', 'f', 'f', 'f'),
(14, 'Franklin', 'rio', '1992', 'B'),
(15, 'Kia', 'sportage', '1234Bdc', 'B'),
(17, 'opel', 'opel', '1234ñññ', 'B'),
(18, 'kia', 'kia', '7899ssk', 'B'),
(19, 'kia', 'riosss', '3333dds', 'B'),
(20, 'seat', 'lwon', '124qqq', 'C'),
(21, 'Fran', 'franklin', '1992ccc', 'B');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `drivers`
--
ALTER TABLE `drivers`
  ADD PRIMARY KEY (`Iddrivers`);

--
-- Indices de la tabla `trips`
--
ALTER TABLE `trips`
  ADD PRIMARY KEY (`idTrips`),
  ADD UNIQUE KEY `idVehicle` (`idVehicle`),
  ADD UNIQUE KEY `idDrivers` (`idDrivers`);

--
-- Indices de la tabla `vehicles`
--
ALTER TABLE `vehicles`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `drivers`
--
ALTER TABLE `drivers`
  MODIFY `Iddrivers` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `trips`
--
ALTER TABLE `trips`
  MODIFY `idTrips` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `vehicles`
--
ALTER TABLE `vehicles`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `trips`
--
ALTER TABLE `trips`
  ADD CONSTRAINT `trips_ibfk_1` FOREIGN KEY (`idDrivers`) REFERENCES `drivers` (`Iddrivers`),
  ADD CONSTRAINT `trips_ibfk_2` FOREIGN KEY (`idVehicle`) REFERENCES `vehicles` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
