package parkingSystem; 
 
public class CarInformation { 
	private String carNumber; 
    private String carType; 
 
    public CarInformation(String carNumber, String carType) { 
        this.carNumber = carNumber; 
        this.carType = carType; 
    } 
 
    public String getCarNumber() { 
        return carNumber; 
    } 
 
    public void setCarNumber(String carNumber) { 
        this.carNumber = carNumber; 
    } 
 
    public String getCarType() { 
        return carType; 
    } 
 
    public void setCarType(String carType) { 
        this.carType = carType; 
    } 
} 