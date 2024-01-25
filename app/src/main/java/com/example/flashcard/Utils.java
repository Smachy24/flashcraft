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
            crateCraft("Epee en bois", R.drawable.question_item_wooden_sword, new ArrayList<>(Arrays.asList("bucket", "diamond_shovel", "empty", "empty", "empty", "empty", "empty", "empty", "empty")));
            crateCraft("Gateau", R.drawable.question_item_cake, new ArrayList<>(Arrays.asList("diamond_shovel", "bucket", "empty", "empty", "empty", "empty", "empty", "empty", "empty")));
        }

        public static ArrayList<Craft> getCraftList(){
            initCrafts();
            return craftList;
        }
    }

}