/**
 * 
 */
package labExercises;

/**
 * 
 */
public class Exercise10_ReturnMonthOfYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(returnMonthOfYear(5));

	}

	/**
	 * This method returns the month of year from user input of the integer value of a month
	 */
	public static String returnMonthOfYear(int inputMonth) {
		
		String monthOfYear;
		
		switch (inputMonth) {
		case 1:
			monthOfYear = "January";
			break;
		case 2:
			monthOfYear ="February";
			break;
		case 3:
			monthOfYear ="March";
			break;
		case 4:
			monthOfYear ="April";
			break;
		case 5:
			monthOfYear ="May";
			break;
		case 6:
			monthOfYear ="June";
			break;
		case 7:
			monthOfYear ="July";
			break;
		case 8:
			monthOfYear ="August";
			break;
		case 9:
			monthOfYear ="September";
			break;
		case 10:
			monthOfYear ="October";
			break;
		case 11:
			monthOfYear ="November";
			break;
		case 12:
			monthOfYear ="December";
			break;
		default:
			monthOfYear ="Invalid input";
			break;
		}
		return monthOfYear;
	}
}
