package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void sadMessage() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I'm In any Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("Sad", mood);
    }

//
}
