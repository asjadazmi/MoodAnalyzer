package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        super();
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("Sad")) {
        }

        return "Sad";
    }


}
