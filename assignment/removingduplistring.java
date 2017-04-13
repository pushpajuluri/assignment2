package assignment;

public class removingduplistring {
	public String removi(int s[]){
		
	
		int l=0;
		if(s!=null)
		
	
	
	 l=s.length;
	
	String ans="";
	for(int i=0;i<l;i++)
		{
		
		
			ans=ans+s[i];
		s[i]=0;
		
		
		}
	
	return ans;
	}

}
