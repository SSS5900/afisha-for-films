package ru.netology.afisha;

public class AfishaManager {


    private String[] films = new String[0];

    private int limit;

    public AfishaManager() {
        this.limit = 5;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }


    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }


    public String[] findAllFilm() {
        return films;
    }


    public String[] findLastFilm() {
        int needResult;
        if (films.length < limit) {
            needResult = films.length;
        } else {
            needResult = limit;
        }

        String[] reversed = new String[needResult];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }


}


