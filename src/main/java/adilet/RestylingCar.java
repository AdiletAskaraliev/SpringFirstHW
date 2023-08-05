package adilet;

import java.util.List;

public class RestylingCar implements Salon{
    private List<String> carDescription;

    public void setCarDescription(List<String> carDescription) {
        this.carDescription = carDescription;
    }

    @Override
    public String toString() {
        return "RestylingCar{" +
                "carDescription = " + carDescription +
                '}';
    }

    @Override
    public void price() {
        System.out.println("4 5000 USD Dollars");
    }
}
