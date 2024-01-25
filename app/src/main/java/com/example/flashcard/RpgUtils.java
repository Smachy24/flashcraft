package com.example.flashcard;

import com.example.flashcard.models.RpgAnswer;
import com.example.flashcard.models.RpgQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RpgUtils {
    public static ArrayList<RpgQuestion> baseQuestions = new ArrayList<>();

    //private static final ArrayList<RpgAnswer> answers1 = (ArrayList<RpgAnswer>) List.of(
    //        new RpgAnswer(
    //                "Tu prends tout pour toi, après tout, c'est la survie",
    //                -5, 0, 1, 0,
    //                1, 0, 0, 0
    //        ),
    //        new RpgAnswer(
    //                "Tu prends seulement ce dont tu as besoin",
    //                5, 0, 0, 5,
    //                0, 1, 0, 0
    //        )
    //);


    private static final ArrayList<RpgAnswer> baseQuestion1Answers = new ArrayList<RpgAnswer>() {{
        add(new RpgAnswer(
                "Tu prends tout pour toi, après tout, c'est la survie",
                -5, 0, 1, 0,
                1, 0, 0, 0
        ));
        add(new RpgAnswer(
                "Tu prends seulement ce dont tu as besoin",
                5, 0, 0, 5,
                0, 1, 0, 0
        ));
        add(new RpgAnswer(
                "Tu laisses tout tel quel, espérant que les propriétaires reviendront ",
                0, -5, 0, -5,
                0, 1, 0, 0
        ));
    }};

    private static final ArrayList<RpgAnswer> baseQuestion2Answers = new ArrayList<RpgAnswer>() {{
        add(new RpgAnswer(
                "Tu respectes les villageois et cherches des diamants ailleurs",
                +5, 0, -5, 0,
                0, 0, 0, 2
        ));
        add(new RpgAnswer(
                "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                -5, 0, +5, +10,
                5, 0, 0, 0
        ));
        add(new RpgAnswer(
                "Tu essaies de négocier avec eux pour partager les ressources",
                +1, 0, 0, -1,
                2, 0, 0, 0
        ));
    }};


    public static ArrayList<RpgQuestion> getBaseQuestions()
    {
        // new base question
        //ArrayList<RpgQuestion> baseQuestions = new ArrayList<>();
        ArrayList<RpgAnswer> answersBaseQuestion1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu prends tout pour toi, après tout, c'est la survie",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu prends seulement ce dont tu as besoin",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu laisses tout tel quel, espérant que les propriétaires reviendront ",
                    0, -5, 0, -5,
                    0, 1, 0, 0
            ));
        }};

        baseQuestions.add(
            new RpgQuestion(
                    "Le village",
                    "Tu trouves un village abandonné avec des coffres remplis de provisions. Que fais-tu ?",
                    "La survie peut être difficile, mais l'empathie envers les autres est essentielle pour préserver notre humanité.",
                    answersBaseQuestion1));


        // new base question
        ArrayList<RpgAnswer> answersBaseQuestion2 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu respectes les villageois et cherches des diamants ailleurs",
                    +5, 0, -5, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    -5, 0, +5, +10,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    +1, 0, 0, -1,
                    2, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Le pouvoir de la camaraderie",
                        "Un compagnon joueur est en difficulté et demande ton aide. Comment réagis-tu ?",
                        "L'amitié et l'altruisme sont des éléments clés dans la construction d'une communauté forte.",
                        answersBaseQuestion2));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        baseQuestions.add(
                new RpgQuestion(
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        Collections.shuffle(baseQuestions);
        return baseQuestions;
    }

    public static void loadNetherQuestionsInGameQuestionPool(ArrayList<RpgQuestion> gameQuestionsPool)
    {
        // new base question
        //ArrayList<RpgQuestion> baseQuestions = new ArrayList<>();
        ArrayList<RpgAnswer> answersBaseQuestion1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu prends tout pour toi, après tout, c'est la survie",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu prends seulement ce dont tu as besoin",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu laisses tout tel quel, espérant que les propriétaires reviendront ",
                    0, -5, 0, -5,
                    0, 1, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu trouves un village abandonné avec des coffres remplis de provisions. Que fais-tu ?",
                        "La survie peut être difficile, mais l'empathie envers les autres est essentielle pour préserver notre humanité.",
                        answersBaseQuestion1));


        // new base question
        ArrayList<RpgAnswer> answersBaseQuestion2 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu respectes les villageois et cherches des diamants ailleurs",
                    +5, 0, -5, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    -5, 0, +5, +10,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    +1, 0, 0, -1,
                    2, 0, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Un compagnon joueur est en difficulté et demande ton aide. Comment réagis-tu ?",
                        "L'amitié et l'altruisme sont des éléments clés dans la construction d'une communauté forte.",
                        answersBaseQuestion2));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        // new base question
        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion1));

        Collections.shuffle(gameQuestionsPool);
    }


}
