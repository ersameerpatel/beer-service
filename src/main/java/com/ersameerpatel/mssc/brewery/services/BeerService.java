package com.ersameerpatel.mssc.brewery.services;

import com.ersameerpatel.mssc.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
