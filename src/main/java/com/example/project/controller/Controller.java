package com.example.project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Model;
import com.example.project.service.Detservice;



@RestController
public class Controller {
@Autowired
Detservice bser;
@PostMapping("addbike")
public Model add(@RequestBody Model m) {
	return bser.saveinfo(m);
 }
@GetMapping("showbike")
public List<Model> show(){
	return bser.showinfo();
}
@PutMapping("updatebike")
public Model modify(@RequestBody Model m) {
	return bser.changeinfo(m);
}
@DeleteMapping("del")
public String delinfo(@RequestBody Model m) {
	 bser.deleteinfo(m);
	 return "Deleted successfully";
}
@GetMapping("showqueryyear/{year}")
public List<Model> getstu(@PathVariable int year){
	return bser.getbikeyear(year);
}
@GetMapping("showqueryname/{name}")
public List<Model> getstu(@PathVariable String name){
	return bser.getbikename(name);
}
@GetMapping("showquery/{year}/{name}")
public List<Model> getstu(@PathVariable int year,@PathVariable String name){
	return bser.getinfo(year, name);
}
}
