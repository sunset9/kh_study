package java13_exception;

import java.io.IOException;

class ThowsEx{
	public char readChar() throws IOException{
		return (char)System.in.read();
	}
}

public class ExceptionEx_08_throws {
	public static void main(String[] args) {

		ThowsEx te = new ThowsEx();
		
		System.out.print("Input : ");
		char ch = 0;
		try {
			ch = te.readChar();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("Output : " + ch);
		
	}
}
