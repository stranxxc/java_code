package ch04_association_mapping_dxc_53;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import MyUtils_dxc_53.Db_util_dxc_53;

public class Test_01_getCardInfo_UserInfo_by_cardId_association_select_map_dxc_53 {

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            // 第一步，读取核心配置文件（原代码中的注释保留）
            sqlSession = Db_util_dxc_53.get_db_conn();

            int card_id = 1;

            Card_User_one_one_dxc_53 card_user_one_one_dxc_53 = sqlSession.selectOne(
                "ch04_association_mapping_dxc_53.Card_dxc_53_record_Mapper.getCard_user_Info_by_cardId_test_01_association_select_dxc_53",
                card_id
            );

            System.out.println("查询到的卡信息及用户信息——>一对一——>嵌套结构查询——>dxc_53");
            // 改动1：打印查询结果
            if (card_user_one_one_dxc_53 != null) {
                System.out.println(card_user_one_one_dxc_53);
            } else {
                System.out.println("未查询到 card_id = " + card_id + " 的数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 改动2：关闭 SqlSession，释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}