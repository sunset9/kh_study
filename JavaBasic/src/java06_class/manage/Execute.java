package java06_class.manage;

public class Execute {
	public static void main(String[] args) {
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo();
		
		ss.insertScore();
		
		ss.printStu();
	}
}


