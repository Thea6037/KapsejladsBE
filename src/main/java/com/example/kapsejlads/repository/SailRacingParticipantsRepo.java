package com.example.kapsejlads.repository;

import com.example.kapsejlads.model.SailRacingParticipant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SailRacingParticipantsRepo extends JpaRepository<SailRacingParticipant, Integer>
{
}
