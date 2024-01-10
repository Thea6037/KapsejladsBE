package com.example.kapsejlads.repository;

import com.example.kapsejlads.model.Sailboat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SailboatRepo extends JpaRepository<Sailboat, Integer>
{
    List<Sailboat> findAll();
    Optional<Sailboat> findSailboatById(int id);
}
