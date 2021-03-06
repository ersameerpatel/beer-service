package com.ersameerpatel.mssc.brewery.services;

import com.ersameerpatel.mssc.brewery.domain.Beer;
import com.ersameerpatel.mssc.brewery.repositories.BeerRepository;
import com.ersameerpatel.mssc.brewery.web.mappers.BeerMapper;
import com.ersameerpatel.mssc.brewery.web.model.BeerDto;
import com.ersameerpatel.mssc.brewery.web.model.BeerStyleEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service("beerService")
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getBeerById(UUID beerId) {

        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);
        return beerMapper.beerToBeerDto(beer);
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        Beer beer = beerRepository.save(beerMapper.beerDtoToBeer(beerDto));
        return beerMapper.beerToBeerDto(beer);
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {

        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc().toString());

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }
}
