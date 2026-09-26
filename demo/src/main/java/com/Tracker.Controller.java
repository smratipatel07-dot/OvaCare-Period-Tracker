package com.example.demo;

import  org.springframework.web.bind.annotation.*;
import  java.time.LocalDate;
import  java.util.HashMap;
import  java.util.Map;

@RestController
@requestMapping("/api")
public class TrackerController{
@PostMapping("/predict")
public Map<String, String> predictPeriod(@RequestBody Map<String, Object> payload) { 
    String startDateStr = (String) payload.get(" startDate");
    int cycleLength = Integer. parseInt(payload.get("cycleLenght").toString());

    LocalDate lastPeriodStart = LocalDate.parse(startDateStr);

    LocalDate nextPeriod = lastPeriodStart.plusdays(cycleLength);
    LocalDate ovulation = nextPeriod.minusDays(14);
    LocalDate fertileStart = ovulation.minusDays(5);
    LocalDate fertileEnd = ovulation.plusDays(1);

    Map<string, String> result = new HashMap<>();
    result.put("nextPeriod", nextPeriod.toString());
    result.put("fertileWindow", fertileStart + " to " + fertileEnd);

    return result;
    } 
}