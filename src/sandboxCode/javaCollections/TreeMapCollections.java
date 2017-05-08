package sandboxCode.javaCollections;

import java.util.TreeMap;

public class TreeMapCollections {

	static TreeMap<String, Boolean> map = new TreeMap<>();
	public static void main(String[] args) {
		
		//Creating values for the names
				map.put("Kenny", true);
				map.put("Robert", false);
				map.put("Samantha", false);
				map.put("Zorro", true);
				map.put("Aaron", false);
				map.put("Eduardo", false);
				
				
				System.out.println(map);
				
				if(map.containsValue(Boolean.FALSE)) System.out.println(map);
				
				else System.out.println("There are no False Values");
				
				
		

	}

}
