package Array;
import java.util.*;

import java.lang.*;
public class Lab7_5 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=0;i<a;i++) {
		String a1=s.next();
		l.add(a1);
		}
		System.out.println(l);
		//for(String j:l)
		//{		
			String [] s1=new String[l.size()];
			s1=l.toArray(s1);
		Arrays.sort(s1);	
		//}
		for(String o:s1) {
			System.out.println(o);
		}
		 
		//StringBuilder sb=new StringBuilder(s);
	}