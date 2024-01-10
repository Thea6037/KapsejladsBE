package com.example.kapsejlads.service.sailracingparticipants;

import com.example.kapsejlads.model.SailRacingParticipant;
import com.example.kapsejlads.model.Sailboat;
import com.example.kapsejlads.repository.SailRacingParticipantsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSailRacingParticipantsImpl implements ServiceSailRacingParticipants
{
    @Autowired
    private SailRacingParticipantsRepo sailRacingParticipantsRepo;

    @Override
    public List<SailRacingParticipant> findAllSailRacings()
    {
        return sailRacingParticipantsRepo.findAll();
    }

    @Override
    public ResponseEntity<SailRacingParticipant> saveSailRacingParticipant(SailRacingParticipant sailRacingParticipant)
    {
        try {
            SailRacingParticipant savedParticipant = sailRacingParticipantsRepo.save(sailRacingParticipant);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedParticipant);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
