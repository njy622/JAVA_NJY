package ㄴ_자바_손정대강사님.Day14.상속실습_도형넓이_override;

public class Triangle extends Shape {

	public void calTriangle(float width, float height) {
		super.area=width*height/2.0f;
	}
}
