package com.example.kapsejlads.service;

import com.example.kapsejlads.model.Sailboat;
import com.example.kapsejlads.repository.SailboatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceSailboatImpl implements ServiceSailboat
{
    @Autowired
    private SailboatRepo sailboatRepo;

    @Override
    public List<Sailboat> findAllSailboats()
    {
        return sailboatRepo.findAll();
    }

    @Override
    public ResponseEntity<Sailboat> saveSailboat(@RequestBody Sailboat sailboat) {
        try {
            Sailboat savedSailboat = sailboatRepo.save(sailboat);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedSailboat);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    public ResponseEntity<Sailboat> findSailboatById(int id, Sailboat sailboat)
    {
        Optional<Sailboat> sailboatOptional = sailboatRepo.findSailboatById(id);
        if(sailboatOptional.isPresent())
        {
            sailboat.setId(id);
            sailboatRepo.save(sailboat);
            return new ResponseEntity<>(sailboat, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new Sailboat(), HttpStatus.NOT_FOUND);
        }


    }

    @Override
    public ResponseEntity<String> deleteSailboat(int id)
    {
        Optional<Sailboat> optionalSailboat = sailboatRepo.findSailboatById(id);
        if(optionalSailboat.isPresent())
        {
            sailboatRepo.deleteById(id);
            return ResponseEntity.ok("Sailboat deleted");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sailboat not found");
        }
    }


}
