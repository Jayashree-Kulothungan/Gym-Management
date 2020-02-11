package bean;

public class Trainer {
	private int tid;
	private String tname;
	private String temail;
	private int tphone;
	private int tsalary;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public int getTphone() {
		return tphone;
	}
	public void setTphone(int tphone) {
		this.tphone = tphone;
	}
	public int getTsalary() {
		return tsalary;
	}
	public void setTsalary(int tsalary) {
		this.tsalary = tsalary;
	}
	public Trainer() {
		super();
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + ", temail=" + temail + ", tphone=" + tphone + ", tsalary="
				+ tsalary + "]";
	}
	
	

}
