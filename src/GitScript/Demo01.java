package GitScript;

import org.testng.annotations.Test;

public class Demo01 {
@Test
public void reverse()
{
	String s="Deepa";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{	
	rev= rev+s.charAt(i);
	}
		System.out.println(rev);
			}

}
