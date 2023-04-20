package com.service.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "services")
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Services {
    @Id
    private int id;
    private String email;
    private String loe;
    private String name;
    private String phone;
}
