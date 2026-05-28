package ch01_01_get_user_count_dxc_53;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



//这是一个测试程序。入门程序1
public class Test_01_get_user_count_dxc_53 {

	
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
			int userNum = sqlSession.selectOne("ch01_01_get_user_count_dxc_53.User_dxc_53_record_Mapper.get_user_count");
			
			System.out.println("查询结果："+userNum);//syso,alt+/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
