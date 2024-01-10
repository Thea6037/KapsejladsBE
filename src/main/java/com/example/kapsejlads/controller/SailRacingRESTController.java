package com.example.kapsejlads.controller;

import com.example.kapsejlads.model.SailRacingParticipant;
import com.example.kapsejlads.service.sailracingparticipants.ServiceSailRacingParticipants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SailRacingRESTController
{
    @Autowired
    private ServiceSailRacingParticipants serviceSailRacingParticipants;

    @GetMapping("/allsailracingparticipants")
    public List<SailRacingParticipant> getAllSailRacing()
    {
        return serviceSailRacingParticipants.findAllSailRacings();
    }

/*
    @PostMapping("/newsailboat")
    public ResponseEntity<SailRacingParticipant> createSailRacingParticipant(@RequestBody SailRacingParticipant sailRacingParticipant)
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
    }*/
}
