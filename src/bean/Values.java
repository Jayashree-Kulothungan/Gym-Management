package bean;

public class Values {
	private int cus_id;
	private String cname;
	private String cemail;
	private int fees;
	private String pack;


public Values() {
		super();	
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getPack() {
		return pack;
	}
	public void setPack(String pack) {
		this.pack = pack;
	}
	@Override
	public String toString() {
		return "Values [cus_id=" + getCus_id() + ", cname=" + getCname() + ", cemail=" + getCemail() + ", pack=" + getPack() +" , fees=" + getFees() + "1]";
	}


	}


