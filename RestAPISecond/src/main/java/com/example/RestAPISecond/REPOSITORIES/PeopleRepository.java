package com.example.RestAPISecond.REPOSITORIES;

import com.example.RestAPISecond.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<Person, Long> {
}
