package com.repository;

import com.domain.admin.SchoolDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDetailsRepository extends JpaRepository<SchoolDetails, String> {
}
