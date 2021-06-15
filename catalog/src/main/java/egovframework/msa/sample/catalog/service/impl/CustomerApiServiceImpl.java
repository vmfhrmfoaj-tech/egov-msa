package egovframework.msa.sample.catalog.service.impl;

import org.springframework.stereotype.Service;

import egovframework.msa.sample.catalog.service.CustomerApiService;

@Service
public class CustomerApiServiceImpl implements CustomerApiService{

    @Override
    public String getCustomerDetail(String customerId) {
        return customerId;
    }
}
