package com.ersameerpatel.mssc.brewery.web.mappers;


import com.ersameerpatel.mssc.brewery.domain.Beer;
import com.ersameerpatel.mssc.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
