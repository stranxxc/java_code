package ch06_spring_Ioc_DI_dxc_53;
//这是实例工厂，也是用于定义bean的，与静态工厂的区别，方法上有没有static关键字。此时，实例工厂先需要定义为Bean
public class Bean_instance_Factory_dxc_53 {

	public  User_dxc_53 getUser_04_Bean(){
		User_dxc_53 user_01 = new User_dxc_53();

		user_01.setXing_ming("张三_04_Bean_实例工厂方式_实例化");
		user_01.setAge(22);
		return user_01;
	}
}
