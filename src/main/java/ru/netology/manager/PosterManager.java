package ru.netology.manager;


public class PosterManager {

    protected Poster[] posters = new Poster[0];
    private int maxLimit = 10;


    public PosterManager(int limit) {

        this.maxLimit = limit;

    }

    public PosterManager() {


    }


    public void save(Poster poster) {
        int length = posters.length + 1;
        Poster[] tmp = new Poster[length];

        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;

        posters = tmp;
    }

    public Poster[] findAll() {
        return posters;
    }


    public Poster[] findLast() {
        int resultLength;

        if (maxLimit > posters.length) {
            resultLength = posters.length;
        } else {
            resultLength = maxLimit;

        }

        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = resultLength - i - 1;
            result[i] = posters[index];
        }
        return result;
        // заполняем result из массива что лежит в поле
        // в обратном порядке
    }
}




















