package com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "customer")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    @Id
    @Column(name = "customer_id", length = 45)
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int customerId;
    @Column(name = "customer_name", length = 100, nullable = false)
    private String customerName;
    @Column(name = "customer_address", length = 150, nullable = false)
    private String customerAddress;
    @Column(name = "customer_salary")
    private String customerSalary;
    @Column(name = "customer_number", length = 11)
    private String customerNumber;
    @Column(name = "nic")
    private String nic;
    @Column(name = "active_state", columnDefinition = "TINYINT default 1")
    private boolean activeState;

}
