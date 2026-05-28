package ch01_01_get_user_count_dxc_53;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import MyUtils_dxc_53.Db_util_dxc_53;

//这是一个测试程序。第7个程序，插入新用户，使用pojo，传入查询参数
public class Test_08_insert_new_user_by_pojo_getMapper_dxc_53 {

	public static void main(String[] args) {
		// 第一步，读取核心配置文件
		String resource = "mybatis-config.xml";

		// 获取链接
		SqlSession sqlSession = Db_util_dxc_53.get_db_conn();// 获取会话对象

		// 第二步，定义输入参数
		User_dxc_53_record user_dxc_53_record = new User_dxc_53_record();

		user_dxc_53_record.setUser_name("张三003");
		user_dxc_53_record.setUser_sfzh("00008");
		
		
		// mapper命名空间+.+sqlID

		// 更多的参数，也是使用setXX()方法传入

		int insert_num1=sqlSession.insert("ch01_01_get_user_count_dxc_53.User_dxc_53_record_Mapper.insert_new_user_dxc_53_by_pojo", user_dxc_53_record);
		
		System.out.println("插入记录的条数->getMapper()->dxc->"+insert_num1);
				
		// ... 前面部分代码保持不变 ...

				// 第 40 行左右的查询部分
				List<User_dxc_53_record> user_select_List = sqlSession
						.selectList(
								"ch01_01_get_user_count_dxc_53.User_dxc_53_record_Mapper.getUserInfo_By_userId_userName_02_Map_dxc_53",
								user_dxc_53_record); // 修正：将未定义的 condition_para 改为 user_dxc_53_record

				// 遍历每个用户信息
				for (User_dxc_53_record user_each : user_select_List) {
					System.out.println("查询用户结果->单条件查询->MAP传参数->dxc->"
							+ user_each.toString_2());
				}

		// 第四步关闭连接
		Db_util_dxc_53.close_db_conn(sqlSession);

	}

} // 修正：类末尾去掉多余的分号