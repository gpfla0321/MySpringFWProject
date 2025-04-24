package workshop.book.control;

import workshop.book.entity.Magazine;
import workshop.book.entity.Novel;
import workshop.book.entity.Publication;

public class ManageBook {

	public static void main(String[] args) {
		//Publication 타입 배열 선언 및 생성
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("마이크로소프트","2007-10-01",328,9900,"매월");
		
		//Magazine 객체 생성
		Magazine mz = new Magazine();
		Publication pub = new Magazine();	//(다형성)타입은 부모타입 주지만 런타임에 생성되는 실질적인 객체는 자기자신 하지만 타입은 부모타입 
		
		//Novel 객체 생성
		Novel novel = new Novel();
		Publication pub2 = new Novel();
	}

}
