package ru.netology.manager;


public class PosterManager {


    protected Poster[] posters = new Poster[0];
    private int maxLimit = 9;
    private int minLimit;
    private int currentLimit ;


    public PosterManager(int limit) {
        Poster[] posters = new Poster[limit];
        this.maxLimit = minLimit + limit ;

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

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public Poster[] findLast() {
        int resultLength= maxLimit;

        if (posters.length>= maxLimit) {
            resultLength = maxLimit;
        } else {
            resultLength = posters.length;

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




















