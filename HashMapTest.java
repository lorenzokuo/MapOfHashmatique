import java.util.HashMap;
import java.util.Set;
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("song1","lyrics1");
		trackList.put("song2","lyrics2");
		trackList.put("song3","lyrics3");
		trackList.put("song4","lyrics4");

		String x = trackList.get("song1");
		System.out.println("The lyrics is: " + x);

		Set<String> lyrics = trackList.keySet();
		for(String track : lyrics) {
			System.out.println(track);
			System.out.println(trackList.get(track));
		}
	}
}