package com.ersameerpatel.brewery.web.mappers;


import com.ersameerpatel.brewery.domain.Beer;
import com.ersameerpatel.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
