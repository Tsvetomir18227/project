import java.util.*;
public class Part {
    String name;
    double buyPrice;
    double sellPrice;
    PartCategory category;
    //HashSet<Car> supportedCar;
    Manufacturer manufacturer;
    String t332;

    public Part(String name, double buyPrie, double sellPrice, Manufacturer manufacturer,String t332,  PartCategory category;) {
       this.name = name;
       this.buyPrice = buyPrie;
       this.sellPrice = sellPrice;
       this. manufacturer = manufacturer;
       this.t332 = t332;
       this.category = category;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PartCategory getCategory() {
        return category;
    }

    public void setCategory(PartCategory category) {
        this.category = category;
    }

    public HashSet<Car> getSupportedCar() {
        return supportedCar;
    }

    public void setSupportedCar(HashSet<Car> supportedCar) {
        this.supportedCar = supportedCar;
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
    public void addSupportedCar(Car car){
        this.supportedCars.add(car);
    }

    @Override
    public String toString(){

    }
}
