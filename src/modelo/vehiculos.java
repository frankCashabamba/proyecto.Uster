package modelo;

/**
 *
 * @author Frank
 */
public class vehiculos {
    

	private int id;
	
	private String brand;
	private String model;
	private String plate;
        private String LicenseRequired;
       
 	
	public vehiculos() {
	}
	
	public vehiculos(String brand, String model, String plate, String licenserequired) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.plate = plate;
                this.LicenseRequired = licenserequired;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * @return the LicenseRequired
     */
    public String getLicenseRequired() {
        return LicenseRequired;
    }

    /**
     * @param LicenseRequired the LicenseRequired to set
     */
    public void setLicenseRequired(String LicenseRequired) {
        this.LicenseRequired = LicenseRequired;
    }
    
    
    @Override
	public String toString() {
		return this.id+", "+this.brand+", "+this.model+", "+this.plate+", "+ this.LicenseRequired;
	}
}

