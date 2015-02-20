package za.ac.cput.cars;

/**
 * Created by student on 2015/02/20.
 */
public class Car {

    private String manufac;
    private String colour;
    private String carID;
    private int year;

    public Car(String manufac, String colour, int year, String carID) {
        this.manufac = manufac;
        this.colour = colour;
        this.year = year;
        this.carID = carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setManufac(String manufac) {
        this.manufac = manufac;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufac() {
        return manufac;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public String getCarID() {
        return carID;
    }
}
