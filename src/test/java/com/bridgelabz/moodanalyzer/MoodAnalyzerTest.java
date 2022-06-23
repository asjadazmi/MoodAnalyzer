package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void sadMessage() throws Exception{
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I'm In Sad Mood");
        String mood = moodAnalyser.analyzeMood();
        Assertions.assertEquals("Sad", mood);
    }
    @Test
    public void happyMessage() throws Exception{
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I'm In Any Mood");
        String mood = moodAnalyser.analyzeMood();
        Assertions.assertEquals("Happy", mood);
    }
    @Test
    public void nullMessage() throws Exception{
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood = moodAnalyser.analyzeMood();
        Assertions.assertEquals("Happy", mood);
    }

//
}
