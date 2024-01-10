package com.example.kapsejlads.controller;

import com.example.kapsejlads.model.Sailboat;
import com.example.kapsejlads.repository.SailboatRepo;
import com.example.kapsejlads.service.ServiceSailboat;
import com.example.kapsejlads.service.ServiceSailboatImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class RESTController
{

    @Autowired
    private ServiceSailboat serviceSailboat;

    @GetMapping("/allboats")
    public List<Sailboat> getAllBoats()
    {
        return serviceSailboat.findAllSailboats();
    }

    @PostMapping("/newsailboat")
    public ResponseEntity<Sailboat> createOneSailboat(@RequestBody Sailboat sailboat)
    {
        return serviceSailboat.saveSailboat(sailboat);
    }

    @PutMapping("/sailboat/{id}")
    public ResponseEntity<Sailboat> updateSailboat(@PathVariable int id, @RequestBody Sailboat sailboat)
    {
        return serviceSailboat.findSailboatById(id, sailboat);
    }

    @DeleteMapping("/sailboat/{id}")
    public ResponseEntity<String> deleteSailboat(@PathVariable int id)
    {
        return serviceSailboat.deleteSailboat(id);
    }
}
