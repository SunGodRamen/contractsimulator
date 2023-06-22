package com.ra.contractsimulator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Calendar;
import java.util.Date;

import com.ra.contractsimulator.model.Contract;

import java.util.List;

@Service
public class ContractKafkaProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ContractService contractService;

    private static final String TOPIC = "contracts";

    private Date currentDate; // Keep track of the current date

    @Scheduled(fixedRate = 60000) // 60000 milliseconds = 1 minute
    public void publishContracts() {
        // Calculate one week ahead from current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        Date oneWeekAhead = calendar.getTime();

        // Fetch contracts within the range
        List<Contract> contractsStarting = contractService.getContractsByStartDate(currentDate, oneWeekAhead);
        List<Contract> contractsEnding = contractService.getContractsByEndDate(currentDate, oneWeekAhead);

        
        // Loop through the contracts starting and publish them to Kafka
        for (Contract contract : contractsStarting) {
            kafkaTemplate.send(TOPIC, convertContractToMessage(contract));
        }

        // Loop through the contracts ending and publish them to Kafka
        for (Contract contract : contractsEnding) {
            kafkaTemplate.send(TOPIC, convertContractToMessage(contract));
        }

        // Increment the current date by 1 day
        currentDate = incrementDate(currentDate);
    }

    private String convertContractToMessage(Contract contract) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Convert the contract object to JSON string
            return objectMapper.writeValueAsString(contract);
        } catch (JsonProcessingException e) {
            // Handle the exception, you might want to log it or throw a custom exception
            e.printStackTrace();
            return null;
        }
    }

    private Date incrementDate(Date date) {
        // Create an instance of Calendar
        Calendar calendar = Calendar.getInstance();
        
        // Set the Calendar's time to the provided date
        calendar.setTime(date);
        
        // Increment the date by 1 day
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        
        // Get the incremented Date from the Calendar
        Date incrementedDate = calendar.getTime();
        
        return incrementedDate;
    }
}
