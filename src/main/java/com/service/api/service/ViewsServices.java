package com.service.api.service;



import com.service.api.dto.ServiceReponse;
import com.service.api.entity.Services;
import com.service.api.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ViewsServices {

    private final ServiceRepository viewsRepository;

    public List<ServiceReponse> getMaidData(){
        List<Services> viewMaidData = viewsRepository.findAll();
        return viewMaidData.stream().map(data -> mapToViewResponse(data)).toList();
    }

    private ServiceReponse mapToViewResponse(Services services){
        return ServiceReponse.builder()
                .id(services.getId())
                .name(services.getName())
                .email(services.getEmail())
                .loe(services.getLoe())
                .phone(services.getPhone())
                .build();

    }
}
