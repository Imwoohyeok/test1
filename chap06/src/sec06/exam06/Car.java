package sec06.exam06;

public class Car {
	
	private int speed;
	private boolean stop;
	private String name;
	
	// setter
	// return이 없어서 void 써야함
	// 전달인자 : speed
	public void setSpeed(int spped) {
		
		this.speed = speed;
		return;
	}
	
	// getter
	public int getSpeed() {
		
		return this.speed;
	}

	/**
	 * @return the stop
	 */
	public boolean isStop() {
		return stop;
	}

	/**
	 * @param stop the stop to set
	 */
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
