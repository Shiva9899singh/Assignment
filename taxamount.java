import java.util.Scanner;

public class taxamount{
	public static double calculateTaxAmount(int ctc) {
		double tax;
		if(ctc<180001) {
			tax =0;
			return tax;
		}
		else if(ctc>181000 && ctc<300001) {
			tax = ((ctc*10)/100);
			return tax;
		}
		else if(ctc>300000 && ctc<500001) {
			tax = ((ctc*20)/100);
			return tax;
		}
		else
			tax = ((ctc*500000)/100);
		return tax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ctc = sc.nextInt();
		System.out.print(calculateTaxAmount(ctc));
		sc.close();
	}
}