package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    String message;

    public MoodAnalyzer(String message) {
        super();
        this.message = message;
    }

    public String analyzeMood() throws Exception {

        try {
            if (message == null) {
                throw new MoodAnalyzerException("Message Can't Be Null ", MoodAnalyzerException.ExceptionType.NULL);
            }
            else if (message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        } catch (MoodAnalyzerException e) {
            System.out.println(e);
            return "Happy";
        }
    }
}



