package com.ersameerpatel.brewery.services;

import com.ersameerpatel.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID customerId) {

       log.info("Getting customer with id " + customerId);
       return CustomerDto.builder()
                    .id(UUID.randomUUID())
                    .name("sameer patel")
                    .build();
    }

    @Override
    public CustomerDto saveNewCustomer() {

        log.info("Saving new customer with id ");
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Allen Watts")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

        log.info("Updating customer with id " + customerId);
        //TODO impl - would add a real impl to update CUSTOMER
    }

    @Override
    public void deleteCustomer(UUID customerId) {

        log.info("Deleting customer with id " + customerId);
        // TODO : delete the customer
    }
}
