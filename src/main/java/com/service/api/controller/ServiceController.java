package com.service.api.controller;

import com.service.api.dto.ServiceReponse;
import com.service.api.service.ViewsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
@CrossOrigin(origins = "https://corsproxy-1m4k.onrender.com/proxy",allowCredentials="true")
@RequiredArgsConstructor
public class ServiceController {
    private final ViewsServices viewsServices;

    @GetMapping("/services")
    @ResponseStatus(HttpStatus.OK)
    public List<ServiceReponse> getMaidData(){
        return  viewsServices.getMaidData();
    }
}
