package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    @Test
    public void createDog() {
//       Given
        String expectedDog = "Milo";
        Date birthDate = 7;
//        when
        Dog Dog = new Dog();
//        then
        Assert.assertEquals(expected, actual);
    }


//        Integer expectedNumberOfDogs = 1;
//        DogHouse.clear(());
//
//        Dog dog1 = new Dog (null, null, null);
//        DogHouse.add(dog1);
//        Integer actualNumberOfDogs = DogHouse.getNumberOfDogs();
//
//        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
