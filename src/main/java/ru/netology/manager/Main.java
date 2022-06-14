package ru.netology.manager;


public class Main {
    public static void main(String[] args) {
        PosterManager manager = new PosterManager();
        manager.save(new Poster(1, "Бладшот"));
        manager.save(new Poster(2, "Вперёд"));
        manager.save(new Poster(3, "Отель Белград"));
        manager.save(new Poster(4, "Джентльмены"));
        manager.save(new Poster(5, "Человек-невидимка"));
        manager.save(new Poster(6, "Тролли"));
        manager.save(new Poster(7, "Номер один"));
        manager.save(new Poster(8, "Восемь"));
        manager.save(new Poster(9, "Девять"));
        manager.save(new Poster(10, "Десять"));
        manager.save(new Poster(11, "Одиннадцать"));
        // Poster[]  all = manager.findAll();
    }
    //Poster repo = new Poster();

    //repo.save(m1);
    //repo.save(m2);
    //repo.save(m3);
    //repo.save(m4);
    //repo.save(m5);
    //repo.save(m6);
    //repo.save(m7);
    //repo.save(m8);
    //repo.save(m9);
    //repo.save(m10);
    //repo.save(m11);


}






