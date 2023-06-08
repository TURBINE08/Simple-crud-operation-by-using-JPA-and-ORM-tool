package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Model;

public interface Repositoryee extends CrudRepository<Model, Integer>
{
	Model findById(int id);
}
