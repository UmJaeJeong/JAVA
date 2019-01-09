package sec_verify08;

public class DaoExample {

	public static void main(String[] args) {
		MySqlDao ms = new MySqlDao();
		OracleDao od = new OracleDao();
		
		dbWork(od);
		dbWork(ms);
	}
	
	public static void dbWork(DataAccessObject obj) {
		obj.select();
		obj.insert();
		obj.update();
		obj.delete();
	}

}
