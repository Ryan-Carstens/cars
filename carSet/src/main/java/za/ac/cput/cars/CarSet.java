package za.ac.cput.cars;

import java.util.*;

/**
 * Created by student on 2015/02/20.
 */
public class CarSet {

    Set <Car> set1 = new HashSet <Car>();

    public void addStudent(Car a)
    {
        set1.add(a);
    }

    public boolean removeStudent(Car a)
    {
        return set1.remove(a);
    }

    public boolean getStudent(Car a)
    {
        return set1.contains(a);
    }
}
