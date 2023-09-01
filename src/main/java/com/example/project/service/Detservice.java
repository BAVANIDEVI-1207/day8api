package com.example.project.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Model;
import com.example.project.repository.Repository;


@Service
public class Detservice {
@Autowired
Repository reb;
public Model saveinfo (Model m){
	   return reb.save(m);
}
public List<Model> showinfo(){
	   return reb.findAll();
}
public Model changeinfo(Model m) {
	   return reb.saveAndFlush(m);
}
public void deleteinfo(Model m) {
	   reb.delete(m);
}
public List<Model> getbikeyear(int year){
	   return reb.getBikeinfoyear(year);
}
public List<Model> getbikename(String s){
	   return reb.getBikename(s);
}
public List<Model> getinfo(int id,String s){
	   return reb.getBikeinfo(id,s);
}
}

