package ru.netology.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FilmInfo {

    private int id;
    private String genre;
    private String name;
    private boolean premiereTomorrow;

}
