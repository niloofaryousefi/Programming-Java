package Arrays;
import java.util.HashMap; 
import java.util.Map;

public class basicHashMap {
	public static void main(String[] args){
		Map<String, Boolean>  Map = new HashMap<String, Boolean>(); 
		Map<String, Boolean> List = new HashMap<String, Boolean>();
		
		Map.put("Arash", true);
		Map.put("Niloo",  false);
		Map.put("Maryam", false);
		Map.put("Ali", true);
		Map.put("Mahtab", true);
		
		List.put("one", true);
		List.put("two", false);
		List.put("three",true);
		List.put("four",false);
		
		
		
		
		System.out.println(Map);
		System.out.println(Map.get("Maryam"));
		 
		if (Map.containsKey("Hello")){
			System.out.println(1);
		}
		
		if (Map.containsValue(Boolean.FALSE)){
			
			System.out.println("2");
			
		}
		System.out.println(Map.keySet());
		
		System.out.println(Map.values());
	
		
		System.out.println(Map.entrySet());
		System.out.println(Map);
		Map.remove("Niloo");
		System.out.println(Map);
		
		System.out.println(Map.get("luara"));
		Map.put("Ali", false);
		System.out.println(Map);
		
		System.out.println(List);
		Map.putAll(List);
		System.out.println(Map);
		
		Map.replace("Arash", true, false);
		System.out.println(Map); 
		
		System.out.println(Map.equals(List));
		System.out.println(Map.equals(Map));
		
	}

}
