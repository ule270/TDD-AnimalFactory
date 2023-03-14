package rocks.zipcodewilmington;

import com.google.inject.internal.Errors;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Errors eatenMeals;

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testNewDog() {
//        given
        Dog dog = new Dog(null, new Date(), 1);
        String name = "Oreo";
        String expected = "Buddy";
//        when
        dog.setName(expected);
        String actual = dog.getName();

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testBirthDate() {
//        given
        Dog dog = new Dog("Oreo", new Date(), 1);
        Date expected = new Date(2023, 3, 8);

//        then
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
//        given
        String expected = "bark!";
        Dog dog = new Dog("Oreo", new Date(), 1);

//        when
        String actual = dog.speak();
//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEatFood() {
//        given
        Dog dog = new Dog("Oreo", new Date(), 1);
        Integer expected =1;
        Food food = new Food();

//        when
        dog.eat(food);
        Integer actual = dog.getNumberOfMealsEaten();

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testId() {
//        given
        Dog dog = new Dog("Oreo", new Date(), 1);
        Integer expected = 1;

//        when
        Integer actual = dog.getId();

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance() {
//        given
        Dog dog = new Dog("Oreo", new Date(), 1);
        boolean expected = true;

//        when
        boolean actual = dog instanceof Animal;

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
//        given
        Dog dog = new Dog("Oreo", new Date(), 1);
        boolean expected = true;

//        when
        boolean actual = dog instanceof Mammal;

//        then
        Assert.assertEquals(expected, actual);
    }
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
}