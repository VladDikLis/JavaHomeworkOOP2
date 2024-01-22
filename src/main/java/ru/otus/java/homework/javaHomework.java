package ru.otus.java.homework;

import ru.otus.java.homework.animal.Cat;
import ru.otus.java.homework.animal.Dog;
import ru.otus.java.homework.animal.Horse;

public class javaHomework {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Пушок", 2, 1, 100);
        dog1.animalInfoCondition();
        dog1.run(10);
        dog1.animalInfoCondition();
        dog1.swim(10);
        dog1.swim(100);

        Cat cat1 = new Cat("Мурзик", 1, 0, 50);
        cat1.animalInfoCondition();
        cat1.run(10);
        cat1.animalInfoCondition();
        cat1.swim(10);
        cat1.swim(100);

        Horse horse1 = new Horse("Спирит", 10, 5, 200);
        horse1.animalInfoCondition();
        horse1.run(10);
        horse1.animalInfoCondition();
        horse1.swim(10);
        horse1.swim(100);
    }
}