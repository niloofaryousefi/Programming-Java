package Arrays;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
public class basicHashSet {
	
	
	
	public static void main(String[] args){
		Map<String, String> hashlist = new LinkedHashMap<String, String>();
		Map<String, Integer> list = new Hashtable<String, Integer>();
		//hashlist.add("Niloo");
		//hashlist.add("Arash");
		hashlist.put("Saeed","Maryam");
		hashlist.put("Saeed","Mahtab");
		hashlist.put("Saeed","Ali");
		hashlist.put("Pouran","Mahsa");
		hashlist.put("Pouran","Hassan");
		hashlist.put("touran","Mahmood");
		hashlist.put("touran","Farooq");
		hashlist.put("Soori", "Bahareh");
		hashlist.put("Soori","Behnaz");
		hashlist.put("Soori","Behrooz");
		
		hashlist.put("Zari","Nima");
		hashlist.put("Zari","Nikoo");
		hashlist.put("Farhad","Farnaz");
		hashlist.put("Farhad","Farnoush");
		hashlist.put("Susan","Sahar");
		hashlist.put("Susan","Sara");
		hashlist.put("Roya","Amir");
		hashlist.put("Roya","Rasoul");
		hashlist.put("Roya","Hossein");
		hashlist.put("Fariborz","Elmira");
		hashlist.put("Fariborz","Farzad");
		hashlist.put("Fariborz","Nastaran");
		

	
		System.out.println(hashlist);
		
		System.out.println(hashlist.size());
		
		
		list.put("X", 1 );
		list.put("Y", 6 );
		list.put("Z", 3 );
		list.put("A", 2 );
		list.put("B", 0 );
		System.out.println(list);
		
	}

}
