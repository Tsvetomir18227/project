package project;

import java.util.Objects;

public class Car {
	private String carBrand;
	private String carModel;
	private String carYear;

    public Car(String carBrand, String carModel, String carYear) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

	@Override
	public int hashCode() {
		return Objects.hash(carBrand, carModel, carYear);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carBrand, other.carBrand) && Objects.equals(carModel, other.carModel)
				&& Objects.equals(carYear, other.carYear);
	}
    
    
    
}