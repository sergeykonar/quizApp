package hash;

import java.util.HashMap;

public class Capitals {
	
	private static HashMap<String, String> capitals = new HashMap<String, String>();
	
	static {
		capitals.put("Ukraine", "Kyiv");
		capitals.put("Russia", "Moscow");
		capitals.put("Belarus", "Minsk");
	}
	
	public String findCountryByCapital(String capital) {
		
		return capitals.get(capital);
	}

	
	
}
