package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCatHouse() {
        //Given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Kiki", new Date(), 26);
        Integer id = 26;
        //When
        catHouse.add(cat);
        Cat actualCatAdded = catHouse.getCatById(id);

        //Then
        Assert.assertEquals(cat, actualCatAdded);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeById() {
        //        given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Keanu", new Date(), 30);
        Integer id = cat.getId();
//    when
        catHouse.add(cat);
        catHouse.remove(id);
        Cat actualCatRemoved = catHouse.getCatById(id);
//    then
        Assert.assertNull(actualCatRemoved);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveByName() {
        //        given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Kiki", new Date(), 26);
        Integer expectedCatRemoved= 0;
//    when
        catHouse.remove(cat);
        Integer actualCatRemoved = catHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCatRemoved, actualCatRemoved);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById() {
        CatHouse catHouse = new CatHouse();
        Cat cat2 = new Cat("Kami", new Date(), 26);
        Integer id = cat2.getId();
        Cat expected = cat2;
//    when
        catHouse.add(cat2);
        Cat actualCatAdded = catHouse.getCatById(id);
//    then
        Assert.assertEquals(expected, actualCatAdded);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Kiki", new Date(), 26);
        Integer expected = 0;
//    when
        Integer actual = catHouse.getNumberOfCats();
//    then
        Assert.assertEquals(expected, actual);
    }
}
