import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest() {
        Boolean ans = true;
        City city = new City("Edmonton", "AB");
        assertEquals(list.hasCity(city), true);
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Edmonton", "AB");
        list.add(city);
        assertEquals(list.hasCity(city), true);
        list.deleteCity(city);
        assertEquals(list.hasCity(city), false);
    }

}