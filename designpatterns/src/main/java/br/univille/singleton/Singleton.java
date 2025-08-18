package br.univille.Singleton;

public class Singleton {
    //parece como um variavel global(Static)
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton
        }
        return instance;
    }
}
