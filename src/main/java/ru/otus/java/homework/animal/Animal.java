package ru.otus.java.homework.animal;

import java.util.Objects;

public class Animal {
    String name;
    Integer runningSpeed;
    Integer swimmingSpeed;
    Integer stamina;
    Integer staminaSwimmingWaste;
    String condition;

    public Animal(String name, Integer runningSpeed, Integer swimmingSpeed, Integer stamina) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.stamina = stamina;
    }


}