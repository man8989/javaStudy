package ch6;

class Car {
	String color;		//색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;
	
	Car(){
		this("white", "auto", 4);
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);	// c1의 복사본 c2를 생성한다.
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
	}

}
