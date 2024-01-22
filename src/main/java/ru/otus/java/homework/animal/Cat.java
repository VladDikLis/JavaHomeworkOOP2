package ru.otus.java.homework.animal;

public class Cat extends Animal {

    public Cat(String name, Integer runningSpeed, Integer swimmingSpeed, Integer stamina) {
        super(name, runningSpeed, swimmingSpeed, stamina);
        this.condition = "Полон сил";
        this.staminaSwimmingWaste = 0;
    }
}
