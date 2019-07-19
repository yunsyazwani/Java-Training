package com.yun.sample;

class TernaryOperator{
	public static void main(String args[]){

		String strInput = "";
		
		try{
		
			 strInput = args[0];
			
			int input = Integer.parseInt(strInput);
			int target = 0;
	
			target = (input > 10)? 10 : input;
	
			outer: for (int i = 0; i < target; i++){
				for (int j = 0; j < target; j++){
					if (j > i){
						System.out.println();
						continue outer;
					}
					System.out.print(" " + (i * j));
				}
				System.out.println();
			}
		
		}catch(Exception ex){
			System.out.println("Give Number ! You give : " + strInput);
			System.out.println();
			ex.printStackTrace();
		}
	}
}