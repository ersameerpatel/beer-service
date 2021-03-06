package com.ersameerpatel.mssc.brewery.repositories;

import com.ersameerpatel.mssc.brewery.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
