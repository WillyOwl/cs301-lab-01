package com.example.petshop;

import java.util.Date;

public class Parrot extends Pet {

    public Parrot(String name) {
        super(name);
    }

    public Parrot(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() {
        return "Polly wants a cracker";
    }
}
