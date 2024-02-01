package com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.service;

import com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.dto.CustomerDTO;

public interface CustomerService {
    String saveCustomer(CustomerDTO customerDTO);

    String saveCustomer2(CustomerDTO customerDTO);
}
