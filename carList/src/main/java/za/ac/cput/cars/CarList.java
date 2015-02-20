package za.ac.cput.cars;

import java.util.*;
/**
 * Created by student on 2015/02/20.
 */
public class CarList {

    private List <Car> list1 = new ArrayList <Car>();


    public void addCar(Car s)
    {
        list1.add(s);
    }

    public boolean deleteCar(String s)
    {
        for(int i = 0; i < list1.size(); i++)
        {
            if(list1.get(i).getCarID() == s)
            {
                list1.remove(i);
                return true;
            }
        }
        return false;
    }

    public Car getCar(String carID)
    {
        for(int i = 0; i < list1.size(); i++)
        {
            if(list1.get(i).getCarID().equals(carID))
            {
                return list1.get(i);
            }
        }

        return null;
    }

}
