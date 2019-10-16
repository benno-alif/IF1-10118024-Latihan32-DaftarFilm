package com.benno;

public class Film {
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;

    public void nowPlaying(){
        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " Menit");
        System.out.println();
    }
}
