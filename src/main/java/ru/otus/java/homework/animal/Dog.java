package ru.otus.java.homework.animal;

import ru.otus.java.homework.animal.Animal;

public class Dog extends Animal {

    public Dog(String name, Integer runningSpeed, Integer swimmingSpeed, Integer stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
        this.condition = "Полон сил";
        this.staminaSwimmingWaste = 2;
    }
}

