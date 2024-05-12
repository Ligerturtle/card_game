package Enums;

public enum Face {
    SOLDIER("soldier", 1,1),
    BRUTE("brute",2,2),
    ASSASSIN("assassin",3,3),
    GENERAL("general",4,4),
    QUEEN("queen",5,5),
    KING("king",6,6),
    COLOSSUS("colossus",7,7),
    NECROMANCER("necromancer",8,7),
    ABOMINATION("abomination",9,7),
    LEGEND("legend", 10,8),
    TOTEM("totem",11,10),
    BOMBARDIER("bombardier",12,10),
    ALCHEMIST("alchemist",13,10);
    private final String name;
    private final int rank;
    private final int value;

    private Face(String name, int rank, int value){
        this.name = name;
        this.rank = rank;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getRank() {
        return rank;
    }
}
