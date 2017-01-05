package com.entity.tags;


import javax.persistence.*;
import java.io.Serializable;

//@Entity
//@Table(name = "customer_data")
//@NamedQuery(name = "Customer.getdAll", query = "FROM Customer")
public class Customer implements Serializable {

//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

//    @Column(name = "firstname")
    private String firstName;

//    @Column(name = "patronymic")
    private String patronymic;

//    @Column(name = "lastname")
    private String lastName;

    public Customer(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Customer() {}

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
