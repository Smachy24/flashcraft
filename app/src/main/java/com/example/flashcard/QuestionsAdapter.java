package com.example.flashcard;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flashcard.models.Game;
import com.example.flashcard.models.Question;

import org.w3c.dom.Text;

import java.util.List;

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.ViewHolder>{

    private List<Question> questions;

    public QuestionsAdapter(List<Question> questions) {
        this.questions = questions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_question, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Question question = questions.get(position);
        Context context = holder.itemView.getContext();
        // ALL HOLDER FOR BIND VIEW
        int promptIconId = context.getResources().getIdentifier(question.getIcon(), "drawable", context.getPackageName());
        holder.icon.setImageResource(promptIconId);
        holder.prompt.setText(question.getPrompt());
        holder.difficulty.setText(question.getLevel());

        holder.activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchQuizActivity(context, question);
            }
        });
    }

    private void launchQuizActivity(Context context, Question question) {
        Intent intent = new Intent(context, QuestionsActivity.class);
        // CODE FOR MAKING QUIZ ( FROM MainActivity.java)
        Game game = GameFactory.Create(question, question.getLevel());

        intent.putExtra("Difficulty", question.getLevel());
        intent.putExtra("game", game);

        context.startActivity(intent);
    }



    @Override
    public int getItemCount() {
        return questions.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView icon;
        final TextView prompt;
        final TextView difficulty;
        final Button activityButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //Recup From itemView = item_questions.xml
            icon = itemView.findViewById(R.id.iconImageView);
            prompt = itemView.findViewById(R.id.promptText);
            difficulty = itemView.findViewById(R.id.difficultyTextView);
            activityButton = itemView.findViewById(R.id.activityButton);
        }
    }
}

