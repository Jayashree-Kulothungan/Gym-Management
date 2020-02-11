package bean;

public class WeightLoss {
	private String name;
	private int initial;
	private int end;
	private int loss;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInitial() {
		return initial;
	}
	public void setInitial(int initial) {
		this.initial = initial;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public WeightLoss() {
		super();
	}
	public String toString() {
		return "WeightLoss [name=" + name + ", initial=" + initial + ", end=" + end + ", loss=" + loss + "]";
	}
	
}
