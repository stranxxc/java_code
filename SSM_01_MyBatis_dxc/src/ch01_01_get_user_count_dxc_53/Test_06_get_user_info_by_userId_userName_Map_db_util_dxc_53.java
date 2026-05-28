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



//这是一个测试程序。第五个程序，单表查询，使用Map，传入查询参数
public class Test_06_get_user_info_by_userId_userName_Map_db_util_dxc_53 {

	
	public static void main(String[] args) {
		//第一步，读取核心配置文件
		String resource="mybatis-config.xml";
		
			SqlSession sqlSession = Db_util_dxc_53.get_db_conn();//获取会话对象
			
			HashMap<String,Object> condition_para = new HashMap<String,Object>();
			condition_para.put("user_id_map",0);//定义键值对，传入第一个参数
			condition_para.put("user_name_map","三");

			//mapper命名空间+.+sqlID
			
			//更多的参数，也是使用setXX()方法传入
			
			List<User_dxc_53_record> user_select_List = sqlSession.selectList("ch01_01_get_user_count_dxc_53.User_dxc_53_record_Mapper.getUserInfo_By_userId_userName_02_Map_dxc_53",condition_para);
			
			//遍历每个用户信息
			for(User_dxc_53_record user_each : user_select_List){
				System.out.println("查询用户结果->单条件查询->MAP传参数->dxc->"+user_each.toString_2());
			}
			
			
		//第四步关闭连接
		Db_util_dxc_53.close_db_conn(sqlSession );

	}

}
