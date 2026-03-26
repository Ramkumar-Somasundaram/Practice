package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Event;
import com.example.demo.repo.eventRepo;

@Service
public class EventService {
	
	@Autowired
	eventRepo events;
	
	public Event addData(Event event)
	{
		return events.save(event);
	}
	
	public Event getData(int id)
	{
		return events.getById(id);
	}
	
	public List<Event> getAll()
	{
		return events.findAll();
	}

}
