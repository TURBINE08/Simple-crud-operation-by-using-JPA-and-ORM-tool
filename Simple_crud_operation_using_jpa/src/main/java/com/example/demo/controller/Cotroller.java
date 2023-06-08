package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Model;
import com.example.demo.service.Serviceee;

@RestController
public class Cotroller 
{

	@Autowired
	Serviceee ser;
	// posting and update also
	@PostMapping("/send")
	public Model sent(@RequestBody Model model)
	{
		 Model mode = ser.sent(model);
		 return mode;
	}
	
	//-------------------------------------------------------
	
	//geting all element
	@GetMapping("/getall")
	public List<Model> get()
	{
		 List<Model> list = ser.getingall();
		 return list;
	}
	
	//-------------------------------------------------------
	
	//delete by id
	@DeleteMapping("/dlt/{id}")
	public void dltt(@PathVariable int id)
	{
		ser.deletee(id);
	}
	
	//--------------------------------------------------------
	
	//delete all
	@DeleteMapping("/dltall")
	public void dltalll()
	{
		ser.dltall();
	}
	
	//--------------------------------------------------------
	
	@GetMapping("/getbyid/{id}")
	public Model getbyid(@PathVariable int id)
	{
		Model mod = ser.getbyidd(id);
		return mod;
	}
	
}
