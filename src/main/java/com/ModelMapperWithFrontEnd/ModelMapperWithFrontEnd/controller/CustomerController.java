package com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.controller;

import com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.dto.CustomerDTO;
import com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.entity.Customer;
import com.ModelMapperWithFrontEnd.ModelMapperWithFrontEnd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
//@RestController
//@CrossOrigin
//@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @GetMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer",customer);
        return "register";
    }


    @PostMapping(path ="/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
       String msg = customerService.saveCustomer(customerDTO);
       return msg + " saved successfully";

    }
    @PostMapping(path= "/save2")
    public String saveCustomer2(@ModelAttribute("customerDTO") CustomerDTO customerDTO, Model model){
        try {
            String msg = customerService.saveCustomer2(customerDTO);
           Model ms = model.addAttribute("successMessage", msg);
            System.out.println(ms);
            return "redirect:/register";
        }catch (DuplicateKeyException e){
            Model ms = model.addAttribute("errorMessage", "Error: Customer already exists");
            System.out.println(ms);
            return "redirect:/register";
        }


    }
}
