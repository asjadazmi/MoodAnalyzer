package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void sadMessage() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I'm In Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Sad", mood);
    }
    @Test
    public void nullMessage() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }
    @Test
    public void happyMessage() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I'm In Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Happy", mood);
    }

//
}
