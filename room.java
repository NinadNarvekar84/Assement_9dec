import java.util.Scanner;

public class room {
	
	
	String Roomarea;
	String ACmachine;
	int Roomno;
	String Roomtype;
	
	Scanner sc = new Scanner(System.in);
	
	public void setdata() {
		System.out.println("enter Roomno:");
		Roomno = sc.nextInt();
	}
	
	public void setdata1() {
		System.out.println("enter Roomtype:");
		 Roomtype =sc.next();
		 
	}
	
	public void setdata2() {
		System.out.println("enter Roomarea:");
		Roomarea = sc.next();
		
	}
	public  void setdata3() {

		System.out.println("enter Acmachine:");
		 ACmachine = sc.next();
		
	}
		
	
	
	public void displaydata() {
		System.out.println("enter roomno is:"+Roomno);
		System.out.println("enter roomtype is:"+Roomtype);
		System.out.println("roomarea is:"+Roomarea);
		System.out.println("room Acmachine:"+ACmachine);
		
	}

	public static void main(String[] args) {
		
		room r=new room();
		r.setdata();
		r.setdata1();
		r.setdata2();
		r.setdata3();
		r.displaydata();
			
			
		}

}



