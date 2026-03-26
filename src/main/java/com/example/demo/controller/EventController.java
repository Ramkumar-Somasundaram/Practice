package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Event;
import com.example.demo.service.EventService;

@RequestMapping("/event")
@RestController
@CrossOrigin(origins="http://localhost:3001")
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@PostMapping("/add")
	public Event add(@RequestBody Event data)
	{
		return eventService.addData(data);
		
	}
	
	@GetMapping("{id}")
	public Event get(@PathVariable int id)
	{
		return eventService.getData(id);
	}
	@GetMapping()
	public List<Event> getAll()
	{
	   return eventService.getAll();
	}

}
