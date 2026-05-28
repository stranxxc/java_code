package ch04_association_mapping_dxc_53;

public class Card_User_one_one_dxc_53 {

	int card_id;
	String card_no;
	int card_user_id;
	
	User_dxc_53_record_Pojo user_dxc_53_record_pojo;

	public String toString_2() {
		return "Card_User_one_one_dxc_53 [card_id=" + card_id + ", card_no="
				+ card_no + ", card_user_id=" + card_user_id
				+ ", user_dxc_53_record_pojo=" + user_dxc_53_record_pojo + "]";
	}

	public int getCard_id() {
		return card_id;
	}

	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}

	public String getCard_no() {
		return card_no;
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public int getCard_user_id() {
		return card_user_id;
	}

	public void setCard_user_id(int card_user_id) {
		this.card_user_id = card_user_id;
	}

	public User_dxc_53_record_Pojo getUser_dxc_53_record_pojo() {
		return user_dxc_53_record_pojo;
	}

	public void setUser_dxc_53_record_pojo(
			User_dxc_53_record_Pojo user_dxc_53_record_pojo) {
		this.user_dxc_53_record_pojo = user_dxc_53_record_pojo;
	}
	
	
}
