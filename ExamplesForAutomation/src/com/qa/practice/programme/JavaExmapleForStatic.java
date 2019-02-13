package com.qa.practice.programme;

public class JavaExmapleForStatic {

		  /*static int i = 100;
		  static String s = "Rehan Abrahim";
		  //Static method
		  static void display()
		  {
		     System.out.println("i:"+i);
		     System.out.println("i:"+s);
		  }

		  //non-static method
		  void funcn()
		  {
		      //Static method called in non-static method
		      display();
		  }
		  //static method
		  public static void main(String args[])
		  {
			  JavaExmapleForStatic obj = new JavaExmapleForStatic();
			  //You need to have object to call this non-static method
			  obj.funcn();
			  
		      //Static method called in another static method
		      display();
		   }*/
	
	
	int x;
	static int y;
	
	public void f1(){
		System.out.println("Instance method calling");
	}
	public static void f2(){
		System.out.println("Static method calling");
	}
	
	public static void main(String args[]){
		
		JavaExmapleForStatic js=new JavaExmapleForStatic();
		js.f1();
		JavaExmapleForStatic.f2();
		
	    
	}
	
}	  




	
	
	
	

