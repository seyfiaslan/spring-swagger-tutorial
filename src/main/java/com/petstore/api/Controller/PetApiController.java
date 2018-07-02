package com.petstore.api.Controller;

import io.swagger.Controller.PetController;
import io.swagger.Model.Pet;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PetApiController implements PetController {
    @Override
    public List<Pet> getPets() {
        ArrayList<Pet> pets = new ArrayList<Pet>();

        Pet pet = new Pet();
        pet.setId(1);
        pet.setName("Junior");
        pet.setTag("smart");

        pets.add(pet);

        return pets;
    }
}
