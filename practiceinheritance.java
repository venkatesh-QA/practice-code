package corejavapractice;

public class practiceinheritance extends Abstrcatinterface {

	@Override
	void addition() {
		// TODO Auto-generated method stub
		c=a+b;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Abstrcatinterface abs=new practiceinheritance();
		abs.subtarction();
	System.out.println("override");
	c=a+b;
	System.out.println(c);
}
}
