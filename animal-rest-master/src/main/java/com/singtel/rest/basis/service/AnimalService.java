package com.singtel.rest.basis.service;

import com.singtel.java.basis.Animal;

import java.util.List;


public interface AnimalService {
    List<Animal> getAllAnimals();
    List<Animal> getFlyingAnimals();
    List<Animal> getWalkingAnimals();
    List<Animal> getSingingAnimals();
    List<Animal> getSwimmingAnimals();
}
