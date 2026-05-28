package ch05_pageHelper_dxc_53;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import MyUtils_dxc_53.Db_util_dxc_53;

//使用分页插件进行查询
public class Test_02_get_userInfo_by_pageHelper_dxc_53 {

	public static void main(String[] args) {
		// 第一步，读取核心配置文件
		String resource = "mybatis-config.xml";

		SqlSession sqlSession = Db_util_dxc_53.get_db_conn();// 获取会话对象

		// 定义输入参数
		int pageNum = 2;// 要查询的页数，即我要查的是第几页
		int pageSize = 3;// 分页参数，每页多少条
		String orderBy = "a.user_id";// 排序字段

		// 定义分页插件
		PageHelper.startPage(pageNum, pageSize, orderBy);
		List<User_dxc_53_record> user_select_List = sqlSession
				.selectList("ch05_pageHelper_dxc_53.User_dxc_53_record_Mapper.get_UserInfo_by_pageHelper_dxc_test_02");

		// 遍历每个用户信息
		for (User_dxc_53_record user_each : user_select_List) {
			System.out.println("查询用户结果->pageHelper->分页查询>dxc->"
					+ user_each.toString_2());
		}

		// 获取分页信息
		PageInfo<User_dxc_53_record> pageInfo = new PageInfo<User_dxc_53_record>(user_select_List);
		
		
		System.out.println("当前页" + pageInfo.getPageNum() + "每页条数" + pageInfo.getPageSize() + "总记录数"
				+ pageInfo.getTotal() + "总页数" + pageInfo.getPages());
		// 第四步关闭连接
		Db_util_dxc_53.close_db_conn(sqlSession);

	}

}
