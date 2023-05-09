package com.example.pokemonapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentPokemonSet1 extends Fragment {

    private Context mContext;
    private List<Pokemon> pokemonList;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;

    private FragmentManager fm;
    private View rootView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext = getActivity().getApplicationContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_pokemon_set1, container, false);

        recyclerView = rootView.findViewById(R.id.recyclerView1);
        pokemonList = new ArrayList<>();

        fm = getActivity().getSupportFragmentManager();

        // ставим покемонов
//        pokemonList.add(new Pokemon());
//        pokemonList.add(new Pokemon());
//        pokemonList.add(new Pokemon());
//        pokemonList.add(new Pokemon());
//        pokemonList.add(new Pokemon());

        adapter = new RecyclerViewAdapter(getContext(), pokemonList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 1));
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}