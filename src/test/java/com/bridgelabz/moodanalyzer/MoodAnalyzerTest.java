package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void sadMessage() throws Exception, MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I'm In Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("Sad", mood);
    }
    @Test
    public void happyMessage() throws Exception, MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I'm In Any Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("Happy", mood);
    }

//
}
