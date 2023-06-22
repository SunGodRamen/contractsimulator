package com.ra.contractsimulator.model;

import javax.persistence.*;

import com.ra.contractsimulator.model.ContractAmounts;
import com.ra.contractsimulator.model.ITTower;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "IT_Contracts")
public class Contract {
    
    @Id
    @Column(name = "Contract_No")
    private String contractNo;

    @Column(name = "Agency_Number")
    private String agencyNumber;

    @Column(name = "Agency_Name")
    private String agencyName;

    @Column(name = "Contractor_Name")
    private String contractorName;

    @Column(name = "Contractor_Name_DBA")
    private String contractorNameDBA;

    @Column(name = "Cooperative_Purchase")
    private boolean cooperativePurchase;

    @Column(name = "Cooperative_Name")
    private String cooperativeName;

    @Column(name = "Purchased_Through_DES_Statewide_Contract")
    private boolean purchasedThroughDESStatewideContract;

    @Column(name = "Contract_Start_Date")
    private Date contractStartDate;

    @Column(name = "Contract_End_Date")
    private Date contractEndDate;

    @Column(name = "Contract_Date_Explanation")
    private String contractDateExplanation;

    @Embedded
    private ITTower itTower;

    @Column(name = "Other_Non_IT")
    private int otherNonIT;

    @Column(name = "Total_Percentage")
    private BigDecimal totalPercentage;

    @Column(name = "Agency_Number")
    public String getAgencyNumber() {
        return agencyNumber;
    }

    @Embedded
    private ContractAmounts contractAmounts;

    public void setAgencyNumber(String agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    @Column(name = "Agency_Name")
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Id
    @Column(name = "Contract_No")
    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    @Column(name = "Contractor_Name")
    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
    }

    @Column(name = "Contractor_Name_DBA")
    public String getContractorNameDBA() {
        return contractorNameDBA;
    }

    public void setContractorNameDBA(String contractorNameDBA) {
        this.contractorNameDBA = contractorNameDBA;
    }

    @Column(name = "Cooperative_Purchase")
    public boolean isCooperativePurchase() {
        return cooperativePurchase;
    }

    public void setCooperativePurchase(boolean cooperativePurchase) {
        this.cooperativePurchase = cooperativePurchase;
    }

    @Column(name = "Cooperative_Name")
    public String getCooperativeName() {
        return cooperativeName;
    }

    public void setCooperativeName(String cooperativeName) {
        this.cooperativeName = cooperativeName;
    }

    @Column(name = "Purchased_Through_DES_Statewide_Contract")
    public boolean isPurchasedThroughDESStatewideContract() {
        return purchasedThroughDESStatewideContract;
    }

    public void setPurchasedThroughDESStatewideContract(boolean purchasedThroughDESStatewideContract) {
        this.purchasedThroughDESStatewideContract = purchasedThroughDESStatewideContract;
    }

    @Column(name = "Contract_Start_Date")
    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    @Column(name = "Contract_End_Date")
    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    @Column(name = "Contract_Date_Explanation")
    public String getContractDateExplanation() {
        return contractDateExplanation;
    }

    public void setContractDateExplanation(String contractDateExplanation) {
        this.contractDateExplanation = contractDateExplanation;
    }

    @Column(name = "Other_Non_IT")
    public int getOtherNonIT() {
        return otherNonIT;
    }

    public void setOtherNonIT(int otherNonIT) {
        this.otherNonIT = otherNonIT;
    }

    @Column(name = "Total_Percentage")
    public BigDecimal getTotalPercentage() {
        return totalPercentage;
    }

    public void setTotalPercentage(BigDecimal totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

}
