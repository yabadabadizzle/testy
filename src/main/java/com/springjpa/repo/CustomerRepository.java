package com.springjpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springjpa.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
List <Customer> findByLastName (String lastname);
}
