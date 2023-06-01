package com.example.duantt.models;

import java.util.List;

import lombok.Data;


@Data
public class DataEntry {
    private String date;
    private List<ScoreEntry> value;
}
