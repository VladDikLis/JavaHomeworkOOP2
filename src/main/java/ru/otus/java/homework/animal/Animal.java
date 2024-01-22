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

    public void animalInfoCondition() {
        System.out.println("Имя животного: " + name);
        System.out.println("Состояние: " + condition);
        System.out.println();
    }

    public void run(Integer distance) {
        if (Objects.equals(condition, "Устал")) {
            System.out.println(name + " устал");
            return;
        }
        int i = 0;
        int t = 0;
        while (distance > i) {
            i += runningSpeed;
            t++;
            stamina -= 1 * runningSpeed;
            if (stamina < 0) {
                System.out.println(name + " устал и не смог преодолеть дистанцию");
                condition = "Устал";
                t = -1;
                System.out.println("Время: " + t);
                System.out.println();
                return;
            }
        }
        if (stamina >= 0) {
            System.out.println(name + " преодолел дистанцию. Это был забег");
        }
        System.out.println("Время: " + t);
        System.out.println();
    }

    public void swim(Integer distance) {
        if (staminaSwimmingWaste == 0) {
            System.out.println(name + " не умеет плавать");
            System.out.println();
            return;
        }
        if (Objects.equals(condition, "Устал")) {
            System.out.println(name + " устал");
            return;
        }
        int i = 0;
        int t = 0;
        while (distance > i) {
            i += swimmingSpeed;
            t++;
            stamina -= staminaSwimmingWaste * swimmingSpeed;
            if (stamina < 0) {
                System.out.println(name + " устал и не смог преодолеть дистанцию");
                condition = "Устал";
                t = -1;
                System.out.println("Время: " + t);
                System.out.println();
                return;
            }
        }
        if (stamina >= 0) {
            System.out.println(name + " преодолел дистанцию. Это был заплыв");
        }
        System.out.println("Время: " + t);
        System.out.println();
    }
}