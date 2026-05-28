package ch04_association_mapping_dxc_53;

import org.apache.ibatis.session.SqlSession;
import MyUtils_dxc_53.Db_util_dxc_53;

public class Test_02_getCardInfo_UserInfo_by_cardId_association_result_map_dxc_53 {

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            // 获取 SqlSession 对象
            sqlSession = Db_util_dxc_53.get_db_conn();

            int card_id = 1;

            // 执行查询，返回 Card_User_one_one_dxc_53 对象（包含 Card 及其关联的 User）
            Card_User_one_one_dxc_53 card_user = sqlSession.selectOne(
                "ch04_association_mapping_dxc_53.Card_dxc_53_record_Mapper.getCard_user_Info_by_cardId_result_02_map",
                card_id
            );

            // 打印查询结果（修正为使用正确的变量名）
            System.out.println("查询到的卡信息及用户信息——>一对一——>嵌套结构查询——>dxc_53");
            System.out.println(card_user);  // 确保你的实体类重写了 toString() 方法

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 确保在 finally 块中关闭 SqlSession
            if (sqlSession != null) {
                Db_util_dxc_53.close_db_conn(sqlSession);
            }
        }
    }
}