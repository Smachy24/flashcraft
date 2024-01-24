package com.example.flashcard;

import androidx.annotation.NonNull;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Field;

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

    public static class Api {
        public static final String BASE_URL = "https://students.gryt.tech/api/L2/flashcraft/questions";
        public static void getQuestions(){
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url(BASE_URL)
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
                        // Obtenez le corps de la réponse en tant que chaîne JSON
                        String jsonResponse = response.body().string();

                        Gson gson = new Gson();
                        // VotreObjet obj = gson.fromJson(jsonResponse, VotreObjet.class);

                        // Vous pouvez maintenant utiliser l'objet 'obj' comme nécessaire
                        // Par exemple, imprimez un attribut de l'objet
                        // System.out.println("Attribute from JSON: " + obj);

                    } else {
                        System.out.println("Response not successful. Code: " + response.code());
                    }
                }
            });
        }
    }

}