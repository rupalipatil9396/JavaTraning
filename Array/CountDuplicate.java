package ass1;

import java.util.HashMap;

/*  WAP to find duplicate numbers and there counting from list of numbers*/

public class CountDuplicate {
public static void main(String[] args) {
		
		int[] arr= {2,4,5,2,6,2,4,6};
		
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int x:arr) {
			if(hm.containsKey(x)) {
			int count=hm.get(x);
			hm.put(x, count+1);
			}
			else {
				hm.put(x, 1);
			}
				
		}System.out.println(hm);
		
		
	}


}
