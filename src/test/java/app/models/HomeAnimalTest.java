package app.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeAnimalTest {

    HomeAnimal animal;

    @BeforeEach
    void setUp() {
        animal = new HomeAnimal("Cat", "Tom", 4, true);
    }

    @AfterEach
    void tearDown() {
        animal = null;
    }

    @Test
    void getAnimalType() {
//       HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        assertEquals("Cat", animal.getAnimalType());
    }

    @Test
    void setAnimalType() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        animal.setAnimalType("Super cat");
        assertEquals("Super cat", animal.getAnimalType());
    }

    @Test
    void getBarkIfEmpty() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        assertEquals ("Tom" , animal.getBark());
    }

    @Test
    void setBarkIfExist() {
        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        animal.setBark("Matroskin");
        assertEquals("Matroskin", animal.getBark());
    }

    @Test
    void getAge() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        assertEquals(4, animal.getAge());
    }

    @Test
    void setAge() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        animal.setAge(5);
        assertEquals(5, animal.getAge());
    }

    @Test
    void isSex() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        assertTrue(animal.isSex());
    }

    @Test
    void setSex() {
//        HomeAnimal animal = new HomeAnimal("Cat", "Tom", 4, true);
        animal.setSex(false);
        assertFalse(animal.isSex());
    }
}