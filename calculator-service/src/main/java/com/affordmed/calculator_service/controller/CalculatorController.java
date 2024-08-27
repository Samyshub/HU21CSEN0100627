package com.affordmed.calculator_service.controller;

import com.affordmed.calculator_service.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;


    @GetMapping("{type}")
    public List<Integer> getNumbers(@PathVariable String type){
        List<Integer> list = new ArrayList<>();
        if(type.equalsIgnoreCase("e")){
            //call even number service
             list = calculatorService.generateEvenNumbers();
        } else if (type.equalsIgnoreCase("primes")) {
             list = calculatorService.generatePrimeNumbers();
        } else if (type.equalsIgnoreCase("rand")) {
            list = calculatorService.getRandomNumbers();
        } else if (type.equalsIgnoreCase("fibo")) {
            list = calculatorService.febinoicSeries(10);

        }
        return list;
    }
}
