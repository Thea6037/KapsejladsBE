package com.example.kapsejlads.service.sailracingparticipants;

import com.example.kapsejlads.model.SailRacingParticipant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceSailRacingParticipants
{
    List<SailRacingParticipant> findAllSailRacings();
}
