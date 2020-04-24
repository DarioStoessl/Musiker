package com.company;

public class Band  {

    Singer singer;
    Guitar guitar;
    Drums drums;
    Bass bass;


    public Band (Singer singer, Guitar guitar, Drums drums, Bass bass) {

        this.singer = singer;
        this.guitar = guitar;
        this.drums = drums;
        this.bass = bass;

    }

    public void Jamming () {

        System.out.println(singer.Sound);
        System.out.println(guitar.Sound);
        System.out.println(drums.Sound);
        System.out.println(bass.Sound);


    }

    public void tournament() {





    }

}

