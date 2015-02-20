package za.ac.cput.cars;

import org.junit.*;
/**
 * Created by student on 2015/02/20.
 */
public class testCar {
    Car car1,car2,car3,car4;

    @Before
    public void setUp()
    {
        car1 = new Car("BMW", "Red", 2015, "CA123");
        car2 = new Car("Audi", "Blue", 2015, "CA456");
    }

    @Test
    public void testInt()
    {
        Assert.assertEquals(2015, car1.getYear());
    }

    @Test
    public void testNullness()
    {
        Assert.assertNull(car3);
    }

    @Test
    public void testNonNullness()
    {
        Assert.assertNotNull(car2);
    }

    @Test
    public void testObEquality()
    {
        Assert.assertEquals(car1.getYear(), car2.getYear());
    }

    @Test
    public void testObIdentity()
    {
        Assert.assertSame(car3, car4);
    }
}
