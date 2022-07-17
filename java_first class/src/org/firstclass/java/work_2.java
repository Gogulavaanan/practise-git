package org.firstclass.java;

public class work_2 {
	
	/* two types of method -- return & non return
	 * non return is void method
	 */
	
	void conversion()
	{
		//int a = 10;
		//int b = null; 
		//String ab = null;
		
		
		/*int,float,char,double,boolean,short,long (started with small letter) is a primitive (not accepted null),
        string is a non primitive (accept null)*/

		
		   /*     int a = 10;
				float b = 10.05f; 
				double bs = 10.05;  
				
				System.out.println(a+bs); */
				
			  /*  String a = "10";
				int b = 20;
			    int c = Integer.parseInt(a); //WRAPPER
				System.out.println(c+b);  */
		
		     /*  String xa = "10.05f";
		       int x = 10;
		       float a = Float.parseFloat(xa);
		       System.out.println(x+a); */
		
		
			/*	String a = "10";
				int b = 20;
			    int c = Integer.parseInt(a);
				System.out.println(c+b); */
		
		
	  /*  
	         	String a = "10.05";
	         	int b = 20;
	            double c = Double.parseDouble(a);
		        System.out.println(c+b); */
	}
	
	void hashcode()
	{
		/*	String ab = "besant";
		System.out.println(ab);
		String bc = "welcome";
		System.out.println(bc);
		System.out.println(ab.hashCode());
		System.out.println(bc.hashCode()); */
				Integer a = 10;
				Integer b = 10;
				System.out.println(a.hashCode());
				System.out.println(b.hashCode());
				
				
				
				/* stack and heap
				 * stack memory used for temporary ( addresss of variable = hashcode)
				 * 
				 * heap stores "welcome" in string constant pool (it only for string)
				 * string constant pool is inside a heap
				 * 
				 * 
				 * Integer a = 10 is stored in heap not in string constant pool
				 */
				
	/*	String cb = "Besant"; // string literals
		String cb1 = new String ("Besant"); // new object but same hashcode
		System.out.println(cb.hashCode());
		System.out.println(cb1.hashCode());
		*/
	}
	
	

}
