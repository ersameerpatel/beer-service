package com.ersameerpatel.mssc.brewery.web.mappers;

import com.ersameerpatel.mssc.brewery.domain.Customer;
import com.ersameerpatel.mssc.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
