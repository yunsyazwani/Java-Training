package com.yun.sample;
import java.util.*;

public class UtilChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
//		list.add(new.FinalClass());
//		String s = list.get(0);
//		System.out.println("I got " + s);
		
		
		list.add("hello");
		list.add("I");
		list.add("am");
		list.add("arraylist");
		
//		/* for */
//		
//		for(String s : list){
//			System.out.print(s + " ");
//		}
		
		/* while */
		
//		Iterator it = list.iterator();
//		while(it.hasNext()){
//			System.out.print(it.next() + " ");
//		}
		
		
		for(Iterator<?> it = list.iterator(); it.hasNext();){
			String s = (String) it.next();
			if(s.equals("hello"))
				System.out.println("i got " + s);
		}
		
	}

}
