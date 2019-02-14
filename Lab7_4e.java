package Array;
import java.lang.Math;
import java.util.*;

public class Lab7_4 {
public static void main(String args[]) {
	
	List<Integer> l=new ArrayList();
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	for(int i=0;i<a;i++) {
	int a1=s.nextInt();
	l.add(a1);
	}
		
	HashMap<Integer,Double> m=new HashMap<Integer,Double>();
for(int i=0;i<a;i++) {
	m.put(l.get(i), Math.pow(l.get(i), 2));
	}
	for(Map.Entry m1:m.entrySet())
		System.out.println(m1.getKey()+" "+m1.getValue());
}
}
