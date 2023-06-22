package com.ra.contractsimulator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ra.contractsimulator.data.ContractRepository;
import com.ra.contractsimulator.model.Contract;
import java.util.Date;
import java.util.List;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;
    
    public List<Contract> getContractsByStartDate(Date startDate, Date endDate) {
        // Fetch contracts by start date in the given range
        return contractRepository.findByStartDateBetween(startDate, endDate);
    }
    
    public List<Contract> getContractsByEndDate(Date startDate, Date endDate) {
        // Fetch contracts by end date in the given range
        return contractRepository.findByEndDateBetween(startDate, endDate);
    }
    
}
