package com.example.duantt.models;

import java.util.List;

import lombok.Data;

@Data
public class ContractData {
    private String contract;
    private String date;
    private List<DataEntry> data;
    
}


