package com.benno;

    /*
        Nama        : Benno Alif Anggara
        Kelas       : IF1
        NIM         : 10118024
        Deskripsi   : Menampilkan data daftar film yang sedang tayang
     */

public class Main {

    public static void main(String[] args) {
	    Film film1 = new Film();
        Film film2 = new Film();
        Film film3 = new Film();
        Film film4 = new Film();

        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();

        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horror, Scifi";
        film1.filmRating = 8.5;
        film1.filmDuration = 120;
        film1.nowPlaying();

        film2.filmName = "Small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = 9.0;
        film2.filmDuration = 96;
        film2.nowPlaying();

        film3.filmName = "Crazy Rich Asian";
        film3.filmGenre = "Comedy";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        film3.nowPlaying();

        film4.filmName = "Asih";
        film4.filmGenre = "Horror";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        film4.nowPlaying();

    }
}
