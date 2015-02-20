package za.ac.cput.cars;

import org.junit.*;
import org.junit.Test;
import java.util.Map;

/**
 * Created by student on 2015/02/20.
 */

public class testCarMap {

    Car car1, car2, car3;
    CarMap myMap;

    @Before
    public void setUp()
    {
        myMap = new CarMap();

        car1 = new Car("Volvo", "Silver", 2014, "GP234");
        car2 = new Car("Mazda", "White", 2013, "CA297");
        car3 = new Car("Honda", "Black", 2012, "GP456");

        myMap.addCar("GP234", car1);
        myMap.addCar("CA297", car2);
        myMap.addCar("GP456", car3);
    }

    @Test
    public void testAdd()
    {
        Assert.assertEquals(true, myMap.getCar(car2.getCarID()));
    }

    @Test
    public void testDelete()
    {
        myMap.deleteCar("GP234");
        Assert.assertEquals(false, myMap.getCar(car1.getCarID()));
    }
}
