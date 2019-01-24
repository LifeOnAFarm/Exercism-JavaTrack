class ArmstrongTest{
	private int totalVal;
	private String strNum;
	private char[] letters;

	public boolean check(int numCheck){
		strNum = String.valueOf(numCheck);
		letters = strNum.toCharArray();

		for(char x: letters){
			totalVal += Math.pow(Character.getNumericValue(x) , letters.length); 
		}

		return (totalVal == numCheck?true:false);

	} 
}

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		
		ArmstrongTest checkOne = new ArmstrongTest();

		return (checkOne.check(numberToCheck));
		
	}

}
