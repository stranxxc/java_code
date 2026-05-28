package ch06_spring_Ioc_DI_dxc_53;

//这是一个pojo类
public class User_dxc_53 {

	String xing_ming;
	int age;


	public User_dxc_53(){
		
	}
	
	public User_dxc_53(String cur_xing_ming,int cur_age){
		this.xing_ming=cur_xing_ming;
		this.age=cur_age;
	}
	
	//以下方法不是构造方法，而是实例方法
	public String toString_2() {
		return "User_dxc_53 [xing_ming=" + xing_ming + ", age=" + age + "]";
	}

	public String getXing_ming() {
		return xing_ming;
	}

	public void setXing_ming(String xing_ming) {
		this.xing_ming = xing_ming;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
