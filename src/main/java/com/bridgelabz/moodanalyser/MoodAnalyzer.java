package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {
    public String analyseMood(String message) {

        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}

