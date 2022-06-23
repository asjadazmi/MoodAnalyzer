package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerException extends Throwable {
    public enum ExceptionType{
        NULL
    }
    public MoodAnalyzerException(String message, ExceptionType aNull) {
    }
}
