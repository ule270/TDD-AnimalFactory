package rocks.zipcodewilmington;

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
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
//        given
        Cat cat = new Cat(null, new Date(), 2);

//        when
        String expected = "Kitty";
        cat.setName(expected);
        String actual = cat.getName();

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`

    @Test
    public void testSpeak() {
        //    given
        Cat cat = new Cat("Kiki", new Date(), 2);
        //        when
        String expected = "meow!";
        String actual = cat.speak();
//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testBirthDate() {
//    given
        Cat cat = new Cat("Kiki", new Date(), 2);
        Date expected = new Date(2023, 3, 17);
        //        when
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEatFood() {
    //    given
    Cat cat = new Cat("Kiki", new Date(), 2);
    Integer expected = 1;
    Food food = new Food();
//    when
        cat.eat(food);
    Integer actual = cat.getNumberOfMealsEaten();

//        then
        Assert.assertEquals(expected, actual);
}

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testId() {
//        given
        Cat cat = new Cat("Kiki", new Date(), 2);
        Integer expected = 2;

//        when
        Integer actual = cat.getId();

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance() {
//        given
        Cat cat = new Cat("Kiki", new Date(), 2);
        boolean expected = true;

//        when
        boolean actual = cat instanceof Animal;

//        then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
//        given
        Cat cat = new Cat("Kiki", new Date(), 2);
        boolean expected = true;

//        when
        boolean actual = cat instanceof Mammal;

//        then
        Assert.assertEquals(expected, actual);
    }
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
