package za.ac.cput.cars;

import java.util.*;
/**
 * Created by student on 2015/02/20.
 */
public class CarMap {

    private Map<String, Car> map1 = new HashMap<String,Car>();

    public void addCar(String carID, Car a)
    {
        map1.put(carID, a);
    }

    public void deleteCar(String carID)
    {
        map1.remove(carID);
    }
    public boolean getCar(String carID)
    {
        return map1.containsKey(carID);
    }

}
