package com.example.marketting_backend_service.repository;

import com.example.marketting_backend_service.entity.Leads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeadsRepository extends JpaRepository<Leads, Long> {
}
