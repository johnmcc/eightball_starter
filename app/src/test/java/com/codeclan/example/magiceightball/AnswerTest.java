package com.codeclan.example.magiceightball;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/02/2017.
 */

public class AnswerTest {
    ArrayList<String> answers;
    Answer eightball;
    Answer eightball2;

    @Before
    public void before(){
        answers = new ArrayList<String>();
        answers.add("Yes!");
        answers.add("I love my brick!");
        answers.add("That would be an ecumenical matter!");

        eightball = new Answer(answers);
        eightball2 = new Answer();
    }

    @Test
    public void testAnswersSize(){
        assertEquals(3, eightball.getLength());
    }

    @Test
    public void testGetAnswer(){
        assertEquals("Yes!", eightball.getAnswerAtIndex(0));
    }

    @Test
    public void testGetAnswersBack(){
        assertEquals(answers, eightball.getAnswers());
    }

    @Test
    public void testAddAnswerToList(){
        int originalLength = eightball.getLength();
        eightball.addAnswer("Feck off, cup!");
        assertEquals(originalLength+1, eightball.getLength());
    }

    @Test
    public void testDefaultAnswers(){
        assertEquals(3, eightball2.getLength());
    }
}
