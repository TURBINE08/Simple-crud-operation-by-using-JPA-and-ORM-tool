package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Model;
import com.example.demo.repository.Repositoryee;

@Service
public class Serviceee
{

	@Autowired
	Repositoryee repo;
	public Model sent(Model model)
	{
		return repo.save(model) ;
	}
	//----------------------------------------------
	
	public List<Model> getingall() 
	{
		return (List<Model>)repo.findAll();
	}
	//----------------------------------------------
	
	public void deletee(int id) 
	{
		repo.deleteById(id);
	}

	//----------------------------------------------
	
	public void dltall() 
	{
		
		repo.deleteAll();
		
	}

	//-----------------------------------------------
	
	public Model getbyidd(int id) 
	{
		return repo.findById(id); 
		
	}
	 
}
