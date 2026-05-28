package ch01_01_get_user_count_dxc_53;

import java.util.HashMap;
import java.util.List;

//这是一个接口。功能：规范和约束。用途
public interface User_dxc_53_record_Mapper {
	// 方法名：sql的ID
	// 输入参数，由parameterType决定
	// 返回值。
	public int insert_new_user_dxc_53_by_pojo(
			User_dxc_53_record user_dxc_53_record);

	// 转小写,ctrl+shift+y

	// 功能：多条件查询，实现方式二：使用Map传参数
	public List<User_dxc_53_record> getUserInfo_By_userId_userName_02_Map_dxc_53(
			HashMap<String, Object> hashmap);

	//获取用户数
	public int get_user_count();
}
