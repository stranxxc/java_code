package ch01_01_get_user_count_dxc_53;
//这是一个POJO类，对应着数据表user_dxc_53_record
public class User_dxc_53_record {

	int user_id;//属性名与数据表的字段名一致
	String user_name;
	String user_sfzh;
	
	
	
	public String toString_2() {
		return "User_dxc_53_record [user_id=" + user_id + ", user_name="
				+ user_name + ", user_sfzh=" + user_sfzh + "]";
		
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sfzh() {
		return user_sfzh;
	}
	public void setUser_sfzh(String user_sfzh) {
		this.user_sfzh = user_sfzh;
	}
	
	
}
