package adilet;

public class HatchbackCar implements Salon{

    private String Brand;
    private int year;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void price() {
        System.out.println("12000 USD Dollars");
    }

    @Override
    public String toString() {
        return "HatchbackCar " +
                "Brand= " + Brand +
                ", year= " + year ;
    }
}
