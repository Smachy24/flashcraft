package com.example.flashcard;

import androidx.annotation.NonNull;

import com.example.flashcard.models.Craft;
import com.example.flashcard.models.Question;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Utils {
    public static class Drawables {
        public static void listDrawables() {
            Field[] drawablesFields = R.drawable.class.getFields();

            for (Field field : drawablesFields) {
                try {
                    String name = field.getName();
                    int id = field.getInt(null);
                    System.out.println("Drawable Name: " + name + " - ID: " + id);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public interface OnQuestionsListener{
        void onQuestionsLoaded(ArrayList<Question> questions);
    }

    public static class Api {
        public static String BASE_URL = "https://students.gryt.tech/api/L2/flashcraft/questions/";

        private static void requestGet(OnQuestionsListener listener, String url){
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Call call = client.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                    e.printStackTrace();
                }
                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    if (response.isSuccessful()) {
                        ArrayList<Question> questions = getArrayListQuestions(response);
                        listener.onQuestionsLoaded(questions);
                    }
                }
            });
        }
        private static ArrayList<Question> getArrayListQuestions(Response response) throws IOException{
            // Get response
            assert response.body() != null;
            String jsonResponse = response.body().string();
            // Parse response to Json
            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
            // Get response["results"]
            JsonArray resultsArray = jsonObject.getAsJsonArray("results");

            ArrayList<Question> questions = new ArrayList<>();

            // Create an object Question for each line
            for (int i = 0; i < resultsArray.size(); i++) {
                JsonObject resultObject = resultsArray.get(i).getAsJsonObject();
                Gson gson = new Gson();
                Question question = gson.fromJson(resultObject, Question.class);
                questions.add(question);
            }
            return questions;
        }

        public static void getQuestions(OnQuestionsListener listener){
            requestGet(listener, BASE_URL);
        }

        public static void getQuestionsByLevel(OnQuestionsListener listener, String level){
            assert level != null;
            assert level != "easy" || level != "medium" || level !="hard";
            requestGet(listener, BASE_URL+"?level="+level);
        }

        public static void getQuestionById(OnQuestionsListener listener, int id){
            requestGet(listener, BASE_URL+ id);
        }

    }

    public static class CraftList{
        public static ArrayList<Craft> craftList;

        private static void crateCraft(String name, int image, ArrayList<String> craft){
            Craft craftedItem = new Craft(craft, image, name);
            craftList.add(craftedItem);
        }

        private static void initCrafts(){
            craftList = new ArrayList<>();
            crateCraft("Pain", R.drawable.question_item_bread, new ArrayList<>(Arrays.asList(
                    "empty", "empty", "empty",
                    "wheat", "wheat", "wheat",
                    "empty", "empty", "empty")));
            crateCraft("Epee en fer", R.drawable.question_item_iron_sword, new ArrayList<>(Arrays.asList(
                    "empty", "iron_ingot", "empty",
                    "empty", "iron_ingot", "empty",
                    "empty", "stick", "empty")));
            crateCraft("Casque en fer", R.drawable.question_item_iron_helmet, new ArrayList<>(Arrays.asList(
                    "iron_ingot", "iron_ingot", "iron_ingot",
                    "iron_ingot", "empty", "iron_ingot",
                    "empty", "empty", "empty")));
            crateCraft("Plastron en fer", R.drawable.question_item_iron_chestplate, new ArrayList<>(Arrays.asList(
                    "iron_ingot", "empty", "iron_ingot",
                    "iron_ingot", "iron_ingot", "iron_ingot",
                    "iron_ingot", "iron_ingot", "iron_ingot")));
            crateCraft("Pantalon en fer", R.drawable.question_item_iron_leggings, new ArrayList<>(Arrays.asList(
                    "iron_ingot", "iron_ingot", "iron_ingot",
                    "iron_ingot", "empty", "iron_ingot",
                    "iron_ingot", "empty", "iron_ingot")));
            crateCraft("Bottes en fer", R.drawable.question_item_iron_boots, new ArrayList<>(Arrays.asList(
                    "empty", "empty", "empty",
                    "iron_ingot", "empty", "iron_ingot",
                    "iron_ingot", "empty", "iron_ingot")));
            crateCraft("Four", R.drawable.question_item_furnace, new ArrayList<>(Arrays.asList(
                    "cobblestone", "cobblestone", "cobblestone",
                    "cobblestone", "empty", "cobblestone",
                    "cobblestone", "cobblestone", "cobblestone")));
            crateCraft("Hache en fer", R.drawable.question_item_iron_axe, new ArrayList<>(Arrays.asList(
                    "iron_ingot", "iron_ingot", "empty",
                    "iron_ingot", "stick", "empty",
                    "empty", "stick", "empty")));
            crateCraft("Pioche en fer", R.drawable.question_item_iron_pickaxe, new ArrayList<>(Arrays.asList(
                    "iron_ingot", "iron_ingot", "iron_ingot",
                    "empty", "stick", "empty",
                    "empty", "stick", "empty")));
            crateCraft("Pelle en fer", R.drawable.question_item_iron_shovel, new ArrayList<>(Arrays.asList(
                    "empty", "iron_ingot", "empty",
                    "empty", "stick", "empty",
                    "empty", "stick", "empty")));
            crateCraft("Houe en fer", R.drawable.question_item_iron_hoe, new ArrayList<>(Arrays.asList(
                    "iron_ingot", "iron_ingot", "empty",
                    "empty", "stick", "empty",
                    "empty", "stick", "empty")));
            crateCraft("Escalier en pierre", R.drawable.question_item_cobblestone_stairs, new ArrayList<>(Arrays.asList(
                    "empty", "empty", "cobblestone",
                    "empty", "cobblestone", "cobblestone",
                    "cobblestone", "cobblestone", "cobblestone")));

        }

        public static ArrayList<Craft> getCraftList(){
            initCrafts();
            Collections.shuffle(craftList);

            ArrayList<Craft> randomCraft = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                randomCraft.add(craftList.get(i));
            }

            return randomCraft;
        }
    }

}