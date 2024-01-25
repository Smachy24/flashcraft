package com.example.flashcard;


import com.example.flashcard.models.Game;
import com.example.flashcard.models.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameFactory{

    public static Game Create(ArrayList<Question> questions, String difficulty)
    {
        Collections.shuffle(questions);
        //ArrayList<Question> subset = (ArrayList<Question>) questions.subList(0,4);

        // shuffle answers
        for (Question question : questions)
        {
            Collections.shuffle(question.getAnswers());
        }

        return new Game(questions, difficulty);
    }


    /**
     * Allow simple creation of a game object when the game is a single question (training).
     * @param question A single question for the game.
     * @return A game object ready to be used by an activity
     */
    public static Game Create(Question question, String difficulty)
    {
        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(question);

        return new Game(questions, difficulty);
    }
}
