package introduction;
class Student{
	String name;
	int roll_no;
public void intro(){
 		System.out.print("Student name is - "+name+" \nRoll no. is - "+roll_no);
 	}}
public class first_class {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="Jhon";
		student1.roll_no=2;
		student1.intro();
 }
}
