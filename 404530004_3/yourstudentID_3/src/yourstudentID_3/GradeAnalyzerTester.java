/*
 * [A]100
 * [TA's Advise]
 * 1. �S����Ӥj���D, Good!
 * */

package yourstudentID_3;

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		String TempInput = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		while (true) {
			TempInput = JOptionPane.showInputDialog(null, "Please enter your score:");
			if (TempInput.equalsIgnoreCase("q")) {
				break;
			}
			try {
				GA.addGrade(Double.parseDouble(TempInput));

			} catch (Exception e) {
				System.out.println("Error! Please enter again!");
			}
		}

		// �ʤ֧P�_�Ӽ�, -2
		GA.analyzeGrades();
		System.out.println(
				"You entered " + GA.cntUserInput + "Valid grades from 0 to 110.  Invalid grades are ignored! ");
		System.out.println("The average = " + (int) GA.Avg + " with a standard deviation = " + (int) GA.SD);
		System.out.println(GA);
		System.out.println("You did not enter enough grades to analyze." + "Please enter at least two valid grades");
	}
}
