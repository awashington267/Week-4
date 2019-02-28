package Enums;

import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Teams[] NbaTeams;


        System.out.println("Who is your favorite NBA team?");
        String name = keyboard.nextLine();



        String search = name.substring(0, 3);
        search = search.toLowerCase();

        NbaTeams = Teams.values();

        for(Teams aTeam : NbaTeams)
        {
            if(aTeam.getCity().toLowerCase().matches("(.*)" + search + "(.*)") ||
            aTeam.getName().toLowerCase().matches("(.*)" + search + "(.*)"))
            {
                System.out.println("Your team abbreviation is " + aTeam);
                printName(aTeam);
            }
        }


    }
    public static void printName(Teams aTeam)
    {
        System.out.println(aTeam.getCity() + " " + aTeam.getName());
    }
}
