package ch01_01_get_user_count_dxc_53;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



//这是一个测试程序。第二个程序，根据用户的id查询用户信息
public class Test_02_get_user_info_by_user_id_dxc_53 {

	
	public static void main(String[] args) {
		//第一步，读取核心配置文件
		String resource="mybatis-config.xml";
		
		try {
			InputStream resourceAsStream = Resources.getResourceAsStream(resource);//读取配置文件
			//构建会话工厂，相当于制造电话机
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
			//第三步，创建会话对象，相当于申请电话线
			SqlSession sqlSession = sqlSessionFactory.openSession();//获取会话对象
			//mapper命名空间+.+sqlID
			int user_id=2;
			User_dxc_53_record user_info = sqlSession.selectOne("ch01_01_get_user_count_dxc_53.User_dxc_53_record_Mapper.get_UserInfo_By_UserId",user_id);
			
			System.out.println("查询用户结果->地址->dxc->"+user_info.toString());//syso,alt+/
			System.out.println("查询用户结果->结果->dxc->"+user_info.toString_2());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
