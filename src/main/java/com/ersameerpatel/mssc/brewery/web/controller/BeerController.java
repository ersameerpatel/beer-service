package com.ersameerpatel.mssc.brewery.web.controller;

import com.ersameerpatel.mssc.brewery.services.BeerService;
import com.ersameerpatel.mssc.brewery.web.model.BeerDto;
import com.ersameerpatel.mssc.brewery.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    //private final BeerService beerService;

    public BeerController() {
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //todo :: real implementation
        return new ResponseEntity<>(BeerDto.builder().id(beerId).beerName("MyBeer").beerStyle(BeerStyleEnum.LARGE).build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Valid @RequestBody BeerDto beerDto){
        //todo :: real implementation
        log.info("called saveNewBeer");

        HttpHeaders headers = new HttpHeaders();
        //todo add hostname to url
        headers.add("Location", "/api/v1/beer/" + UUID.randomUUID().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
        //return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDto beerDto){
        //todo :: real implementation

        HttpHeaders headers = new HttpHeaders();
        //todo add hostname to url
        headers.add("Location", "/api/v1/beer/" + UUID.randomUUID().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
        //return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeerById(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException exception){

        List<String> errorList = new ArrayList<>(exception.getConstraintViolations().size());

        exception.getConstraintViolations().forEach(constraintViolation -> {
            errorList.add(constraintViolation.getPropertyPath() + " : " + constraintViolation.getMessage());
        });

       return  new ResponseEntity(errorList, HttpStatus.NO_CONTENT );
    }
}
