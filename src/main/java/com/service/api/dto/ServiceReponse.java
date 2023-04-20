package com.service.api.dto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "services")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class ServiceReponse {
    private int id;
    private String email;
    private String loe;
    private String name;
    private String phone;
}
