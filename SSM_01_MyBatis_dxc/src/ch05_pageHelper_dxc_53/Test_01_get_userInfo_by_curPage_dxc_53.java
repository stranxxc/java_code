package ch05_pageHelper_dxc_53;

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
public class Test_01_get_userInfo_by_curPage_dxc_53 {

	public static void main(String[] args) {
		// 第一步，读取核心配置文件
		String resource = "mybatis-config.xml";

		SqlSession sqlSession = Db_util_dxc_53.get_db_conn();// 获取会话对象

		HashMap<String, Object> condition_para = new HashMap<String, Object>();

		int curPage = 2;// 当前页
		int pageSize = 3;// 每页条数
		condition_para.put("curPage", curPage);// 定义键值对，传入第一个参数
		condition_para.put("pageSize", pageSize);

		// mapper命名空间+.+sqlID

		// 更多的参数，也是使用setXX()方法传入

		List<User_dxc_53_record> user_select_List = sqlSession
				.selectList(
						"ch05_pageHelper_dxc_53.User_dxc_53_record_Mapper.get_UserInfo_by_curPage_dxc_test_01",
						condition_para);

		// 遍历每个用户信息
		for (User_dxc_53_record user_each : user_select_List) {
			System.out.println("查询用户结果->分页查询->fetch>dxc->"
					+ user_each.toString_2());
		}

		int totalRowsNum = sqlSession
				.selectOne("ch05_pageHelper_dxc_53.User_dxc_53_record_Mapper.get_UserInfo_totalRowsNum_dxc");// 总记录数
		int totalPages = (int)Math.ceil((double)totalRowsNum/pageSize);// 总页数,两个整数相除，然后再向上取整

		System.out.println("当前页" + curPage + "每页条数" + pageSize + "总记录数"
				+ totalRowsNum + "总页数" + totalPages);
		// 第四步关闭连接
		Db_util_dxc_53.close_db_conn(sqlSession);

	}

}
