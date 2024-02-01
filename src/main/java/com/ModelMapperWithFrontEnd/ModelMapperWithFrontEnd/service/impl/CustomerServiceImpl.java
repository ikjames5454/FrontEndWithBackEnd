package com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.service.impl;

import com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.dto.CustomerDTO;
import com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.entity.Customer;
import com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.repo.CustomerRepo;
import com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setCustomerId(customerDTO.getCustomerId());
        customer.setCustomerName(customerDTO.getCustomerName());
        customer.setCustomerAddress(customerDTO.getCustomerAddress());
        customer.setCustomerSalary(customerDTO.getCustomerSalary());
        customer.setCustomerNumber(customerDTO.getCustomerNumber());
        customer.setNic(customerDTO.getNic());
        customer.setActiveState(customerDTO.isActiveState());
        customerRepo.save(customer);
        return customer.getCustomerName();

    }

    @Override
    public String saveCustomer2(CustomerDTO customerDTO) {
        if (!customerRepo.existsById(customerDTO.getCustomerId())){
            Customer customer = modelMapper.map(customerDTO,Customer.class);
            customerRepo.save(customer);
            return "saved successfully";
        }else {
            throw new DuplicateKeyException("Already Added by id");
        }

    }
}
