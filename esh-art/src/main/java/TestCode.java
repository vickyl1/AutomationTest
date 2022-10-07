import java.lang.reflect.Array;
import java.util.Arrays;

import org.apache.commons.lang3.text.StrBuilder;

import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class TestCode {

	//print Factorial function test
	public int fact(int n)
	{ int f=1,i;
	for(i=1;i<=n;i++)
	{
		f=f*i;
	}
	System.out.println("FACTORILA OF "+n+" NUMBER IS "+f);
	return f;

	}

	public void palindrome(String s) {
		String rev=s;
		int c=rev.length();
		
		String y = new String();
		for(int i=c-1;i>=0;i--) {
			
			y=y+rev.charAt(i);
		}
		System.out.println("Reverse of String is= "+y);
	}
 public void palimdromePreFun(String s)
 {  StringBuilder sb= new StringBuilder(s);
	 
	 sb.reverse();
	
	 String rev=sb.toString();
	 if(s.equals(rev))
	 {
		 System.out.println("string "+s+" is equals to "+rev);
	 }
	 else
		 System.out.println("string "+s+" is not equals to "+rev);
 }
 
 public void revString(String s)
 {   String s1=s;
	 char str1[]=s.toCharArray();
	 System.out.println("Reverse of String "+s1+ " is ");
	 for (int i=str1.length-1;i>=0;i--)
	 {   
		 System.out.print(str1[i]);
	 } 

	
 }
 
 
 
 public void removeDuplicateChar(String s)
 {  StringBuffer sb=new StringBuffer(s);
  
	 int len= s.length();
	 int i,j;
	 char s1[]=new char[len-1];
	 char s2[]=new char[len-1];
	 for(i=0;i<=len-1;i++)
	 {
		 for(j=len-1;j!=i;j--)
		 {  
			 if(s.charAt(i)!=s.charAt(j))
			 {
				s2[i] =s.charAt(i);
			 }
			 else
				s1[i]=s.charAt(i);
		 }
	 } 
	 
	 System.out.println(s1);
	 System.out.println(s2);
	 
	 
 }
 public void sortaAryDesc()
 {
	 int a[]= {1,2,8,5,3,4};
	 int alen=a.length;
	 int i;
	 Arrays.sort(a);
	 System.out.println("Sorting of array in descending order");
	 for(i=alen-1;i>=0;i--)
	 { 
	 System.out.print(a[i]+", ");
	 }
 }
 void sortArrayAsc()
 {
 int a[]= {9,1,2,8,5,3,4};
  int len= a.length;
  Arrays.sort(a);
  System.out.println("Sorting of array in ascending order");
  for(int i=0;i<=len-1;i++)
  {
	  System.out.print(a[i]+", ");
  }
 }
 
 void swapWithThird(int a,int b)
 {
 int temp=0;

 temp=b;
 b=a;
 a=temp;
System.out.println("Valu0f a="+a+" value of b="+b);
 }
 
 void swapWithoutthird(int a,int b)
 {
   
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("Valu0f a="+a+" value of b="+b);
 }
 
 void sortWithoutArrayMethod()
 {
   int a[]={9,2,10,1,7,5};
  
  int len=a.length;
 int i,j,temp;
  for(i=0;i<=len-1;i++)
   { for (j=i;j<=len-1; j++)
      {
        if(a[i]>a[j])
      { 
        temp=a[i];  
       a[i]=a[j];
       a[j]=temp;
       }}
   System.out.println(a[i]);  
   } 
 }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		TestCode tc=new TestCode();
/*
		tc.fact(6);
        tc.palindrome("TEST");
        tc.palimdromePreFun("VickyLote");
       tc.revString("Rakuten");
        
        */
		tc.sortWithoutArrayMethod();
		tc.sortaAryDesc();
		tc.sortArrayAsc();
		tc.swapWithThird(2,4);
		tc.swapWithoutthird(2, 4);
    	//tc.removeDuplicateChar("JAVA");
		
		//String s = "JAVA";
		//System.out.println("remove duplicate :"+s.replace("A", ""));
	}
}
