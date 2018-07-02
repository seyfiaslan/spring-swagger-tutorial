package io.swagger.Controller;

import io.swagger.Model.Pet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface PetController {
    @RequestMapping(
            value = "/api/pets",
            produces = {"application/json"},
            method = RequestMethod.GET
    )
    public List<Pet> getPets();
}