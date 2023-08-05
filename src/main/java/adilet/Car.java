package adilet;

public class Car {
    private Salon salon;
    private String brand;


    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "salon = " + salon + " }";
    }
}
