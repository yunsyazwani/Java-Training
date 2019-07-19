package com.yun.sample;

public class EnumTest {

	Day day;
	
	public EnumTest(Day day){
		this.day = day;
	}
	public void tellItLikeThis(){
		switch(day){
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		
		case FRIDAY:
			System.out.println("Friday are better");
			break;
			
		case SATURDAY:		
		case SUNDAY:
			System.out.println("Weekend are best");
			break;
		default:
			System.out.println("Midweek day are so so");
			break;
		}
	
	}
	
	public static void main(String[] agrs){
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeThis();
		EnumTest thirdtDay = new EnumTest(Day.WEDNESDAY);
		thirdtDay.tellItLikeThis();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeThis();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeThis();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeThis();
	}
}
