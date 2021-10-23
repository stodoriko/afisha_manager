package ru.netology.java.manager;

import lombok.Data;
import ru.netology.java.domain.FilmInfo;

public class AfishaManager {

    private int countFilms = 10;
    private FilmInfo[] films = new FilmInfo[countFilms];


    public AfishaManager() {
        this.countFilms = 10;
    }

    public AfishaManager(int countFilms) {
        this.countFilms = countFilms;
    }


    public void addFilm(FilmInfo film) {
        int length = films.length + 1;
        FilmInfo[] tmp = new FilmInfo[length];
//        System.arraycopy(films, 0, tmp, 0, length - 1);
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }


        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public FilmInfo[] getFilms() {
        FilmInfo[] result = new FilmInfo[countFilms];
        int counter = 0;
        for (int i = 0; i < countFilms; i++) {
            int index = films.length - i - 1;
            result[counter] = films[index];
            counter++;

        }
        FilmInfo[] finalResult = new FilmInfo[counter];
        System.arraycopy(result, 0, finalResult, 0, counter);

        return finalResult;
    }

}
