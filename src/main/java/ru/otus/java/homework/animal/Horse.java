package ru.otus.java.homework.animal;

public class Horse extends Animal {

    public Horse(String name, Integer runningSpeed, Integer swimmingSpeed, Integer stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
        this.condition = "Полон сил";
        this.staminaSwimmingWaste = 4;
    }
}