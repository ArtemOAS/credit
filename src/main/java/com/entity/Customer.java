package com.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "data_credit")
@NamedQuery(name = "Customer.getdAll", query = "FROM Customer c")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name = "sum_credit")
    private String sumCredit;

    @Column(name = "period_credit")
    private String periodCredit;

    @Column(name = "bank")
    private String bank;

    public Customer(String sumCredit, String periodCredit, String bank) {
        this.sumCredit = sumCredit;
        this.periodCredit = periodCredit;
        this.bank = bank;
    }

    public Customer(String sumCredit, String periodCredit) {
        this.sumCredit = sumCredit;
        this.periodCredit = periodCredit;
    }

    public Customer() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSumCredit() {
        return sumCredit;
    }

    public void setSumCredit(String sumCredit) {
        this.sumCredit = sumCredit;
    }

    public String getPeriodCredit() {
        return periodCredit;
    }

    public void setPeriodCredit(String periodCredit) {
        this.periodCredit = periodCredit;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
