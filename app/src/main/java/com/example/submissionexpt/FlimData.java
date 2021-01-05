package com.example.submissionexpt;

import java.util.ArrayList;

public class FlimData {
    private static String[] flimNames = {
            "A Star",
            "Aquaman",
            "Avangers",
            "Birdbox",
            "Bohemian",
            "Bumblebee",
            "Creed",
            "Deadpool",
            "Dragon",
            "Dragonball",

    };

    private static String[] flimDetail = {
            "musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even… ",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people…",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy…",
            "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock n roll band Queen in 1970. Hit songs become instant classics.…",
            "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred…",
            "the former World Heavyweight Champion Rocky Balboa serves as a trainer and mentor to Adonis Johnson, the son of his late friend and former rival Apollo Creed.",
            "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boys life.",
            "For years, old wood carver Mr. Meacham has delighted local children with his tales of the fierce dragon that resides deep in the woods of the Pacific Northwest. To his daughter, Grace, who works as a forest ranger…",
            "Five years have passed since the fight with Piccolo Jr., and Goku now has a son, Gohan. The peace is interrupted when an alien named Raditz arrives on Earth in a spacecraft and tracks down Goku, revealing to him…",
    };

    private static int[] flimImages = {
            R.drawable.poster_a_star,
            R.drawable.poster_aquaman,
            R.drawable.poster_avanger,
            R.drawable.poster_birdbox,
            R.drawable.poster_bohemian,
            R.drawable.poster_bumblebee,
            R.drawable.poster_creed,
            R.drawable.poster_deadpool,
            R.drawable.poster_dragon,
            R.drawable.poster_dragonball

    }; static ArrayList<Flim> getListData() {
        ArrayList<Flim> list = new ArrayList<>();
        for (int position = 0; position < flimNames.length; position++) {
            Flim flim = new Flim();
            flim.setName(flimNames[position]);
            flim.setDetail(flimDetail[position]);
            flim.setPhoto(flimImages[position]);
            list.add(flim);
        }
        return list;
    }
}
