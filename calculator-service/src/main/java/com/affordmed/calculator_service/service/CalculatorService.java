package com.affordmed.calculator_service.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

@Service
public class CalculatorService {

    public  List<Integer> generateEvenNumbers(){
        List<Integer> integerList = new ArrayList<>();

        for(int i=0;i<=100;i++){
            if(i % 2 == 0){
                integerList.add(i);
            }
        }
        return integerList;
    }

    public  List<Integer> generatePrimeNumbers(){
        List<Integer> integerList = new ArrayList<>();

        int ct=0,n=0,i=1,j=1;
        while(n<25)
        {
            j=1;
            ct=0;
            while(j<=i)
            {
                if(i%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                integerList.add(i);
                n++;
            }
            i++;
        }
        return  integerList;

    }

    public List<Integer> febinoicSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            integerList.add(firstTerm);
            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
        return integerList;
    }

    public List<Integer>  getRandomNumbers()
    {
        List<Integer> integerList = new ArrayList<>();
       Random random = new Random();
        int i = random.nextInt(100);
         integerList.add(i);
         return  integerList;
    }

}
