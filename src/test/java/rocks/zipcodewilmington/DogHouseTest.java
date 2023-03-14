package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDogHouse() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Oreo", new Date(), 22);
        Integer id = 22;
        //When
        dogHouse.add(dog);
        Dog actualDogAdded = dogHouse.getDogById(id);

        //Then
        Assert.assertEquals(dog, actualDogAdded);
    }

        // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeById() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Oreo", new Date(), 22);
        Integer id = dog.getId();
        //When
        dogHouse.add(dog);
        dogHouse.remove(id);
        Dog actualDogRemoved = dogHouse.getDogById(id);

        //Then
        Assert.assertNull(actualDogRemoved);
    }

        // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveByName() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Oreo", new Date(), 22);
        Integer expectedDogRemoved = 0;
        //When
        dogHouse.remove(dog);
        Integer actualDogRemoved = dogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDogRemoved, actualDogRemoved);
    }

        // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById() {
        DogHouse dogHouse = new DogHouse();
        Dog dog2 = new Dog("Oreo", new Date(), 22);
        Integer id = dog2.getId();
        Dog expected = dog2;
            //When
        dogHouse.add(dog2);
        Dog actualDogAdded = dogHouse.getDogById(id);

            //Then
        Assert.assertEquals(expected, actualDogAdded);
    }

        // TODO - Create tests for `Integer getNumberOfDogs()`
        @Test
        public void testGetNumberOfDogs() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Oreo", new Date(), 22);
        Integer expected =0;

        Integer actual = dogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }


//    @Test
//    public void testGetNumberOfDogs () {
//        // Given
//        String name = "Milo";
//        Date birthDate = new Date();
//        Dog animal = AnimalFactory.createDog(name, birthDate);
//        DogHouse.clear();
//
//        // When
//        DogHouse.add(animal);
//
//        // Then
//        DogHouse.getNumberOfDogs();
//    }

}
