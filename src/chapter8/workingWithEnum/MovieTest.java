package chapter8.workingWithEnum;

import java.util.EnumSet;

public class MovieTest {
    public static void main(String[] args) {
        System.out.println("      Legendary Movies");
        for(Movie movie : Movie.values()){
            System.out.printf("%-10s%-16s%5s", movie, movie.getFilmTitle(), movie.getFilmProductionYear());
            System.out.println();
        }
        System.out.println();
        System.out.println("Range of movies::::::::::::::::::::");
        for(Movie movie: EnumSet.range(Movie.HBO, Movie.STARZ)){
            System.out.printf("%-10s%-16s%5s", movie, movie.getFilmTitle(), movie.getFilmProductionYear());
            System.out.println();
        }
    }
}
