package test;

import java.util.Random;

import main.util;



public class ImpUtil implements util {

	@Override
	public double prod(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double div(double x, double y) {
		// TODO Auto-generated method stub
		if(y==0)
			throw new IllegalArgumentException("error division");
		else
		return x/y;
	}

	@Override
	public double add(double x, double y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public double soustr(double x, double y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int PGCD(int x, int y) {
		// TODO Auto-generated method stub
		while(x != y) {
			if(x < y) {
				y = y - x;
			}else {
			    x = x - y;
			}
		}
		return x;
	}

	@Override
	public int Fact(int a) {
		// TODO Auto-generated method stub
		if(a<0)
			throw new IllegalArgumentException(" negative number for factoriel");
		else if (a==0) return(1);
		else 
		return (a*Fact(a-1));
	}

	@Override
	public String bin(int a) {
		// TODO Auto-generated method stub
		return Integer.toBinaryString(a);
	}
	
	public boolean estPaire(int a) {
		if(a%2==0)
			return true;
		else
			return false;
	}

	public boolean estPair(int a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
		public int randomTab(int size) {
			Random rd = new Random(); 
		      int[] arr = new int[size];
		      for (int i = 0; i < arr.length; i++) {
		         arr[i] = rd.nextInt(); 
		         System.out.println(arr[i]); 
		        
			}
		return 0;
	}

	@Override
	public boolean IsPalindrome(String word) {
			if (word==null) {
				throw new IllegalArgumentException("input String Null");
			}
			if (word.equals(Reverse(word))) {
				return true;
			}
			else return false;
		}
		private String Reverse(String input) {
			String rev ="";
			for(int i = input.length()-1;i>=0 ; i--) {
				{rev = rev+input.charAt(i);}
			}
			return rev;
		
		
	}

}
