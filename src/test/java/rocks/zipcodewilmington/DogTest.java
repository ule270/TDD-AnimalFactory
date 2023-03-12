package rocks.zipcodewilmington;

import com.google.inject.internal.Errors;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Errors eatenMeals;

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void getBirthDate() {

        Integer expected = 7;

        Dog dog = new Dog(expected);

        Integer actual = dog.getBirthDate();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void speak() {
        String expected = "bark!";

        Dog dog = new Dog(expected);

        String actual = dog.speak();
        Assert.assertArrayEquals(new String[]{expected}, actual);
    }

    @Test
    public void EatFood() {
        Integer eatenMeals;
        eatenMeals.size();


    }

    @Test
    public void GetId() {
        Integer expected = 123;
        Dog dog = new Dog();

        dog.getId(expected);

        Integer actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }
}
