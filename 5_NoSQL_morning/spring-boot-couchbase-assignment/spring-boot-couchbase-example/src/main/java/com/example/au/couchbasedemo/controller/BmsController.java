package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Bms; 
import com.example.au.couchbasedemo.repository.BmsRepository;

@RestController
public class BmsController {
	
	@Autowired
	BmsRepository bmsRepository;
	
	@PostMapping("/Bms")
    public Bms addBms(@RequestBody Bms newentry) {
        return bmsRepository.save(newentry);
    }
    
    @GetMapping("/Bms/{id}")
    public Optional<Bms> getBmsById(@PathVariable String id) {
        if (bmsRepository.existsById(id)) {
            return bmsRepository.findById(id);
        } else
            return Optional.empty();
    }
    @GetMapping("/Bms/mn/{moviename}")
    public Bms getBmsByMoviename(@PathVariable String moviename) {
         return bmsRepository.findByMoviename(moviename);
    }
    
    @GetMapping("/Bms/city/{city}")
    public List<Bms> getMoviesByCityName(@PathVariable String city) {
        List<Bms> BookmyshowList = new ArrayList<>();
        bmsRepository.findAll().forEach(Bms -> {
            List<String> showCities = Bms.getCity();
            if (showCities.contains(city)) {
                BookmyshowList.add(Bms);
            }
        });

        return BookmyshowList;
    }
}








































