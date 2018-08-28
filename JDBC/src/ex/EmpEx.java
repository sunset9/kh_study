package ex;

import java.util.List;

import dao.EmpDao;
import dao.EmpDaoImpl;
import dto.Emp;

public class EmpEx {
	private static EmpDao empDao = new EmpDaoImpl();
	
	public static void main(String[] args) {
		
		List<Emp> empList = empDao.getList();
		
		if(empList != null) {
			for(Emp e : empList) {
				System.out.println(e);
			}
		}
			
	}
	

}
