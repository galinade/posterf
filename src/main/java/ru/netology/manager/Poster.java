package ru.netology.manager;


public class Poster {
    private int id;
    private String movie;
    private int resultLength;


    public int getId() {
        return id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Poster(int id, String movie) {
        this.id = id;
        this.movie = movie;
    }


    public Poster() {

    }


    public Poster[] findAll() {

        return new Poster[10];
    }


    public void save(Poster poster) {
    }


    // public void setPosters(Poster[] posters) {
    //     this.posters = posters;
    //  }

    public int getResultLength() {
        return resultLength;
    }

    public void setResultLength(int resultLength) {
        this.resultLength = resultLength;
    }
}



