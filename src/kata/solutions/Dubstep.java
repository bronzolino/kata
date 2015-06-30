package kata.solutions;

import java.util.Arrays;
import java.util.Iterator;

public class Dubstep {
    public static String SongDecoder (String song)
    {
        StringBuilder sbi = new StringBuilder();
        Iterator<String> it = Arrays.asList(song.split("WUB")).iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println("|" + s + "|");
            if (!s.equals("")) sbi.append(s).append(" ");
        }
        return sbi.toString().trim();
    }
}