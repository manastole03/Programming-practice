/* You are required to enter a word that consists of x and y  that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 2*x=y.

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be 20.
Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No*/

package myAllJavaProjects;
import java.util.*;
import java.io.*;

public class Zoo
{

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string :");
	String first= sc.nextLine();
	if(first.length()>20)
	{
		System.out.print("string is grater than 20 ");
	}
	char[] word = first.toCharArray();
	int z=0 , o=0;
	
	for(char a : word)
	{
		if(a=='z')
		{
			z++;
		}
		else
		{
			o++;
		}
	}
	if(z*2==o)
	{
		System.out.print("Yes");
	}
	else
	{
		System.out.print("No");
	}
	}

}
