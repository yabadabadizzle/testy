package com.springjpa.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springjpa.model.Customer;
import com.springjpa.repo.CustomerRepository;

@RestController
public class WebController {
	@Autowired
	CustomerRepository repository;


	@PostMapping("/add")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return repository.save(customer);
	}

	@GetMapping("/getallPlayers")
	public List<Customer> getAll(){
		return repository.findAll();

	}
	@RequestMapping("/findbyid")
	public String findById(@RequestParam("id") long id)
	{
		String result= "";
		result = repository.findById(id).toString();
		return result;
	}
	@RequestMapping("/finbylastname")
	public String fetchDatabyLastName(@RequestParam("lastname") String lastName)
	{
		String result = "";
		for (Customer cust:repository.findByLastName(lastName))
		{
			result+=cust.toString() + "<br>";

		}
		return result;
	}
	@RequestMapping("/deleteAllPlayers")
	public void delete()
	{
		repository.deleteAll();
	}
	@RequestMapping("/deletebyid")

	public void deleteById(@RequestParam("id") long id)
	{
		repository.deleteById(id);
	}


	@RequestMapping("/findall")
	public String findAll(){
		String result = "";

		for(Customer cust : repository.findAll()){
			result += cust.toString() + "<br>";
		}

		return result;
	}





}

