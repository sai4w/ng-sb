package com.example.demo.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Plant;
import com.example.demo.Repositories.PlantRepository;


@RestController
@CrossOrigin

public class PlantController {
	@Autowired
    private PlantRepository plantServ;

	
	@RequestMapping(value="/plants", method = RequestMethod.GET)
    public List<Plant> get_Plants(){
       return plantServ.findAll();
	}
   
}
