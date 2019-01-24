package com.vikrant.kalamquotes.AdapterClass;
 
public class Movie {

    private String title, genre;
 
    public Movie(String s, String s1, String s2) {
    }
 
    public Movie(String title, String genre) {

        this.title = title;
        this.genre = genre;

    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String name) {
        this.title = name;
    }
 


    public String getGenre() {
        return genre;
    }
 
    public void setGenre(String genre) {
        this.genre = genre;
    }
}