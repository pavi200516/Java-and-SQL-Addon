package program;
abstract class Student{
	abstract void m1();
	
}
class display extends Student{
	void m1() {
		System.out.println("Haii");
	}
}
class main{
	public static void main(String[] args) {
		//Student s1=new Student();
		display d=new display();
		d.m1();
	}
}
