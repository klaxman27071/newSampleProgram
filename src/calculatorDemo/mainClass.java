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
				sf.subOfThreeNum();
	}

}
