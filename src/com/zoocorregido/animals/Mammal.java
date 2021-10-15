package com.zoocorregido.animals;

public class Mammal extends Animal{
    public static enum Habits{
        DAYTIME,
        NOCTURNAL
    }

    public static enum Diet{
        HERBIVOROUS,
        CARNIVOROUS,
        OMNIVORE
    }

    private Mammal mammal;
    private Diet diet;
    private float weight;
    private float speed;

    public Mammal(String name, byte age, Gender gender, Mammal mammal, Diet diet, float weight, float speed) {
        super(name, age, gender);
        this.mammal = mammal;
        this.diet = diet;
        this.weight = weight;
        this.speed = speed;
    }
}
