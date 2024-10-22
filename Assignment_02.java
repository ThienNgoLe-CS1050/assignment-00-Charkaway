import javax.swing.JOptionPane;
public class Assignment_02 {

	public static void main(String[] args) {
		String firstName;
		char middleInitial;
		String middleInitialS;
		String lastName;
		int age;
		String ageS;
		double grossAnnualPay;
		String grossAnnualPayS;
		double taxRate;
		String taxRateS;
		double netAnnualPay;
		
		firstName = JOptionPane.showInputDialog("Enter your first name.");
		middleInitialS = JOptionPane.showInputDialog("Enter your middle initial.");
		lastName = JOptionPane.showInputDialog("Enter your last name.");
		ageS = JOptionPane.showInputDialog("Enter your age.");
		grossAnnualPayS = JOptionPane.showInputDialog("Enter your annual gross pay.");
		taxRateS = JOptionPane.showInputDialog("Enter your tax rate.");
		age = Integer.parseInt(ageS);
		grossAnnualPay = Double.parseDouble(grossAnnualPayS);
		taxRate = Double.parseDouble(taxRateS);
		middleInitial = middleInitialS.charAt(0);
		
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		
		
		System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ","
				+ "\nYou are " + age + " years old now."
				+ "\nIt is amazing that you made $" + grossAnnualPay + " this year. With the tax"
				+ "\nrate of " + taxRate + "," + " you can take home $" + netAnnualPay + ".");
		

	}

}
