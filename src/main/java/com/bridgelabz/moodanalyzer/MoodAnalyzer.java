package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        super();
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalyzerException {
        if (message == null) {
            throw new MoodAnalyzerException("Message Can't Be Null");
        } else if (message.equals("")) {
            throw new MoodAnalyzerException("Message Can't Be Empty");
        } else if (message.contains("Sad"))
            return "Sad";
        else
            return "Happy";

    }
}



