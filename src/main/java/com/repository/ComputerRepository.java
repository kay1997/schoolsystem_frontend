package com.repository;

import com.domain.equipment.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, String> {
}
