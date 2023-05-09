package com.example.pokemonapp;

public class Pokemon {
    private String nameOfPokemon;
    private String description;
    private int imgOfPokemon;
    private int imgTypeOfPokemon;

    public Pokemon(String nameOfPokemon,
                   String description,
                   int imageOfPokemon,
                   int imgTypeOfPokemon) {
        this.nameOfPokemon = nameOfPokemon;
        this.description = description;
        this.imgOfPokemon = imageOfPokemon;
        this.imgTypeOfPokemon = imgTypeOfPokemon    ;
    }

    public void setNameOfPokemon(String nameOfPokemon) {
        this.nameOfPokemon = nameOfPokemon;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgOfPokemon(int imgOfPokemon) {
        this.imgOfPokemon = imgOfPokemon;
    }

    public void setImgTypeOfPokemon(int imgTypeOfPokemon) {
        this.imgTypeOfPokemon = imgTypeOfPokemon;
    }

    public String getNameOfPokemon() {
        return nameOfPokemon;
    }

    public String getDescription() {
        return description;
    }

    public int getImgOfPokemon() {
        return imgOfPokemon;
    }

    public int getImgTypeOfPokemon() {
        return imgTypeOfPokemon;
    }
}
