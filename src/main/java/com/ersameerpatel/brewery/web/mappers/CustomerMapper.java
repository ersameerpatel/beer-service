package com.ersameerpatel.brewery.web.mappers;

import com.ersameerpatel.brewery.domain.Customer;
import com.ersameerpatel.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
