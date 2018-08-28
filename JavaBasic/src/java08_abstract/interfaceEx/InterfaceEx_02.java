package java08_abstract.interfaceEx;

interface InterA{
	public void getA();
}
interface InterB{
	public void getB();
}
interface InterC extends InterA, InterB {
	public void getC();
}

class Child02 implements InterC{

	@Override
	public void getA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getC() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceEx_02 {
	
}
