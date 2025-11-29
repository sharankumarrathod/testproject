package githubNewProject;

import java.util.HashMap;
import java.util.Map;

public class MapEntryChecking {
	public static void main(String[] args) {
		
		Map<String,String > StateCapital = new HashMap<String, String>();
		StateCapital.put("karantak", "benagaluru");
		StateCapital.put("maharatstra", "mubai");
		StateCapital.put("kerala", "kochi");
		StateCapital.put("telagana", "hydrabad");
		StateCapital.put("telagan", "amravati");
		StateCapital.put("telagana", "secundrabad");
		
		System.out.println(StateCapital.keySet()+"    "+StateCapital.values());
		
	}

}
