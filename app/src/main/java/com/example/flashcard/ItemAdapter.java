package com.example.flashcard;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flashcard.models.Item;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{

    final ArrayList<Item> items;

    public ItemAdapter(ArrayList<Item> items) { this.items = items; }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.image.setImageResource(item.image);
        holder.image.setOnTouchListener(new DragItemTouchListener());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.itemImageView);
        }
    }

    private static class DragItemTouchListener implements View.OnTouchListener {

        private long lastClickTime = 0;
        /**
         * Return if image is pressed
         * @param view        The view the touch event has been dispatched to.
         * @param motionEvent The MotionEvent object containing full information about
         *                    the event.
         * @return
         */
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {

            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                // Récupérer le temps actuel
                long clickTime = System.currentTimeMillis();

                // Vérifier si le temps écoulé depuis le dernier clic est inférieur à un seuil pour considérer cela comme un double-clic
                if (clickTime - lastClickTime < 300) {
                    // C'est un double clic, démarrez le glisser
                    dragMultiple(view);
                }

                // Mettre à jour le dernier temps du clic
                lastClickTime = clickTime;

                return true;
            } else {
                return false;
            }
        }


        /**
         * Drag and move the image
         * @param view  The view the touch event has been dispatched to.
         */
        private void dragMultiple(View view) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            view.startDragAndDrop(data, shadowBuilder, view, 0);
        }
    }
}
