package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    int expected;

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog() {
//       Given
        AnimalFactory animalFactory = new AnimalFactory();
        Dog newDog = animalFactory.createDog("Miko", new Date(2023,3,14));
        String expectedName = "Miko";
        Date expectedDate = new Date(2023,3,14);
//        when
        String actualName = newDog.getName();
        Date actualDate = newDog.getBirthDate();
//        then
        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualDate,expectedDate);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat() {
//       Given
        AnimalFactory animalFactory = new AnimalFactory();
        Cat newCat = animalFactory.createCat("Lulu", new Date(2023,3,15));
        String expectedName = "Lulu";
        Date expectedDate = new Date(2023,3,15);
//        when
        String actualName = newCat.getName();
        Date actualDate = newCat.getBirthDate();
//        then
        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualDate,
                expectedDate);
    }
}
