package com.service.api.controller;

import com.service.api.dto.ServiceReponse;
import com.service.api.service.ViewsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/services")
@RequiredArgsConstructor
public class ServiceController {
    private final ViewsServices viewsServices;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ServiceReponse> getMaidData(){
        return  viewsServices.getMaidData();
    }
}
