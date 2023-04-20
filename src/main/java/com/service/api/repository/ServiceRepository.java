package com.service.api.repository;

import com.service.api.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Services,Integer> {
}
