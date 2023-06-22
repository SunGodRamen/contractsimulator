package com.ra.contractsimulator.model;

import javax.persistence.*;

@Embeddable
public class ITTower {
    @Column(name = "IT_Tower_Application")
    private int itTowerApplication;

    @Column(name = "IT_Tower_Compute")
    private int itTowerCompute;

    @Column(name = "IT_Tower_Data_Center")
    private int itTowerDataCenter;

    @Column(name = "IT_Tower_Delivery")
    private int itTowerDelivery;

    @Column(name = "IT_Tower_End_User")
    private int itTowerEndUser;

    @Column(name = "IT_Tower_IT_Management")
    private int itTowerITManagement;

    @Column(name = "IT_Tower_Network")
    private int itTowerNetwork;

    @Column(name = "IT_Tower_Output")
    private int itTowerOutput;

    @Column(name = "IT_Tower_Platform")
    private int itTowerPlatform;

    @Column(name = "IT_Tower_Security")
    private int itTowerSecurity;

    @Column(name = "IT_Tower_Storage")
    private int itTowerStorage;
    
    @Column(name = "IT_Tower_Compute")
    public int getItTowerCompute() {
        return itTowerCompute;
    }

    public void setItTowerCompute(int itTowerCompute) {
        this.itTowerCompute = itTowerCompute;
    }

    @Column(name = "IT_Tower_Data_Center")
    public int getItTowerDataCenter() {
        return itTowerDataCenter;
    }

    public void setItTowerDataCenter(int itTowerDataCenter) {
        this.itTowerDataCenter = itTowerDataCenter;
    }

    @Column(name = "IT_Tower_Delivery")
    public int getItTowerDelivery() {
        return itTowerDelivery;
    }

    public void setItTowerDelivery(int itTowerDelivery) {
        this.itTowerDelivery = itTowerDelivery;
    }

    @Column(name = "IT_Tower_End_User")
    public int getItTowerEndUser() {
        return itTowerEndUser;
    }

    public void setItTowerEndUser(int itTowerEndUser) {
        this.itTowerEndUser = itTowerEndUser;
    }
    
    @Column(name = "IT_Tower_IT_Management")
    public int getItTowerITManagement() {
        return itTowerITManagement;
    }

    public void setItTowerITManagement(int itTowerITManagement) {
        this.itTowerITManagement = itTowerITManagement;
    }

    @Column(name = "IT_Tower_Network")
    public int getItTowerNetwork() {
        return itTowerNetwork;
    }

    public void setItTowerNetwork(int itTowerNetwork) {
        this.itTowerNetwork = itTowerNetwork;
    }

    @Column(name = "IT_Tower_Output")
    public int getItTowerOutput() {
        return itTowerOutput;
    }

    public void setItTowerOutput(int itTowerOutput) {
        this.itTowerOutput = itTowerOutput;
    }

    @Column(name = "IT_Tower_Platform")
    public int getItTowerPlatform() {
        return itTowerPlatform;
    }

    public void setItTowerPlatform(int itTowerPlatform) {
        this.itTowerPlatform = itTowerPlatform;
    }

    @Column(name = "IT_Tower_Security")
    public int getItTowerSecurity() {
        return itTowerSecurity;
    }

    public void setItTowerSecurity(int itTowerSecurity) {
        this.itTowerSecurity = itTowerSecurity;
    }

    @Column(name = "IT_Tower_Storage")
    public int getItTowerStorage() {
        return itTowerStorage;
    }

    public void setItTowerStorage(int itTowerStorage) {
        this.itTowerStorage = itTowerStorage;
    }

}
