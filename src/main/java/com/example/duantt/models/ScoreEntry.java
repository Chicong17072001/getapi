package com.example.duantt.models;

import java.util.List;

import lombok.Data;



@Data
public class ScoreEntry {
    private String id;
    private String type;
    private int score;
    private List<ScoreData> data;
}
