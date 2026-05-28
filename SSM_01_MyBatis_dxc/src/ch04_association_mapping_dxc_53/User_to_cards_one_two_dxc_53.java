package ch04_association_mapping_dxc_53;

import java.util.List;

//这是一个类。用于封装 通过用户user_id，查询卡信息，关系：一对多
public class User_to_cards_one_two_dxc_53 {
	//以下属性来自用户类，不使用基本数据类型接收，而是直接用类接收参数，目的就是为了深刻理解 一对一映射
	User_dxc_53_record_Pojo user_dxc_53_record_Pojo;//用户信息
	
	List<Card_dxc_53_record_PoJo> card_dxc_53_record_PoJo_list;//卡信息

	
	
	//@Override
	public String toString_2() {
		return "User_to_cards_one_two_dxc_53 [user_dxc_53_record_Pojo="
				+ user_dxc_53_record_Pojo + ", card_dxc_53_record_PoJo_list="
				+ card_dxc_53_record_PoJo_list + "]";
	}

	public User_dxc_53_record_Pojo getUser_dxc_53_record_Pojo() {
		return user_dxc_53_record_Pojo;
	}

	public void setUser_dxc_53_record_Pojo(
			User_dxc_53_record_Pojo user_dxc_53_record_Pojo) {
		this.user_dxc_53_record_Pojo = user_dxc_53_record_Pojo;
	}

	public List<Card_dxc_53_record_PoJo> getCard_dxc_53_record_PoJo_list() {
		return card_dxc_53_record_PoJo_list;
	}

	public void setCard_dxc_53_record_PoJo_list(
			List<Card_dxc_53_record_PoJo> card_dxc_53_record_PoJo_list) {
		this.card_dxc_53_record_PoJo_list = card_dxc_53_record_PoJo_list;
	}
	
	
}
