package Enums;

public enum Suit {
    SEA("sea"),
    MOUNTAIN("mountains"),
    WOODLANDS("woodlands"),
    DESERT("desert");

    private final String title;
    private Suit(String title){
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
