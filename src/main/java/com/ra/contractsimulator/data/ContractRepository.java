package com.ra.contractsimulator.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ra.contractsimulator.model.Contract;
import java.util.Date;
import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    List<Contract> findByStartDateBetween(Date startDate, Date endDate);
    List<Contract> findByEndDateBetween(Date startDate, Date endDate);
}
