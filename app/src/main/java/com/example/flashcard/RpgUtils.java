package com.example.flashcard;

import com.example.flashcard.models.RpgAnswer;
import com.example.flashcard.models.RpgQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RpgUtils {
    public static ArrayList<RpgQuestion> baseQuestions = new ArrayList<>();

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
                        "BOSS : LE WITHER",
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
                        "BOSS : LE WITHER",
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
                        "BOSS : LE WITHER",
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
                        "BOSS : LE WITHER",
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
                        "BOSS : LE WITHER",
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
                        "BOSS : LE WITHER",
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
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",d
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


}
