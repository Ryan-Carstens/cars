package za.ac.cput.cars;

import org.junit.*;

/**
 * Created by student on 2015/02/20.
 */
public class testCarSet {

    Car car1, car2;
    CarSet carSet;

    @Before
    public void setUp()
    {
        carSet = new CarSet();

        car1 = new Car("Volvo", "Silver", 2014, "GP234");
        car2 = new Car("Mazda", "White", 2013, "CA297");

        carSet.addStudent(car1);
        carSet.addStudent(car2);
    }

    @Test
    public void testAdd()
    {
        Assert.assertEquals(true, carSet.getStudent(car2));
    }

    @Test
    public void testDelete()
    {
        carSet.removeStudent(car2);
        Assert.assertEquals(false, carSet.getStudent(car2));
    }

}
