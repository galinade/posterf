package ru.netology.manager;

public class PosterManager {
    private String[] movies;

    public void setMovies(String[] movies) {
        this.movies = movies;
    }

    private int currentLimit;

    public int getCurrentLimit() {
        return currentLimit;
    }

    public void setCurrentLimit(int currentLimit) {
        this.currentLimit = currentLimit;
    }

    private int maxLimit = 10;
    private int minLimit;

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public PosterManager(int limit) {

        this.maxLimit = minLimit + limit - 1;
    }


    public PosterManager() {

    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public int getMinLimit() {
        return minLimit;
    }

    public static void posterManager(String[] args) {
        String[] movies = {"Бладшот",
                "Вперёд",
                "Отель Белград",
                "Джентльмены",
                "Человек-невидимка",
                "Тролли",
                "Номер один",
                "Восемь",
                "Девять",
                "Десять"

        };

        String newMovie = "Одиннадцать";

        String[] movies1 = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            movies1[i] = movies[i];
        }
        movies1[movies1.length - 1] = newMovie;
        movies = movies1;
    }


    public String[] getMovies() {
        return movies;
    }

    // public String[] getAll() {//
    // return movies.findAll();//


    public void setResultLength(int resultLength) {
        if (resultLength > maxLimit) {
            resultLength = currentLimit;
        } else {
            resultLength = maxLimit;
        }
        String[] result = new String[resultLength];

        for (int i = 0; i < resultLength; i++) {
            currentLimit = resultLength - i - 1;
            result[i] = result[currentLimit];
        }


    }
}











