package com.zoocorregido.animals;

public class Animal {
    public static enum Gender{
        MALE,
        FEMALE
    }
    private String name;
    private byte age;
    private Gender gender;

    private final String[] nameList = {
        "Pepe", "Juan", "Antonio", "Felipe", "Maxi", "Jose", "Maria", "Juana", "Pepa"
    };

    public Animal(String name, byte age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Animal() {
        this.name = generateRandomName();
        this.age = generateRandomAge();
        this.gender = generateGender();
    }

    private String generateRandomName(){
        return (String) nameList[(int) Math.random() * nameList.length];
    }

    private byte generateRandomAge(){
        return (byte) (Math.random() * 16);
    }

    private Gender generateGender(){
        if (Math.random() < 0.5){
            return Gender.FEMALE;
        } else {
            return Gender.MALE;
        }
    }
}
