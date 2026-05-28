package ch06_spring_Ioc_DI_dxc_53;
//这是静态工厂
public class Beans_static_Factory_dxc_53 {

	public static User_dxc_53 getUser_03_Bean(){
		User_dxc_53 user_01 = new User_dxc_53();

		user_01.setXing_ming("张三_03_Bean_静态工厂方式_实例化");
		user_01.setAge(22);
		return user_01;
	}
	
	public static int getUser_xx_Bean(){
		User_dxc_53 user_01 = new User_dxc_53();

		user_01.setXing_ming("");
		user_01.setAge(22);
		return 0;
	}
}
