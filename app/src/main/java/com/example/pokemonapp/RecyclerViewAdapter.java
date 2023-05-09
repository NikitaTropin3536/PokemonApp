package com.example.pokemonapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Pokemon> pokemonList;

    public RecyclerViewAdapter(Context mContext,
                               List<Pokemon> pokemonList) {
        this.mContext = mContext;
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyHolder holder, int position) {

        holder.imgPokemonMainPicture.setAnimation(AnimationUtils.loadAnimation(
                mContext, R.anim.fade_transition
        ));

        holder.cardView.setAnimation(AnimationUtils.loadAnimation(
                mContext, R.anim.scale_animation_for_card
        ));


        holder.txtPokemonName.setText(pokemonList.get(position).getNameOfPokemon());
        holder.txtPokemonDescription.setText(pokemonList.get(position).getDescription());
        holder.imgPokemonMainPicture.setImageResource(pokemonList.get(position).getImgOfPokemon());
        holder.imgPokemonStoneTypePicture.setImageResource(pokemonList.get(position).getImgTypeOfPokemon());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView txtPokemonName;
        private TextView txtPokemonDescription;
        private ImageView imgPokemonMainPicture;
        private ImageView imgPokemonStoneTypePicture;
        private CardView cardView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            txtPokemonName = itemView.findViewById(R.id.txtPokemonName);
            txtPokemonDescription = itemView.findViewById(R.id.txtPokemonDescription);
            imgPokemonMainPicture = itemView.findViewById(R.id.imgMainPokemon);
            imgPokemonStoneTypePicture = itemView.findViewById(R.id.imgPokemonType);
            cardView = itemView.findViewById(R.id.mainCard);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
