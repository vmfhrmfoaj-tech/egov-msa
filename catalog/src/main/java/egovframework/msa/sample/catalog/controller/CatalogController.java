package egovframework.msa.sample.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.msa.sample.catalog.service.CustomerApiService;

@RestController
@RequestMapping("/catalogs/customerinfo")
public class CatalogController{

    @Autowired
    private CustomerApiService customerApiService;

    @GetMapping(path = "/{customerId}")
    public String getCustomerInfo(@PathVariable String customerId){

        String customerInfo = customerApiService.getCustomerDetail(customerId);
        System.out.println("response customerInfo : " + customerInfo);

        return String.format("[Customer id = %s at %s %s]", customerId, System.currentTimeMillis(), customerInfo);

    }
}