import java.util.*;
import java.util.Scanner;
class employee{
		String Address,Name;
		int joining_yr,salary;
		public void discription() {
			System.out.println("Name- "+Name+", Year of joining- "+joining_yr+", Address- "+Address+", Salary- "+salary);
		}
	}
public class empo {
public static void main(String[] args) {
		employee Robert=new employee();
		employee Sam=new employee();
		employee Jhon=new employee();
		Robert.Name="Robert";
		Robert.joining_yr=1994;
		Robert.Address="64C-WallsStreat";
		Robert.salary=50000;
		Sam.Name="Sam";
		Sam.joining_yr=2000;
		Sam.Address="68D-WallsStreat";
		Sam.salary=30000;
		Jhon.Name="Jhon";
		Jhon.joining_yr=1999;
		Jhon.Address="68D-WallsStreat";
		Jhon.salary=40000;
		Robert.discription();
		Sam.discription();
		Jhon.discription();
	}
}
