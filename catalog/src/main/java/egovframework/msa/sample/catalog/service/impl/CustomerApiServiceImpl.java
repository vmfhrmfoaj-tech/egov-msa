package egovframework.msa.sample.catalog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import egovframework.msa.sample.catalog.service.CustomerApiService;

@Service
public class CustomerApiServiceImpl implements CustomerApiService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getCustomerDetail(String customerId) {
        // url call
        return restTemplate.getForObject("http://localhost:8082/customers/" + customerId, String.class);
    }
}
