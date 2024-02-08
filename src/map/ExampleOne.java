package map;

import java.security.KeyStore;
import java.util.Map.Entry;
import java.util.*;

public class ExampleOne {
	public static void main(String[] args) {
		Map<String, Integer> mp = new LinkedHashMap<>();
        mp.put("Chennai Bus", 600);
        mp.put("Madurai Bus", 550);
        mp.put("Chennai Bus", 580);
        mp.put("Ooty Bus", 550);
              
        Set<String> key = mp.keySet();
                
        Collection<Integer> values = mp.values();
             
        Set<Entry<String, Integer>> es = mp.entrySet();
        for (Entry<String, Integer> entry : es) {
        	//System.out.println(entry);
        	System.out.println(entry.getKey());
        	System.out.println(entry.getValue());
			
		}
	}


}
