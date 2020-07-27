package introduction;
class students{
	int roll_no,phone_no;
	String name,address;
	public void introd() {
		System.out.println("Name- "+name+"  Roll.no- "+roll_no+"  Phone.no-"+phone_no+"  Address- "+address);
	}
}
public class two_students {
	public static void main(String[] args) {
		students Sam=new students();
		students Jhon=new students();
		Sam.name="Sam";
		Sam.roll_no=13;
		Sam.phone_no=487654321;
		Sam.address="qdft g6h78 gijg 345";
		Jhon.name="Jhon";
		Jhon.roll_no=7;
		Jhon.phone_no=1233456789;
		Jhon.address="gbnroig 12hug 34";
		Sam.introd();
		Jhon.introd();
	}
}
