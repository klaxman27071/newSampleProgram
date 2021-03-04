package calculatorDemo;

public class mainClass {

	public static void main(String[] args) {
		System.out.println("MainClass");
		AdditonFunction af=new AdditonFunction();
		af.add();
		SubstractionFunction sf=new SubstractionFunction();
				sf.subst();
				Mulf mf=new Mulf();
				mf.mul();
				DivisionDemo df=new DivisionDemo();
				df.div();
				df.div12();
				System.out.println("New square function added  3.1 mnt");
				SquareFunction ssf=new SquareFunction();
				ssf.SquareofNum();
	}

}
