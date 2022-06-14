package ru.netology.manager;


public class PosterManager {


    protected Poster[] posters = new Poster[0];


    public PosterManager(int limit) {
        Poster[] posters = new Poster[limit];
        this.posters = posters;

    }

    public PosterManager() {
        //Poster[]posters = new Poster[10];
        // this.posters=posters;

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
        int resultLength = posters.length + 1;
        if (resultLength > 10) {
            resultLength = 9;
        } else {
            resultLength = resultLength - 1;
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
















