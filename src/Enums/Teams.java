package Enums;

public enum Teams {
    ATL("Atlanta", "Hawks"), BKN("Brooklyn", "Nets"), BOS("Boston", "Celtics"), CHA("Charlotte", "Hornets"),
    CHI("Chicago", "Bulls"), CLE("Cleveland", "Cavaliers"), DAL("Dallas", "Mavericks"), DEN("Denver", "Nuggets"),
    DET("Detroit", "Pistons"), GSW("Golden State", "Warriors"), HOU("Houston", "Rockets"), IND("Indiana", "Pacers"),
    LAC("Los Angeles", "Clippers"), LAL("Los Angeles", "Lakers"), MEM("Memphis", "Grizzlies"), MIA("Miami", "Heat"),
    MIL("Milwaukee", "Bucks"), MIN("Minnesota", "Timberwolves"), NOP("New Orleans", "Pelicans"), NYK("New York", "Knicks"),
    OKC("Oklahoma City", "Thunder"), ORL("Orlando", "Magic"), PHI("Philadelphia", "76ers"), PHX("Phoenix", "Suns"),
    POR("Portland", "Trail Blazers"), SAC("Sacramento", "Kings"), SAS("San Antonio", "Spurs"), TOR("Toronto", "Raptors"),
    UTA("Utah", "Jazz"), WAS("Washington", "Wizards");
    private String city;
    private String name;

    Teams(String city, String name) {
        this.city = city;
        this.name = name;
    }


    public String getCity()
    {
        return city;
    }

    public String getName()
    {
        return name;
    }

}
