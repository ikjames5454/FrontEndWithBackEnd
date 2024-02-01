package com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerSalary;
    private String customerNumber;
    private String nic;
    private boolean activeState;

}
