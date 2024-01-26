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
        ArrayList<RpgAnswer> answersBaseQuestion0 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu regardes autour de toi pour trouver des indices sur la direction du village",
                    +2, 0, -1, +1,
                    0, 0, 0, 1
            ));
            add(new RpgAnswer(
                    "Tu te diriges immédiatement dans une direction au hasard",
                    0, 0, 0, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu demandes à d'autres joueurs présents s'ils connaissent la route du village",
                    +3, 0, 0, +2,
                    0, 0, 0, 2
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Un nouveau monde",
                        "Tu viens de spawn. Que fais-tu en premier lieu ?",
                        "Explorer le monde peut être risqué, mais la coopération avec d'autres joueurs peut être bénéfique.",
                        answersBaseQuestion0));


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
// NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion4 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu t'aventures plus profondément dans la grotte, prêt à affronter les monstres pour les trésors cachés",
                    -3, 0, +2, +3,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu évites la confrontation avec les monstres en cherchant un chemin alternatif",
                    +2, 0, -1, +3,
                    0, 0, 0, 1
            ));
            add(new RpgAnswer(
                    "Tu rebrousse chemin, préférant ne pas risquer ta vie pour des trésors incertains",
                    +1, 0, 0, +1,
                    0, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "L'obscurité profonde",
                        "Alors que tu explores la mine, tu découvres une grotte sombre infestée de monstres. Que fais-tu ?",
                        "L'inconnu peut être dangereux, mais parfois le risque vaut la récompense.",
                        answersBaseQuestion4));


        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion5 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu fouilles attentivement le stronghold, découvrant des livres d'enchantement précieux",
                    +4, 0, +15, +10,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu explores les salles avec précaution, découvrant un coffre rempli de pommes en or",
                    +25, 0, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu te concentres sur la recherche du portail de l'End, ignorant les distractions",
                    0, -5, 0, +20,
                    0, 1, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Découvertes dans le Stronghold",
                        "Alors que tu explores le stronghold, tu tombes sur des découvertes intéressantes. Que choisis-tu d'explorer davantage ?",
                        "Le stronghold renferme des richesses, mais tes actions refléteront ta moralité et auront des répercussions sur ton parcours.",
                        answersBaseQuestion5));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion6 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu actives immédiatement le portail de l'End, prêt à affronter le Dragon de l'End",
                    +5, 0, 0, -4,
                    0, 0, 0, 4
            ));
            add(new RpgAnswer(
                    "Tu prends un moment pour te préparer davantage, améliorant ton équipement et faisant équipe avec d'autres joueurs",
                    +3, 0, 0, +3,
                    0, 0, 0, 3
            ));
            add(new RpgAnswer(
                    "Tu hésites, ressentant la pression de l'inconnu, et décides de temporiser avant d'activer le portail",
                    +1, 0, 0, +1,
                    0, 0, 0, 1
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Le Portail de l'End",
                        "Après avoir découvert le portail de l'End, comment choisis-tu de procéder ?",
                        "Le Dragon de l'End attend, mais la précipitation peut conduire à des conséquences imprévisibles. Tes choix influenceront non seulement la bataille à venir, mais aussi ta propre préparation.",
                        answersBaseQuestion6));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion7 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu te mets à faire du beatboxing pour calmer une horde de creepers, espérant qu'ils t'applaudiront au lieu d'exploser",
                    +2, 0, 0, +2,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu te mets à imiter les cris étranges des monstres, espérant qu'ils te prennent pour l'un des leurs",
                    +2, 0, 0, +2,
                    0, 0, 0, 1
            ));
            add(new RpgAnswer(
                    "Préférant l'humour à la violence, tu essaies de raconter des blagues aux monstres pour les apaiser",
                    +1, 0, 0, +1,
                    0, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Humour Risqué dans les Ténèbres",
                        "Alors que tu explores la mine, tu découvres une grotte sombre infestée de monstres. Comment choisis-tu de réagir de manière inattendue, même si cela comporte des risques ?",
                        "L'inconnu peut être dangereux, et parfois même une approche humoristique peut avoir des conséquences inattendues.",
                        answersBaseQuestion7));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion8 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "En croisant un poulet, tu décides de lui proposer un partenariat commercial",
                    +3, 0, 0, -1,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu te lances dans une compétition amicale de sauts de moutons avec les moutons locaux",
                    +4, 0, 0, 0,
                    0, 0, 0, 3
            ));
            add(new RpgAnswer(
                    "En te promenant dans le désert, tu trouves un cactus et décides de lui donner un nom et d'en faire ton compagnon de voyage (une belle histoire d'amour éclot)",
                    +2, 0, 0, +1,
                    0, 0, 0, 1
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Folies Minecraftiennes",
                        "Alors que tu sillones le monde de Minecraft, des situations hilarantes se présentent.",
                        "L'univers de Minecraft peut être un endroit étrange. Tes choix influenceront ta quête, même si elle prend une tournure des plus comiques.",
                        answersBaseQuestion8));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion9 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu découvres un champ de citrouilles et décides de créer une galerie d'art en les sculptant de manière extravagante",
                    +4, 0, 0, 0,
                    0, 0, 0, 3
            ));
            add(new RpgAnswer(
                    "En te baladant dans la jungle, tu rencontres un panda et décides de l'inclure dans tes plans pour devenir le chef d'une tribu panda",
                    +2, 0, 0, +1,
                    0, 0, 0, 1
            ));
            add(new RpgAnswer(
                    "Tu trouves une montagne et décides de la déclarer 'Montagne de la Conquête' même si elle n'est pas si haute que ça",
                    +2, 0, 0, +2,
                    0, 0, 0, 2
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Folies Continuelles dans Minecraft",
                        "Poursuivant tes aventures dans Minecraft, d'autres situations loufoques se présentent. Comment choisis-tu de réagir de manière toujours aussi comique ?",
                        "L'univers de Minecraft est décidément plein de surprises. Tes choix influenceront ta quête, même si elle continue sur une note des plus comiques.",
                        answersBaseQuestion9));

        // NEW BASE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersBaseQuestion10 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu croises un villageois et décides de lui donner une leçon de mode en échange d'une carotte",
                    +3, 0, 0, -1,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "En trouvant une colonie d'abeilles, tu décides de tenter une négociation pour échanger du miel contre des conseils d'amour",
                    +4, 0, 0, 0,
                    0, 0, 0, 3
            ));
            add(new RpgAnswer(
                    "En croisant un cochon, tu lui proposes de devenir le président de votre propre république porcine",
                    +2, 0, 0, +2,
                    0, 0, 0, 2
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Farces Extravagantes dans Minecraft",
                        "Alors que tu continues tes aventures, des situations toujours plus comiques se présentent. Comment choisis-tu de réagir de manière excentrique et hilarante ?",
                        "L'univers de Minecraft ne cesse de te surprendre avec ses bizarreries.",
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
                    "Tu commences a courrir vers lui pour l'embrasser tendrement, pour espérer que celui ne t'attaques pas en retour",
                    -15, 0, -5, +5,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu essayes l'imitier pitoyablement, en tournant sur toi meme et en sautant de partout ",
                    -5, 0, +5, +10,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier pour ne pas t'attaquant en lui proposant un code Uber Eat de 15%",
                    +5, 0, 0, -5,
                    2, 0, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "Le nether",
                        "Tu arrives devant une forteresse sans potion de résistance au feu, et tu rencontres un blaze.",
                        "Les richesses obtenues par l'injustice ne mènent qu'à une fausse prospérité",
                        answersNetherQuestion3));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion4 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu décides de jouer une sérénade romantique au blaze avec une flûte à nez, espérant qu'il s'apaise par la mélodie",
                    +3, 0, -2, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu entames une danse de la pluie dans l'espoir de l'éteindre, même si tu sais que ça ne fonctionnera probablement pas",
                    -4, 0, +4, +8,
                    4, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de le convaincre que tu es son plus grand fan et que tu souhaites obtenir son autographe sur ton bouclier",
                    +2, 0, 0, -1,
                    3, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Un Blaze Contrarié",
                        "Alors que tu te retrouves face à un blaze furieux dans le Nether, tu décides d'adopter une approche décalée pour désamorcer la situation. Comment choisis-tu de réagir avec un soupçon d'humour ?",
                        "Le Nether peut être un endroit enflammé, mais parfois une touche d'humour peut être la meilleure potion. Tes choix continueront d'ajouter une atmosphère légère à ton aventure.",
                        answersNetherQuestion4));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion5 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu tentes de jouer au pompier héroïque en cherchant désespérément de l'eau pour éteindre le slime en feu",
                    +3, 0, -2, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu décides de l'inviter à un barbecue, sachant qu'il est déjà grillé, pour l'utiliser en temps que source de flamme",
                    -4, 0, +4, +8,
                    4, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu lui proposes de devenir la star de ton spectacle de jonglage enflammé, utilisant ses flammes pour une performance exceptionnelle",
                    +2, 0, 0, -1,
                    3, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Rencontre avec un Slime de Feu",
                        "Alors que tu tombes sur un slime en feu dans le Nether, tu décides d'adopter une approche humoristique pour interagir avec lui. Comment choisis-tu de réagir de manière décalée ?",
                        "Les slimes en feu peuvent être une source de chaleur. Tes choix continueront d'ajouter une touche légère à ton aventure.",
                        answersNetherQuestion5));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion6 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu tentes de les apaiser en distribuant des carottes dorées, espérant que cela calmera leur courroux",
                    +3, 0, -2, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu improvises une danse de la pluie dans l'espoir que cela les divertisse et les fasse oublier la situation",
                    -4, 0, +4, +8,
                    4, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu te caches derrière un panneau 'Piglin Spa Gratuit', espérant qu'ils croiront à une offre exclusive",
                    +2, 0, 0, -1,
                    3, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Confrontation avec une Horde de Piglins",
                        "Après avoir malencontreusement poussé un piglin, une horde en colère se dirige vers toi. Comment choisis-tu de réagir de manière décalée pour éviter un affrontement direct ?",
                        "Les piglins peuvent être promptement irritables. Si on les <<Pousse a bout>> ",
                        answersNetherQuestion6));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion7 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu commences à creuser ta base, utilisant la lave comme éclairage naturel et le quartz comme matériau chic",
                    +3, 0, -2, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu tentes de convaincre des piglins de devenir tes architectes en échange de champignons rouges, espérant qu'ils aient un sens du design unique",
                    -4, 0, +4, +8,
                    4, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu décides de pauser un lit dans ta base du Nether, ignorant les avertissements de tous les joueurs expérimentés, car tu crois fermement à une sieste paisible dans ce paysage infernal",
                    +2, 0, 0, -1,
                    3, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Création d'une Base dans le Nether",
                        "Tu as décidé de créer une base dans le Nether pour ajouter un peu de style infernal à ton aventure. Comment choisis-tu de commencer cette entreprise décalée ?",
                        "La création dans le Nether exprime une détermination intrépide. Que ce soit en exploitant la lave, en négociant avec les piglins ou en ignorant les avertissements avec un lit, chaque choix est une affirmation audacieuse face à l'adversité.",
                        answersNetherQuestion7));

        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion8 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu prends un moment pour apprécier la vue du lac de lave, méditant sur la beauté infernale de Minecraft",
                    +3, 0, -2, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu te lances dans une traversée héroïque du lac de lave en sautant sur des bateaux en bois, repérant un trésor au milieu",
                    -4, 0, +4, +8,
                    4, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu décides d'apprivoiser un Strider en lui offrant une carotte, espérant qu'il te permettra de traverser le lac en style",
                    +2, 0, 0, -1,
                    3, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Rencontre avec un Lac de Lave",
                        "Tu arrives devant un imposant lac de lave dans le Nether. Comment choisis-tu de réagir de manière décalée face à ce paysage infernal ?",
                        "Devant le lac de lave imposant du Nether, tu choisis de contempler la beauté et la puissance de la nature dans ce monde virtuel. C'est un rappel que même dans des environnements hostiles, prendre le temps d'apprécier la grandeur qui nous entoure peut être une source de sagesse et de réflexion.",
                        answersNetherQuestion8));
        
        // NEW NETHER QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersNetherQuestion12 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu lui proposes des cours de stand-up pour qu'il puisse pleurer de rire au lieu de pleurer de tristesse",
                    +3, 0, -2, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu essaies de lui vendre un mouchoir spécial 'anti-larmes' en prétendant que c'est la dernière tendance du Nether",
                    -4, 0, +4, +8,
                    4, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu imites ses pleurs de manière exagérée pour lui montrer à quel point c'est un gros bébé",
                    +2, 0, 0, -1,
                    3, 0, 0, 0
            ));
        }};

        baseQuestions.add(
                new RpgQuestion(
                        "Le Ghast Pleureur",
                        "En croisant un ghast dans le Nether en pleurs, tu décides de lui apporter un peu de légèreté en adoptant une approche humoristique. Comment choisis-tu de te moquer gentiment de sa propension à pleurer ?",
                        "Les ghasts peuvent être de grands pleureurs, mais parfois un peu de rire peut sécher leurs larmes. Tes choix continueront d'ajouter une touche d'humour léger à ton aventure.",
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
