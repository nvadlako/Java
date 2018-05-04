package Collections;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.List;

public class ArrayListEx  {
		
	public static void main(String[] args) {
		List pList = new ArrayList();
			
		 pList.add("Michael");
		 pList.add("Kumar");
		 pList.add("Lakshmi");
		 pList.add("Swati");
		 
		 Iterator pstIterator = pList.listIterator();
		 System.out.println("Student Names");
		 while(pstIterator.hasNext()) {
			 String pStudent = (String)pstIterator.next();
			 System.out.println(pStudent);
		 }
	}
	
}
