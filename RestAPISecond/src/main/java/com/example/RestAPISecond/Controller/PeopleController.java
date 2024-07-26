package com.example.RestAPISecond.Controller;


import com.example.RestAPISecond.Models.Person;
import com.example.RestAPISecond.Services.PeopleService;
import com.example.RestAPISecond.Util.PersonErrorResponse;
import com.example.RestAPISecond.Util.PersonNotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public List<Person> getPeople(){
        return peopleService.findAll();
    }

    @GetMapping("/{id}")
    public Person getOne(@PathVariable long id){
        return  peopleService.findOne(id).orElseThrow(PersonNotFoundExeption::new);
    }

    @ExceptionHandler
    private ResponseEntity<PersonErrorResponse> handleException(PersonNotFoundExeption e) {
        PersonErrorResponse response = new PersonErrorResponse(
                "Person With this id wasn't Found",
                System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
