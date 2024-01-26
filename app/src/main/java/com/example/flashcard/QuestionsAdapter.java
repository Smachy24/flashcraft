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

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.ViewHolder> {

    // List to hold the questions
    private List<Question> questions;

    // Constructor to initialize the adapter with a list of questions
    public QuestionsAdapter(List<Question> questions) {
        this.questions = questions;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item_question layout for each item in the RecyclerView
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_question, parent, false);

        // Return a new ViewHolder for each view
        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the current question
        Question question = questions.get(position);
        // Get the context of the item view
        Context context = holder.itemView.getContext();

        // Set data to the ViewHolder elements
        int promptIconId = context.getResources().getIdentifier(question.getIcon(), "drawable", context.getPackageName());
        holder.icon.setImageResource(promptIconId);
        holder.prompt.setText(question.getPrompt());
        holder.difficulty.setText(question.getLevel());

        // Set a click listener for the activityButton
        holder.activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the quiz activity when the button is clicked
                launchQuizActivity(context, question);
            }
        });
    }

    // Launch the QuestionsActivity with the selected question
    private void launchQuizActivity(Context context, Question question) {
        Intent intent = new Intent(context, QuestionsActivity.class);

        // Create a game based on the question and difficulty level
        Game game = GameFactory.Create(question, question.getLevel());

        // Pass necessary data to the QuestionsActivity
        intent.putExtra("Difficulty", question.getLevel());
        intent.putExtra("game", game);

        // Start the QuestionsActivity
        context.startActivity(intent);
    }

    // Return the size of the dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return questions.size();
    }

    // ViewHolder class to hold references to the view elements
    static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView icon;
        final TextView prompt;
        final TextView difficulty;
        final Button activityButton;

        // Constructor to initialize the ViewHolder with view references
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // Get references from the item_question.xml layout
            icon = itemView.findViewById(R.id.iconImageView);
            prompt = itemView.findViewById(R.id.promptText);
            difficulty = itemView.findViewById(R.id.difficultyTextView);
            activityButton = itemView.findViewById(R.id.activityButton);
        }
    }
}
