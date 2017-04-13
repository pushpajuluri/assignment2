package assignment;

public class swap {
	String s="";
 public String swapnn(int x,int y){
	 x = x + y;  
	  y = x - y;  
	  x = x - y;
	 s=s+String.valueOf(x)+String.valueOf(y);
	 return s;
 }
}
