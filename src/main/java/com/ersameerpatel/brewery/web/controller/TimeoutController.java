package com.ersameerpatel.brewery.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api/v1/timeout")
@RestController
public class TimeoutController {

    @GetMapping("/{isin}")
    public String getIsinValue(@PathVariable("isin") String isin) throws InterruptedException {
        Thread.currentThread().sleep(2000);
        return "true";
    }
}
