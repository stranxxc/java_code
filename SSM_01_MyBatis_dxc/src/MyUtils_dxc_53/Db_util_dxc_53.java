package MyUtils_dxc_53;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//这是有关数据库连接的工具箱。主要功能：获取数据库的连接及关闭连接
public class Db_util_dxc_53 {
	
	static SqlSessionFactory sqlSessionFactory = null;//类属性
	
	//功能：这是一段静态代码块。注意执行时机：是在类加载时，只执行一次
	static{
		String resource="mybatis-config.xml";
		
		try {
			InputStream resourceAsStream = Resources
					.getResourceAsStream(resource);
			
			//构建会话工厂，相当于制造电话机
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("静态代码块，只执行一次");
	}
	
	// 获取数据库连接
	public static SqlSession get_db_conn() {

		return sqlSessionFactory.openSession(true);//获取会话对象;打开的事务，自动提交，针对当前逻辑，仅有一条sql语句时，默认是不自动提交
	}

	// 获取数据库连接
		public static SqlSession get_db_conn_trans() {//transaction

			return sqlSessionFactory.openSession(false);//获取会话对象;打开的事务
		}

	
	// 关闭当前连接
	public static void close_db_conn(SqlSession sqlSession) {
		if(sqlSession != null ){ // 修正：将 SqlSession 改为小写的变量名，并去掉 ! = 之间的空格
		sqlSession.close();//关闭连接
		}
	}

	
}