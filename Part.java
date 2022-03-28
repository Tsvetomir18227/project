package project;


import java.util.*;
public class Part {
	
    private String name;
    private double buyPrice;
    private double sellPrice;
    private PartCategory category;
    private Manufacturer manufacturer;
    private String code;
    public static ArrayList<Car> supportedCars = new ArrayList<>();
    
    Part(){
    	
    }
    
    public Part(String name, double buyPrie, double sellPrice, Manufacturer manufacturer,String code,  PartCategory category, ArrayList<Car> cars) {
        this.name = name;
        this.buyPrice = buyPrie;
        this.sellPrice = sellPrice;
        this. manufacturer = manufacturer;
        this.code = code;
        this.category = category;
        this.supportedCars = supportedCars;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public PartCategory getCategory() {
        return category;
    }

    public void setCategory(PartCategory category) {
        this.category = category;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    
    
    public static void printParts() {
    	
    }
    
  
    public void addSupportedCar(Car car){
    	     supportedCars.add(car);
    }

	@Override
	public String toString() {
		return " Part name : " + name + "\n buyPrice : " + buyPrice + "\n sellPrice : " + sellPrice + "\n category : " + category
				+ "\n manufacturer : " + manufacturer.toString() + "\n code : " + code;
	}
    
    

}