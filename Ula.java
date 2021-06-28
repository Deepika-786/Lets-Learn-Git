package prac;

import java.util.HashMap;
import java.util.Map;

public class Ula {
	public static void main(String args[]) {
		String arr[]=new String[]{"FAToil","FIBERmeat","CARBvegie","FATmeat","FIBERvegie","FATdairy","CARBVegie","CARBVegie"};
		Map<String,Integer> hM=new HashMap<>();
		int ingredient_counter=0;
//		List<Integer> list=new ArrayList<Integer>();
		hM.put("FAT",0);
		hM.put("FIB",0);
		hM.put("CAR",0);
		int k=4;
		
		double percent=Math.ceil(0.6*k);
		
		for(String x:arr) {
			    
			   if(x.substring(0, 3).equals("FAT")) {
				   ingredient_counter+=1;
				   hM.put("FAT",hM.get("FAT")+1);
			   }
			   else if(x.substring(0,3).equals("FIB")) {
				   ingredient_counter+=1;
				   hM.put("FIB",hM.get("FIB")+1);
			   }
			   else if(x.substring(0,3).equals("CAR")){
				   ingredient_counter+=1;
				   hM.put("CAR",hM.get("CAR")+1);
			   }
			   else
				   System.out.println("Invalid Ingredient!");	
			   
			
			   
			   if(ingredient_counter>=k) {
				   if(hM.get("FIB")>=percent) {
					   int temp=(int)(k-percent);
					   for(int i=0;i<arr.length;i++) {
						   String str=arr[i].substring(0,3);
						   if(str.equals("FIB")) {
							   System.out.print(arr[i]);  
							   arr[i]="-";
							   ingredient_counter-=1;
							   hM.put("FIB", hM.get("FIB")-1);
						   }
						   else if(temp>0) {
							   System.out.print(arr[i]); 
							   String st=arr[i].substring(0, 3);
							   arr[i]="-";
							   temp--;
							   ingredient_counter-=1;
							   hM.put(str, hM.get(str)-1);
						   }
					   }
				   }
				  else if(hM.get("FAT")>=percent) {
					   int temp=(int)(k-percent);
					   for(int i=0;i<arr.length;i++) {
						   if(!arr[i].equals("-")) {
							   String str=arr[i].substring(0,3);
							   if(str.equals("FAT")) {
								   System.out.print(arr[i]);  
								   arr[i]="-";
								   ingredient_counter-=1;
								   hM.put("FAT", hM.get("FAT")-1);
							   }
							   else if(temp>0) {
								   System.out.print(arr[i]);  
								   String st=arr[i].substring(0, 3);
								   arr[i]="-";
								   temp--;
								   ingredient_counter-=1;
								   hM.put(str, hM.get(str)-1);
							   }
						   }						  
					   }
				   }
				  else if(hM.get("CAR")>=percent) {
					  
					   int temp=(int)(k-percent);
					   for(int i=0;i<arr.length;i++) {
						   if(!arr[i].equals("-")) {
							   String str=arr[i].substring(0,3);
							   if(str.equals("CAR")) {
								   System.out.print(arr[i]);  
								   arr[i]="-";
								   ingredient_counter-=1;
								   hM.put("CAR", hM.get("CAR")-1);
							   }
							   else if(temp>0) {
								   System.out.print(arr[i]);  
								   String st=arr[i].substring(0, 3);
								   arr[i]="-";
								   temp--;
								   ingredient_counter-=1;
								   hM.put(str, hM.get(str)-1);
							   }
						   }
					   }
				   }
				   
				   else
					   System.out.print("-");
			   }		   
		       else
			      System.out.print("-");			
		}
	}
}
