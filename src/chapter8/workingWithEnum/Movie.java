package chapter8.workingWithEnum;

public enum Movie {
    HBO("Game of Thrones", "2011"),
    SONYMAX("Prison  Break", "2007"),
    STARZ("Spatacus", "2009"),
    OLASCO("Koto Aye", "2005"),
    FILMCO("Diche", "2022");

    private String filmTitle;
    private String filmProductionYear;

    private Movie(String filmTitle, String filmProductionYear){
        this.filmTitle = filmTitle;
        this.filmProductionYear = filmProductionYear;
    }

    public String getFilmTitle(){
        return filmTitle;
    }
    public String getFilmProductionYear(){
        return filmProductionYear;
    }
}
