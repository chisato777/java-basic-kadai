package kadai_015;

public class Car_Chapter15 {
	private int gear = 0;
	private int speed = 0;

	public Car_Chapter15() {
		this.gear = 1;
		this.speed = 10;
	}


	public void gearChange(int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");

		speed = switch (afterGear) {
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
		};

	}

	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
