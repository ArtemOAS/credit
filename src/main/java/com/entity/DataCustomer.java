package com.entity;

import com.sun.xml.internal.ws.developer.Serialization;

public class DataCustomer {

    @Serialization
    private String sumCreditClient;

    @Serialization
    private String periodCreditClient;

    public String getSumCreditClient(){
        return this.sumCreditClient;
    }

    public void setSumCreditClient(String sumCreditClient){
        this.sumCreditClient = sumCreditClient;
    }

    public String getPeriodCreditClient(){
        return this.periodCreditClient;
    }

    public void setPeriodCreditClient(String periodCreditClient){
        this.periodCreditClient = periodCreditClient;
    }

}
