package ru.netology.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerNoArgsTest {

    AfishaManager afishaManager = new AfishaManager();

    FilmInfo first = new FilmInfo(1, "Боевик", "Крепкий орешек", false);
    FilmInfo second = new FilmInfo(2, "Комедия", "Один дома", true);
    FilmInfo third = new FilmInfo(3, "Ужасы", "Челюсти", false);
    FilmInfo fourth = new FilmInfo(4, "Боевик", "Кикбоксёр", true);
    FilmInfo fifth = new FilmInfo(5, "Триллер", "Семь", false);
    FilmInfo sixth = new FilmInfo(6, "Мелодрамма", "Умница Уилл Хантинг", true);
    FilmInfo seventh = new FilmInfo(7, "Боевик", "Лучшие из лучших 3", true);
    FilmInfo eighth = new FilmInfo(8, "Комедия", "Соседка", false);
    FilmInfo ninth = new FilmInfo(9, "Комедия", "Каспер", false);
    FilmInfo tenth = new FilmInfo(10, "Боевик", "Отчаяннный", false);

    @BeforeEach
    void toPrepare() {
        afishaManager.addFilm(first);
        afishaManager.addFilm(second);
        afishaManager.addFilm(third);
        afishaManager.addFilm(fourth);
        afishaManager.addFilm(fifth);
        afishaManager.addFilm(sixth);
        afishaManager.addFilm(seventh);
        afishaManager.addFilm(eighth);
        afishaManager.addFilm(ninth);
        afishaManager.addFilm(tenth);
    }

    @Test
    public void shouldSave() {
        afishaManager.addFilm(first);
        FilmInfo[] expected = new FilmInfo[] {
                first, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second
        };
        FilmInfo[] actual = afishaManager.getFilms();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        FilmInfo[] actual = afishaManager.getFilms();
        FilmInfo[] expected = {
                tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first
        };
        assertArrayEquals(expected, actual);
    }
}
