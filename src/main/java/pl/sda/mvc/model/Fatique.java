package pl.sda.mvc.model;

public enum Fatique {

    TIRED("tired"), NOTTIRED("nottired"), SLEAPING("sleaping");


    private String title;

    Fatique( String title){
        this.title = title;
    }

}
