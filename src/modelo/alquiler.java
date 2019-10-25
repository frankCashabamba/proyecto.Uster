/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Frank
 */
public class alquiler {
    
    private int id;
	private String liceniacocche;
	private String licenciaPerosna;
	private int idcoche;
        private int idconductor;
        private String fechaReserva;
       

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the liceniacocche
     */
    public String getLiceniacocche() {
        return liceniacocche;
    }

    /**
     * @param liceniacocche the liceniacocche to set
     */
    public void setLiceniacocche(String liceniacocche) {
        this.liceniacocche = liceniacocche;
    }

    /**
     * @return the licenciaPerosna
     */
    public String getLicenciaPerosna() {
        return licenciaPerosna;
    }

    /**
     * @param licenciaPerosna the licenciaPerosna to set
     */
    public void setLicenciaPerosna(String licenciaPerosna) {
        this.licenciaPerosna = licenciaPerosna;
    }

    /**
     * @return the idcoche
     */
    public int getIdcoche() {
        return idcoche;
    }

    /**
     * @param idcoche the idcoche to set
     */
    public void setIdcoche(int idcoche) {
        this.idcoche = idcoche;
    }

    /**
     * @return the idconductor
     */
    public int getIdconductor() {
        return idconductor;
    }

    /**
     * @param idconductor the idconductor to set
     */
    public void setIdconductor(int idconductor) {
        this.idconductor = idconductor;
    }

    /**
     * @return the fechaReserva
     */
    public String getFechaReserva() {
        return fechaReserva;
    }

    /**
     * @param fechaReserva the fechaReserva to set
     */
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
        
        
        
    
    
}
