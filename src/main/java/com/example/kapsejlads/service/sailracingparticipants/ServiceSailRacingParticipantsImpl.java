package com.example.kapsejlads.service.sailracingparticipants;

import com.example.kapsejlads.model.SailRacingParticipant;
import com.example.kapsejlads.repository.SailRacingParticipantsRepo;
import org.springframework.beans.factory.annotation.Autowired;
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
}
