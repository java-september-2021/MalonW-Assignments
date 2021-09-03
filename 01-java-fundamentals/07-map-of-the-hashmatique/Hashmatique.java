import java.util.Set;
import java.util.HashMap;
public class Hashmatique {
    public static void main(String[]args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Workin' On", "Chasing after that dollar like it'll slow down my hurry");
        trackList.put("Drivin' Around Song", "Man you ever just wanna, go riding around");
        trackList.put("Chicken and Biscuits", "Lord have mercy here she comes");
        trackList.put("Reload","Oceans apart day after day");
        String name = trackList.get("Workin' On");

        System.out.println("Song Lyrics for Workin' On ::"+ name );
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }

    }
}








