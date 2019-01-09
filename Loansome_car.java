import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		//duration-down payment-loan amount-depreciation months
		//month-num value
		while ((s=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(s);
			int duration=Integer.parseInt(st.nextToken());
			if (duration<0) {
				break;
			}
			double downPayment=Double.parseDouble(st.nextToken());
			double loanAmount=Double.parseDouble(st.nextToken());
			int dpmn=Integer.parseInt(st.nextToken());
			double [] values=new double [duration+1];
			for (int i=0;i<dpmn;i++) {
				st=new StringTokenizer(br.readLine());
				int month=Integer.parseInt(st.nextToken());
				double rate=1-Double.parseDouble(st.nextToken());
				for (int i2=month;i2<values.length;i2++) {
					values[i2]=rate;
				}
			}
			
			double monthlyPayment=loanAmount/duration;
			double owe=loanAmount;
			double carValue=(loanAmount+downPayment)*values[0];
			int month=1;
			while (owe > carValue && month<values.length) {
				owe-=monthlyPayment;
				carValue*=values[month];
				month++;
			}
			month--;
			
			if (month==1) {
				System.out.println("1 month");
			} else {
				System.out.println(month+" months");
			}
		}
	}
}
