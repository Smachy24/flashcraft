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
        // NEW Water temple question -------------------------------------------------------------------------------------------------------------------------
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
                    "Tu sauves le villageois en lui pretant un casque ayant respiration aquatique",
                    +bigAmount, 0, -bigAmount, -bigAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu lui donne une potion de respiration aquatique pour qu'il remonte à la surface",
                    +mediumAmount, -bigAmount, -mediumAmount, -mediumAmount,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu ignores le villageois et tu le laisse mourir de soif (bouh !)",
                    0, +mediumAmount, +mediumAmount, +bigAmount,
                    2, 0, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "LE TEMPLE DE L'EAU - Le naufragé",
                        "Tu rencontrer un villageois nauffragé qui demande ton aide. Que fais-tu ?",
                        "La compassion envers les autres peut apporter des bénéfices personnels, mais négliger les besoins des autres peut aussi mener à une vie plus stressante.",
                        answersQuestion2));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion3 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu t'enfuis et te cache dans les labyrinthes du temple",
                    +giganticAmount, -mediumAmount, -mediumAmount, +mediumAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu fonces tête baissée pour tous les tuer ?",
                    -mediumAmount, -mediumAmount, +mediumAmount, +mediumAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu analyses la situation et tu fais attention à la manière dont tu diriges tes attaques",
                    -mediumAmount, -mediumAmount, +giganticAmount, -mediumAmount,
                    0, 0, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "LE TEMPLE DE L'EAU - Attention aux ennemis",
                        "Une horde de guardians apparaît et te vise avec leur laser. Que fais tu ?",
                        "Face à une situation périlleuse, il faut savoir réfléchir pour ne pas tomber dans les pièges.",
                        answersQuestion3));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion4 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu récupère tout l'or sans faire gaffe si le boss est là",
                    -mediumAmount, +mediumAmount, 0, +mediumAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu explores la salle pour voir s'il n'y a pas de pièges, quitte à récupérer moins d'or.",
                    +mediumAmount, -bigAmount, +bigAmount, -mediumAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu te depêches de remonter à la surface car il te reste peu de temps pour respirer sous l'eau.",
                    +mediumAmount, +giganticAmount, -mediumAmount, -giganticAmount,
                    0, 0, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "LE TEMPLE DE L'EAU - Salle du trésor",
                        "Tu trouves enfin la salle du trésor contenant les blocs d'or. Que fais-tu ?",
                        "Parfois il faut prendre des risques, mais toujours en faisant attention aux potentiels pièges, même si la récompense obtenue est plus faible.",
                        answersQuestion4));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion5 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Vous décidez d'explorer à deux le temple et de partager les trésors.",
                    +mediumAmount, -mediumAmount, +mediumAmount, -mediumAmount,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu engages le combat car c'est toi qui doit récupérer tous les trésors",
                    -giganticAmount, -mediumAmount, +giganticAmount, -mediumAmount,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu engages le dialogue tout en restant méfiant",
                    +mediumAmount, -mediumAmount, +mediumAmount, +bigAmount,
                    2, 0, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "LE TEMPLE DE L'EAU",
                        "Un autre joueur veut observer le temple. Que fais-tu ?",
                        "Il faut savoir compter sur les gens.",
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
                    "Implorer son pardon et vous faire martyr",
                    0, 0, -godAmount, +godAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Vous voyez god of war... bah la même (imaginez la cinematique dans votre tête avec du RTX)",
                    -godAmount, -godAmount, 0, 5,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "Vous vous recouvrer du sang de l'ender dragon en esperant qu'il vous protège de son courou.",
                    0, -godAmount, 0, -godAmount,
                    0, 0, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "BOSS : NOTCH",
                        "Alors que vous rentrer dans le plus grand des templs volant de cette dimension, un homme vétue de lambaux vous attend une pomme à la main... votre fin est proche.",
                        "Lorsque tout homme deviens de la dynamite, dieu se meurt.",
                        answersQuestion1));


        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion2 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu respectes les villageois et cherches des diamants ailleurs",
                    -bigAmount, 0, +bigAmount, +mediumAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    0, -bigAmount, -mediumAmount, -bigAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    +mediumAmount, -mediumAmount, 0, +bigAmount,
                    0, 0, 0, 0
            ));
        }};

        gameQuestionsPool.add(
                new RpgQuestion(
                        "L'EATHER - Balade parmis les nuages",
                        "Un compagnon joueur est en difficulté et demande ton aide. Comment réagis-tu ?",
                        "L'amitié et l'altruisme sont des éléments clés dans la construction d'une communauté forte.",
                        answersQuestion2));

        // NEW QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> answersQuestion3 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Tu respectes les villageois et cherches des diamants ailleurs",
                    -mediumAmount, 0, -bigAmount, -bigAmount,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    +bigAmount, -bigAmount, -mediumAmount, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    -bigAmount, +bigAmount, 0, +mediumAmount,
                    0, 0, 0, 0
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
                    -mediumAmount, 0, +bigAmount, +bigAmount,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    0, -bigAmount, +bigAmount, +mediumAmount,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    bigAmount, -mediumAmount, -bigAmount, -1,
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
                    +mediumAmount, -bigAmount, -mediumAmount, -mediumAmount,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    -mediumAmount, 0, +mediumAmount, +bigAmount,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    -bigAmount, bigAmount, 0, -mediumAmount,
                    0, 0, 0, 0
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
                    +bigAmount, -bigAmount, -5, +mediumAmount,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    -bigAmount, 0, +bigAmount, -mediumAmount,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    0, +bigAmount, -bigAmount, +mediumAmount,
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
                    -mediumAmount, -bigAmount, +bigAmount, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    mediumAmount, mediumAmount, -mediumAmount, -mediumAmount,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    mediumAmount, mediumAmount, mediumAmount, mediumAmount,
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
                    -mediumAmount, +bigAmount, -5, 0,
                    0, 0, 0, 2
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    -5, -mediumAmount, +5, +mediumAmount,
                    5, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    +bigAmount, -mediumAmount, -mediumAmount, -1,
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
                    0, 0, 0, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu les attaques pour obtenir les diamants, justifiant cela par la nécessité",
                    0, 0, 0, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Tu essaies de négocier avec eux pour partager les ressources",
                    0, 0, 0, 0,
                    0, 0, 0, 0
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
                    -godAmount, -bigAmount, -bigAmount, -bigAmount,
                    bigAmount, bigAmount, bigAmount, bigAmount
            ));
            add(new RpgAnswer(
                    "TECHNIQUE SECRETE DE LA FAMILLE JOESTAR",
                    -bigAmount, -bigAmount, -godAmount, -bigAmount,
                    bigAmount, bigAmount, bigAmount, bigAmount
            ));
            add(new RpgAnswer(
                    "NO U",
                    -bigAmount, -bigAmount, -bigAmount, -godAmount,
                    bigAmount, bigAmount, bigAmount, bigAmount
            ));
        }};

        if(isGodBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "BOSS FINAL : LE WARDEN",
                            "Une creature sans pareil se dresse devant vous. Sans crier garde, sans prevenir et surtout sans un mot elle se dirige lentement vers vous...",
                            "Toujours prendre le temps de relechir avant de provoquer un dieu.",
                            godCurse1));
        }


        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> netherTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere le premier",
                    0, 0, 0, -bigAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere le second",
                    0, 0, bigAmount, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere le 3",
                    0, bigAmount, 0, 0,
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
                            "En plorant une forteresse du nether vous tomber sur un coffre fait de netherite.",
                            "Quand la vie Ralas, il faut savoir l'acceptaiment gaïement.",
                            netherTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> endTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    bigAmount, 0, 0, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    0, bigAmount, 0, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, 0, bigAmount, 0,
                    0, 0, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isEndUnlocked)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Cadeau de l'end",
                            "Alors que vous explorer l'ender city, vous mettez la main sur un coffre fait d'obsidienne",
                            "Quand la vie Ralas, il faut savoir l'acceptaiment gaïement.",
                            endTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> waterTempleTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je recupere truc 1",
                    godAmount, 0, 0, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 2",
                    0, 0, godAmount, 0,
                    0, 1, 0, 0
            ));
            add(new RpgAnswer(
                    "je recupere truc 3",
                    0, 0, 0, godAmount,
                    0, 0, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isWaterTempleUnlocked)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Cadeau du water temple",
                            "Alors que le niveau le niveau de l'eau s'abaisse vos yeux se pose sur ce qui ressemble a un coffre recouvert d'algues",
                            "Quand la vie Ralas, il faut savoir l'acceptaiment gaïement.",
                            waterTempleTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> witherTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je la laisse embraser mon coeur et mon corps",
                    giganticAmount, giganticAmount, giganticAmount, giganticAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je la brise avec mon épée",
                    0, 0, godAmount, minimalAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "je la prend pour la vendre dans un village voisin",
                    0, 0, 0, 0,
                    bigAmount, bigAmount, bigAmount, bigAmount
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isWitherBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Wither star",
                            "Un amalgame d'os noir et dessécher se trouve devant vous. Parmis ces horreur ce trouve un fragment d'étoile scintillant",
                            "Etre un voleur peut etre respectable si votre but est de décrocher la lune",
                            witherTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> enderDragonTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "je m'assoie a ces coté",
                    0, 0, 0, -maxAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Je l'avale goulument... il sera toujours a l'abris EN MOI !",
                    0, +maxAmount, 0, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Je monte la garde jusqu'a qu'il éclose pour avoir un dragon de compagnie",
                    0, 0, +maxAmount, 0,
                    0, 0, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isEnderDragonBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Oeuf d'ender dragon",
                            "Immense, ecailleux, froid et pourtant si fragile... Tel est l'oeuf de dragon que vous trouvez. Un besoin irrépressible de le protéger vous submerge",
                            "Qui protege un oeuf protège un boeuf céleste",
                            enderDragonTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> guardianTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "Je décide de partager sa garde avec mon meilleur ami Rodriguo, parce qu'il est quand meme super sympa Rodriguo",
                    -5, 0, +giganticAmount, -giganticAmount,
                    1, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Je le sors de la terre avec mes deux mains.",
                    0, 0, +maxAmount, 0,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "Je le prend et le jete sur la premiere vache que je trouve",
                    0, +maxAmount, 0, 0,
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
                            "Alors qu'il pleut vous entender le vent siffler pret de vous, Un triden en argent bleuté se plante a vos pieds",
                            "Qui marche contre le vent se prend un trident.",
                            guardianTreasure1));
        }

        // NEW TREASURE QUESTION -------------------------------------------------------------------------------------------------------------------------
        ArrayList<RpgAnswer> godTreasure1 = new ArrayList<RpgAnswer>() {{
            add(new RpgAnswer(
                    "ET JE CROQUE LA POMME",
                    maxAmount, maxAmount, maxAmount, maxAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "ET JE CROQUE LA POMME",
                    maxAmount, maxAmount, maxAmount, maxAmount,
                    0, 0, 0, 0
            ));
            add(new RpgAnswer(
                    "ET JE CROQUE LA POMME",
                    maxAmount, maxAmount, maxAmount, maxAmount,
                    0, 0, 0, 0
            ));
        }};

        // This bonus question is added only if the success is unlocked.
        // those question are gift to help the player progress further in the game.
        if(isGodBeaten)
        {
            gameQuestionsPool.add(
                    new RpgQuestion(
                            "TRESOR : Pomme de Notch",
                            "IMPOSSIBLE, impossible... impossible, elle est devant vous... impossible !",
                            "Il faut croquer la vie a pleine dent, mais faite attention a vos gencive si elles sont sensibles.",
                            godTreasure1));
        }

        Collections.shuffle(gameQuestionsPool);
    }
}
