package ㄴ_자바_손정대강사님.Day14.상속실습_도형넓이_override;

public class Rectangle extends Shape {
	public void calcRectangle(float width, float height) {
		super.area=width*height;
	}
}
