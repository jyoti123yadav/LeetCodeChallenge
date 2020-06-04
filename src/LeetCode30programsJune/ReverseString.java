package LeetCode30programsJune;

public class ReverseString {
	
	public static void reverse(char[] t)
	{
		int a=0;
		int b=t.length-1;
		while(a<=b)
		{
			char temp=t[a];
			t[a]=t[b];
			t[b]=temp;
			
			a+=1;
			b-=1;
		}

	
	
}

}
