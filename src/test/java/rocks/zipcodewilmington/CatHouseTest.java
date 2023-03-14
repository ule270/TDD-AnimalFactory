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
//        given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Kiki", new Date(), 3);
        Integer id = 26;
//    when
        catHouse.add(cat);
        Cat actualCatAdded = catHouse.getCatById(id);
//    then
        Assert.assertEquals(cat, actualCatAdded);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeInteger() {
        //        given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Kiki", new Date(), 3);
        id = 26;
//    when
        catHouse.add(cat);
        Cat actualCatAdded = catHouse.getCatById(id);
//    then
        Assert.assertEquals(cat, actualCatAdded);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCat() {
        //        given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Kiki", new Date(), 3);
        int id = 26;
//    when
        catHouse.add(cat);
        Cat actualCatAdded = catHouse.getCatById(id);
//    then
        Assert.assertEquals(cat, actualCatAdded);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatById() {
    CatHouse catHouse = new CatHouse();
    Cat cat = new Cat("Kiki", new Date(), 3);
    int id = 26;
//    when
        catHouse.add(cat);
    Cat actualCatAdded = catHouse.getCatById(id);
//    then
        Assert.assertEquals(cat, actualCatAdded);
}

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Kiki", new Date(), 3);
        int id = 26;
//    when
        catHouse.add(cat);
        Cat actualCatAdded = catHouse.getCatById(id);
//    then
        Assert.assertEquals(cat, actualCatAdded);
    }
}
