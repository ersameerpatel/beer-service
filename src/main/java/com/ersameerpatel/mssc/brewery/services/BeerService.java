package com.ersameerpatel.mssc.brewery.services;

import com.ersameerpatel.mssc.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

}
