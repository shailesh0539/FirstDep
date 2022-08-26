package snippet;

import java.util.ArrayList;

public class NonRepeatedchar
{
	public static void main(String[] args) {

		String s="sssdgghjjjknnsfetef";
		char c[]=s.toCharArray();
		int l=c.length;
		
		for(int i=0;i<l;i++) {
			int count=1;
			for(int j=i+1;j<l;j++) {
				
				if(c[i]==c[j]) {//s==s
					count++;
					c[j]=0;
					
				}
			}
			if(count==1&&c[i]!=0) {System.out.println(c[i]);}
		}
	}
}
