package com.example.flashcard;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.flashcard.models.RpgAnswer;
import com.example.flashcard.models.RpgQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RpgUtils {
    public static final int minimalAmount = 1;
    public static final int mediumAmount = 5;
    public static final int bigAmount = 10;
    public static final int giganticAmount = 25;
    public static final int godAmount = 50;
    public static final int maxAmount = 100;


    public static ArrayList<RpgQuestion> baseQuestions = new ArrayList<>();


    public static ArrayList<RpgQuestion> getBaseQuestions()
    {
        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
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


        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
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

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion3 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion3));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion4 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion4));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion5 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion5));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion6 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion6));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion7 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion7));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion8 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion8));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion9 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion9));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion10 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion10));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion11 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion11));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion12 = new ArrayList<RpgAnswer>() {{
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
                        "C'est une mine !",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersBaseQuestion12));

        Collections.shuffle(baseQuestions);
        return baseQuestions;
    }

    public static void loadNetherQuestionsInGameQuestionPool(ArrayList<RpgQuestion> gameQuestionsPool)
    {
        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Affronter la créature",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tenter de le faire exploser avec de la tnt",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "glouglou potion de force dans sa bouche",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "BOSS : LE WITHER",
                        "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                        "Envie de fuir le wither envie d'être with her AHAH.",
                        answersNetherQuestion1));


        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion2 = new ArrayList<RpgAnswer>() {{
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
                        answersNetherQuestion2));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion3 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion3));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion4 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion4));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion5 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion5));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion6 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion6));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion7 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion7));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion8 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion8));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion9 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion9));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion10 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion10));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion11 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion11));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion12 = new ArrayList<RpgAnswer>() {{
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
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion12));

        Collections.shuffle(gameQuestionsPool);
    }


    public static void loadEndQuestionsInGameQuestionPool(ArrayList<RpgQuestion> gameQuestionsPool)
    {
        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Affronter la créature",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tenter de le faire exploser avec de la tnt",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "glouglou potion de force dans sa bouche",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "BOSS : L'ENDER DRAGON",
                        "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                        "Envie de fuir le wither envie d'être with her AHAH.",
                        answersQuestion1));


        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion2 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Un compagnon joueur est en difficulté et demande ton aide. Comment réagis-tu ?",
                        "L'amitié et l'altruisme sont des éléments clés dans la construction d'une communauté forte.",
                        answersQuestion2));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion3 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion3));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion4 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion4));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion5 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion5));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion6 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion6));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion7 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion7));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion8 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion8));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion9 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion9));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion10 = new ArrayList<RpgAnswer>() {{
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
                        "L'END",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion10));

        Collections.shuffle(gameQuestionsPool);
    }

    public static void loadWaterTempleQuestionsInGameQuestionPool(ArrayList<RpgQuestion> gameQuestionsPool)
    {
        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Affronter la créature",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tenter de le faire exploser avec de la tnt",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "glouglou potion de force dans sa bouche",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "BOSS : LE GUARDIAN",
                        "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                        "Envie de fuir le wither envie d'être with her AHAH.",
                        answersQuestion1));


        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion2 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Un compagnon joueur est en difficulté et demande ton aide. Comment réagis-tu ?",
                        "L'amitié et l'altruisme sont des éléments clés dans la construction d'une communauté forte.",
                        answersQuestion2));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion3 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion3));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion4 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion4));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion5 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion5));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion6 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion6));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion7 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion7));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion8 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion8));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion9 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion9));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion10 = new ArrayList<RpgAnswer>() {{
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
                        "LE TEMPLE DE L'EAU",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion10));

        Collections.shuffle(gameQuestionsPool);
    }

    public static void loadEatherQuestionsInGameQuestionPool(ArrayList<RpgQuestion> gameQuestionsPool)
    {
        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Affronter la créature",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tenter de le faire exploser avec de la tnt",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "glouglou potion de force dans sa bouche",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "BOSS : NOTCH",
                        "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                        "Envie de fuir le wither envie d'être with her AHAH.",
                        answersQuestion1));


        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion2 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Un compagnon joueur est en difficulté et demande ton aide. Comment réagis-tu ?",
                        "L'amitié et l'altruisme sont des éléments clés dans la construction d'une communauté forte.",
                        answersQuestion2));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion3 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion3));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion4 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion4));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion5 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion5));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion6 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion6));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion7 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion7));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion8 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion8));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion9 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion9));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion10 = new ArrayList<RpgAnswer>() {{
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
                        "L'EATHER",
                        "Tu découvres une mine de diamants, mais elle est protégée par des villageois pacifiques. Que fais-tu ?",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersQuestion10));

        Collections.shuffle(gameQuestionsPool);
    }

    public static void loadSuccessQuestionsInGameQuestionPool(ArrayList<RpgQuestion> gameQuestionsPool, Context context)
    {
        SharedPreferences sharedPreferences = context.getSharedPreferences("Achievements", Context.MODE_PRIVATE);
        boolean isWitherBeaten = sharedPreferences.getBoolean("isWitherBeaten", false);
        boolean isGuardianBeaten = sharedPreferences.getBoolean("isGuardianBeaten", false);
        boolean isEnderDragonBeaten = sharedPreferences.getBoolean("isEnderDragonBeaten", false);
        boolean isGodBeaten = sharedPreferences.getBoolean("isGodBeaten", false);
        boolean isWardenBeaten = sharedPreferences.getBoolean("isWardenBeaten", false);

        boolean isNetherDiscovered = sharedPreferences.getBoolean("isNetherUnlocked", false);
        boolean isEndUnlocked = sharedPreferences.getBoolean("isEndUnlocked", false);
        boolean isWaterTempleUnlocked = sharedPreferences.getBoolean("isWaterTempleUnlocked", false);
        boolean isEatherUnlocked = sharedPreferences.getBoolean("isEatherUnlocked", false);

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> godCurse1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "J'INVOQUE EXODIA LE MAUDIT",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "TECHNIQUE SECRETE DE LA FAMILLE JOESTAR",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "NO U",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        if(isGodBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "BOSS FINAL : LE WARDEN",
                            "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                            "Envie de fuir le wither envie d'être with her AHAH.",
                            godCurse1));
        }


        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> netherTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isNetherDiscovered)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Cadeau du nether",
                            "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                            "Envie de fuir le wither envie d'être with her AHAH.",
                            netherTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> endTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isEndUnlocked)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Cadeau de l'end",
                            "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                            "Envie de fuir le wither envie d'être with her AHAH.",
                            endTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> waterTempleTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isWaterTempleUnlocked)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Cadeau du water temple",
                            "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                            "Envie de fuir le wither envie d'être with her AHAH.",
                            waterTempleTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> witherTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isWitherBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Wither star",
                            "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                            "Envie de fuir le wither envie d'être with her AHAH.",
                            witherTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> enderDragonTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isEnderDragonBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Oeuf d'ender dragon",
                            "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                            "Envie de fuir le wither envie d'être with her AHAH.",
                            enderDragonTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> guardianTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isGuardianBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Triden",
                            "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                            "Envie de fuir le wither envie d'être with her AHAH.",
                            guardianTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> godTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    -5, 0, 1, 0,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    5, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, -20, +2, -10,
                    0, 1, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isGodBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Pomme de Notch",
                            "Un amalgame d'os et de haine se tient devant vous, c'est le Wither ! Préparer vous a mourrir !",
                            "Envie de fuir le wither envie d'être with her AHAH.",
                            godTreasure1));
        }

        Collections.shuffle(gameQuestionsPool);
    }
}
