package ru.netology.java;

public class AfishaManager {

    private int countFilms = 10;
    private FilmInfo[] films = new FilmInfo[countFilms]; // пустой массив


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
            if (films[index] != null) {
                result[counter] = films[index];
                counter++;
            }
        }
        FilmInfo[] finalResult = new FilmInfo[counter];
        System.arraycopy(result, 0, finalResult, 0, counter);

        return finalResult;
    }

}
