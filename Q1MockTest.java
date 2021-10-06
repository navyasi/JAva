/*

PrX.Y:
--Copy and paste the corresponding problem description
  from the worksheets here--
  
*/

public class Q1MockTest		// Replace "Template"with your specific class name
{
	public static void main(String[] args)
	{
		IBIO.output("Navya Singhal");
		int nosToProcess = IBIO.inputInt("How many numbers to process?");
		int max = 0;
		int min = 0;
		int sum = 0;
		int range = 0;
		if(nosToProcess<3) {
			IBIO.output("Input Error.");
			System.exit(1);
		}
		//if(nosToProcess >= 3){
			for (int i = 0; i < nosToProcess; i++){
				int inputX = IBIO.inputInt("Enter Number: ");
				sum = sum + inputX;
				if (i == 0) {
					min = inputX;
					max = inputX;
				}
				if (inputX < min){
					min = inputX;
				}
				if (inputX > max){
					max = inputX;
				}
				range = max - min;

			}
			boolean is_prime = true;
			for(int i = 2; i < max; i++){
				int remainder = max % i;
				if (remainder == 0){
					is_prime = false;
					break;
				}
				else {
					is_prime = true;
				}
			}

			IBIO.output("Minimum = " + min);
			IBIO.output("Maximum = " + max);
			IBIO.output("Range = " + range);
			IBIO.output("Avg = " + sum/nosToProcess);
			IBIO.output(max + " is prime? = " + is_prime);


		}


	}
