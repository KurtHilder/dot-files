public class jPrime{
	
	

	public static void main(String[] args) {
	
		System.out.println("|---------------------|");
		System.out.println("| SIMPLE PRIME JAVA   |");
		System.out.println("|---------------------|");
		System.out.print("| ");
		
		
		int primesToFind = 10000;
		int primesFound = 0;
		int currentNumber = 0;
		
		
		long startTime = System.currentTimeMillis();
		
		while(primesFound < primesToFind) {
			currentNumber++;
            
            int divCount = 0;

            for(int i = 1; i <= currentNumber; i++){
                int mod = currentNumber % i;
                if(mod == 0){
                    divCount++;
                }
            }

            if(divCount ==2){
                primesFound++;
            }

		}
		
		
        System.out.println(primesFound + " " +  currentNumber);
		long stopTime = System.currentTimeMillis();
		long delta = stopTime - startTime;
		
		double time = (double)delta / 1000d;
		

		System.out.println("|\n|---------------------|");;
		System.out.println("\nDONE:\n\tPrimes  :" + primesFound);
		System.out.println("\n\tNumber  :" + currentNumber);
		System.out.println("\tMillis  :" + delta);
		System.out.println("\tSeconds :" + time);
		
		
	}
}
	
