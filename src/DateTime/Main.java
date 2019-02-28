package DateTime;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.registry.LocateRegistry;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner keyboard = new Scanner(System.in);

        Date jTree = new GregorianCalendar(1987, 3, 9).getTime();
        Date rHum = new GregorianCalendar(1988, 10, 10).getTime();
        Date today = new Date();

        Calendar jtCal = Calendar.getInstance();
        Calendar tCal = Calendar.getInstance();
        Calendar rCal = Calendar.getInstance();

        jtCal.setTime(jTree);
        tCal.setTime(today);
        rCal.setTime(rHum);

        Integer yrs = tCal.get(Calendar.YEAR) - jtCal.get(Calendar.YEAR);
        Integer mnt = jtCal.get(Calendar.MONTH) - tCal.get(Calendar.MONTH);
        Integer day = tCal.get(Calendar.DATE) - jtCal.get(Calendar.DATE);

        Integer jtRhYrs = rCal.get(Calendar.YEAR) - jtCal.get(Calendar.YEAR);
        Integer jtRhMnt  = rCal.get(Calendar.MONTH) - jtCal.get(Calendar.MONTH);
        Integer jtRhDay = rCal.get(Calendar.DATE) - jtCal.get(Calendar.DATE);

        tCal.add(Calendar.DATE, jtRhDay);
        tCal.add(Calendar.MONTH, jtRhMnt);
        tCal.add(Calendar.YEAR, jtRhYrs);

        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
        String releaseDate = sdf.format(tCal.get(Calendar.DAY_OF_MONTH));

        System.out.println("Joshua Tree was released " + yrs + " years " + mnt + " months and " + day + " days ago.");

        System.out.println("Rattle and Hum was released " + jtRhYrs + " years " + jtRhMnt + "months and " +
                jtRhDay + " days later.");

        System.out.println("If Joshua Tree was released today, and it took the same amount of time to release" +
                " Rattle and Hum.\nThen Rattle and Hum would be released on " + releaseDate );









    }


}
