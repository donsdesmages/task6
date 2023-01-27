import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Collection  {

    static String GetCommandTen = "[COMMAND]-";
    static String CommandEleven = "[COMMAND]-";
    static String getCommandTen1 = "10";
    static String commandEleven = "11";

    public  void Get1 () {
        List<LocalTime> localTimes = new ArrayList<>();
        localTimes.add(LocalTime.of(8,00));
        localTimes.add(LocalTime.of(8,30));
        localTimes.get(0);
        localTimes.get(1);
        System.out.println( GetCommandTen + getCommandTen1 + " " +localTimes.get(0));
        System.out.println( CommandEleven + commandEleven + " " +localTimes.get(1));
    }
    public void Get2 () {
        List<LocalTime> localTimes = new ArrayList<>();
        localTimes.add(LocalTime.of(9,00));
        localTimes.add(LocalTime.of(9,30));
        localTimes.get(2);
        localTimes.get(3);
        System.out.println( GetCommandTen + getCommandTen1 + " " +localTimes.get(2));
        System.out.println( CommandEleven + commandEleven + " " +localTimes.get(3));
    }
    public void Get3 () {
        List<LocalTime> localTimes = new ArrayList<>();
        localTimes.add(LocalTime.of(10,00));
        localTimes.add(LocalTime.of(10,30));
        localTimes.get(4);
        localTimes.get(5);
        System.out.println( GetCommandTen + getCommandTen1 + " " +localTimes.get(4));
        System.out.println( CommandEleven + commandEleven + " " +localTimes.get(5));
    }
    public static void Get4 () {
        List<LocalTime> localTimes = new ArrayList<>();
        localTimes.add(LocalTime.of(11,00));
        localTimes.add(LocalTime.of(11,30));
        System.out.println( GetCommandTen + getCommandTen1 + " " + localTimes.get(6));
        System.out.println( CommandEleven + commandEleven + " " + localTimes.get(7));

    }
    public static LocalTime GetLocalTimeForMorningDoWater1 () {
        List<LocalTime> localTimes = new ArrayList<>();
        localTimes.add(LocalTime.of(8,00));
        localTimes.get(0);
        return localTimes.get(0);
    }

}


