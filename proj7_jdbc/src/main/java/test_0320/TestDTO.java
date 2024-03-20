package test_0320;

public class TestDTO {
	
	int num;
	String amount;
	int menu;
	int target;
	int seq;
	/**
	 * @return the seq
	 */
	public int getSeq() {
		return seq;
	}
	/**
	 * @param seq the seq to set
	 */
	public void setSeq(int seq) {
		this.seq = seq;
	}
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the menu
	 */
	public int getMenu() {
		return menu;
	}
	/**
	 * @param menu the menu to set
	 */
	public void setMenu(int menu) {
		this.menu = menu;
	}
	/**
	 * @return the target
	 */
	public int getTarget() {
		return target;
	}
	/**
	 * @param target the target to set
	 */
	public void setTarget(int target) {
		this.target = target;
	}
	@Override
	public String toString() {
		return "work1 [num=" + num + ", amount=" + amount + ", menu=" + menu + ", target=" + target + ", seq= " + seq + "]";
	}
}
