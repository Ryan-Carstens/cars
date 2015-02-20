package za.ac.cput.cars;

import org.junit.*;

import java.util.*;
/**
 * Created by student on 2015/02/20.
 */
public class testCarList {

    Car car1, car2, car3, car4;
    CarList carList = new CarList();

    @Before
    public void setUp()
    {
        car1 = new Car("Volvo", "Silver", 2014, "GP234");
        car2 = new Car("Mazda", "White", 2013, "CA297");
        //car3 = new Car("Honda", "Black", 2012, "GP456");
        //car4 = new Car("Honda", "Black", 2012, "GP456");

        carList.addCar(car1);
        carList.addCar(car2);
        //carList.addCar(car3);
       //carList.addCar(car4);
    }

    @Test
    public void testAdd()
    {
        Assert.assertEquals(car2, carList.getCar("CA297"));
    }

    @Test
    public void testRemove()
    {
        boolean removed = carList.deleteCar("CA297");
        Assert.assertEquals(true, removed);
    }

}
