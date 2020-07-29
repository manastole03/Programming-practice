//You are conducting a contest at your college. This contest consists of two problems and  participants. You know the problem that a candidate will solve during the contest.

You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant by performing the following operation:

Use green-colored balloons for the first problem and purple-colored balloons for the second problem
Use purple-colored balloons for the first problem and green-colored balloons for the second problem
You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.

Input format

First line:  T that denotes the number of test cases (1<=T<=10)
For each test case: 
First line: Cost of green and purple-colored balloons 
Second line:  N that denotes the number of participants (1<=n<=10)
Next N lines: Contain the status of users. For example, if the value of the Jth  integer in the  Ith row is 0 , then it depicts that the Ith participant has not solved the Jth problem. Similarly, if the value of the Jth integer in the Ith row is 1 , then it depicts that the  participant has solved the Jth problem.
Output format
For each test case, print the minimum cost that you have to pay to purchase balloons.//

package myAllJavaProjects;
import java.io.*;
import java.util.*;

public class Ballon_problem
{

	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter te number of test cases :");
			int nooftestcases = sc.nextInt();
			
			 // required variables 
			 int min, max, firstCount = 0, secondCount = 0, result; 

			 int noOfStudents; 

			 // logic 
			 for (int k = 0; k < nooftestcases; k++) { 
			  result = 0; // start the new case with 0 
			  // catch the values for each case 
			  int greenPrice = sc.nextInt(); 
			  int purplePrice = sc.nextInt(); 

			  min = Math.min(greenPrice, purplePrice); 
			  max = Math.max(greenPrice, purplePrice); 

			  firstCount = secondCount = 0; // overwrite with 0 so previous values dont affect 
			  noOfStudents = sc.nextInt(); 

			  for (int i = 0; i < noOfStudents; i++) { 
			   // increment by what you get(as 0 wont increment anything ,only 1 will) 
			   firstCount += sc.nextInt(); 
			   secondCount += sc.nextInt(); 
			  } 

			  if (firstCount < secondCount) 
			   result = firstCount * max + secondCount * min; 
			  else 
			   result = firstCount * min + secondCount * max; 

			  System.out.println(result); 
			 } 

			 sc.close(); // avoiding resource leak 

			} 			
}
