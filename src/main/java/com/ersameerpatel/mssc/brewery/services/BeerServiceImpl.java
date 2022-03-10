package com.ersameerpatel.mssc.brewery.services;

import com.ersameerpatel.mssc.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerById(UUID beerId) {

        return BeerDto.builder()
                        .id(UUID.randomUUID())
                        .beerName("Brand-X")
                        .beerStyle("Style-X")
                        .build();
    }
}
