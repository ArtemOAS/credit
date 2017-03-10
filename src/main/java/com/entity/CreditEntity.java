package com.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "data_credit")
@NamedQuery(name = "Customer.getdAll", query = "FROM CreditEntity c")
public class CreditEntity implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id ;

    @Column(name = "sum_credit")
    private String sumCredit;

    @Column(name = "period_credit")
    private String periodCredit;

    @Column(name = "bank")
    private String bank;

    public CreditEntity(String sumCredit, String periodCredit, String bank) {
        this.sumCredit = sumCredit;
        this.periodCredit = periodCredit;
        this.bank = bank;
    }

    public CreditEntity(String sumCredit, String periodCredit) {
        this.sumCredit = sumCredit;
        this.periodCredit = periodCredit;
    }

    public CreditEntity() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditEntity that = (CreditEntity) o;

        if (id != that.id) return false;
        if (!sumCredit.equals(that.sumCredit)) return false;
        if (!periodCredit.equals(that.periodCredit)) return false;
        return bank.equals(that.bank);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + sumCredit.hashCode();
        result = 31 * result + periodCredit.hashCode();
        result = 31 * result + bank.hashCode();
        return result;
    }
}
