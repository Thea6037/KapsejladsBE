package com.example.kapsejlads.service.sailboat;

import com.example.kapsejlads.model.Sailboat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface ServiceSailboat
{
    List<Sailboat> findAllSailboats();
    ResponseEntity<Sailboat> saveSailboat(Sailboat sailboat);

    ResponseEntity<Sailboat> findSailboatById(int id, Sailboat sailboat);

    ResponseEntity<String> deleteSailboat(int id);
}
