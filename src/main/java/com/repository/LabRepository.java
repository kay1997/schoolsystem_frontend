package com.repository;

import com.domain.infrastructure.Lab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepository extends JpaRepository<Lab, String> {
}
