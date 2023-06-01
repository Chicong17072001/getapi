package com.example.duantt.controllers;

import java.sql.Date;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.duantt.models.ContractData;




@RestController
public class ContractController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    // private ContractService contractService;

    @GetMapping("/score")
     public String getContract() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        // headers.setContentType(MediaType.APPLICATION_JSON);
        ContractData contractData = new ContractData();
        // contractData.setContract(contract);
        // contractData.setDate(date);

        HttpEntity <ContractData> entity = new HttpEntity<ContractData>(contractData,headers);
        
        return restTemplate.exchange("", HttpMethod.GET, entity, String.class).getBody();
     }

}
