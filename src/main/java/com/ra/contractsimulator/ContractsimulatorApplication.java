package com.ra.contractsimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ContractsimulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContractsimulatorApplication.class, args);
    }

}
