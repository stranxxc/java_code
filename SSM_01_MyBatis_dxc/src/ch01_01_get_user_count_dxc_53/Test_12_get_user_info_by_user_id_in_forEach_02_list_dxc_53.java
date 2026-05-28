package ch01_01_get_user_count_dxc_53;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//这是一个测试程序。第11个程序，演示forEach与in配合，查询
public class Test_12_get_user_info_by_user_id_in_forEach_02_list_dxc_53 {

	public static void main(String[] args) {
		// 第一步，读取核心配置文件
		String resource = "mybatis-config.xml";

		try {
			InputStream resourceAsStream = Resources
					.getResourceAsStream(resource);// 读取配置文件
			// 构建会话工厂，相当于制造电话机
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(resourceAsStream);
			// 第三步，创建会话对象，相当于申请电话线
			SqlSession sqlSession = sqlSessionFactory.openSession();// 获取会话对象
			// mapper命名空间+.+sqlID
			
			List<Integer> user_id_list = new ArrayList<Integer>(); 
			user_id_list.add(1);
			user_id_list.add(2);
			user_id_list.add(3);
			user_id_list.add(4);
			user_id_list.add(5);
			user_id_list.add(6);

			
			Integer[] user_id_List = { 1, 2, 3, 4 };// 该数组来自checkbox，提交过来的值。split()方法分割

			List<User_dxc_53_record> user_select_List = sqlSession
					.selectList("ch01_01_get_user_count_dxc_53.User_dxc_53_record_Mapper.getUserList_by_userId_in_foreach_02_list_test_12_dxc",user_id_List);

			// 遍历每个用户信息
			for (User_dxc_53_record user_each : user_select_List) {
				System.out.println("查询用户结果->forEach->2-arrayList->dxc->"
						+ user_each.toString_2());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
