package j0122_01;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	public Tv() {
		super();
	}

	public Tv(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	public Tv(Tv other) {
        this.color = other.color;
        this.power = other.power;
        this.channel = other.channel;
    }
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
