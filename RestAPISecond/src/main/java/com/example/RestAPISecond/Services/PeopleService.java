package com.example.RestAPISecond.Services;

import com.example.RestAPISecond.Models.Person;
import com.example.RestAPISecond.REPOSITORIES.PeopleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class PeopleService {
    @Autowired
    PeopleRepository peopleRepository;

    public List<Person> findAll(){
        return peopleRepository.findAll();
    }
    public Optional<Person> findOne(Long id){
        return peopleRepository.findById(id);
    }
}
