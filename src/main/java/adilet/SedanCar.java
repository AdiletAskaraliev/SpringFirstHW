package adilet;

public class SedanCar implements Salon{

    private String brand;
    private double volume;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void price() {
        System.out.println("15000 USD Dollars");
    }

    @Override
    public String toString() {
        return "SedanCar " +
                "brand= " + brand +
                ", volume= " + volume ;
    }
}
