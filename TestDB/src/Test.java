public class Test {
	public static void main(String[] args){
		TestUserDAO dao=new TestUserDAO();
		dao.select("taro", "123");
		System.out.println("\r\n");
		dao.selectAll();
		System.out.println("\r\n");
		dao.selectByName("taro");
		System.out.println("\r\n");
		dao.selectByPassword("123");
		System.out.println("\r\n");
		dao.updateUserNameByUserName("taro", "saburo");
		System.out.println("\r\n");
		dao.insert(4,"shiro","012");
		System.out.println("\r\n");
		dao.delete("shiro");
	}
}
