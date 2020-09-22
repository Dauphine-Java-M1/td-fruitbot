package fr.dauphine.ja.zhangshuting.td00;

import java.util.ArrayList;
import java.util.Set;
import java.util.Random;


/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	java.util.ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList<Integer>();
	}
	
	public void initRandom(int n, int m) {
        Random ran = new Random(); 
        for (int i = 0; i < n; i++) {
            int nxt = ran.nextInt(m); 
            this.numbers.add(nxt);
        }
	}
	public boolean isPrime(int p) {
		boolean flag = false;
		if(p==0 || p==1){  
			return false;
		} 
		for(int i=2;i<=p/2;i++){      
			if(p%i == 0){      
				flag = true;  
				break;			    
			}      
		}      
		if(!flag){ 
			return true; 
		}else {
			return false;
		}
	}
	public void printPrimes() {
		numbers.forEach(number ->{
			if(isPrime(number) == true) {
	            System.out.println(number);
			}
        });
	}
	
    public static void main( String[] args )
    {
    	PrimeCollection p = new PrimeCollection();
    	p.initRandom(100, 2000);
    	p.printPrimes();	
    }
}
