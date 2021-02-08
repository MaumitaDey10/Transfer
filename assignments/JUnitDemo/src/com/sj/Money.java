package com.sj;

public class Money {

	int val1;
	int val2;
	String currency;
	public int value;
	
	public Money(int i,int j) {
		this.val1=i;
		this.val2=j;
		
	}
	
	
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + val1;
		result = prime * result + val2;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (val1 != other.val1)
			return false;
		if (val2 != other.val2)
			return false;
		return true;
	}


	public Money (String inr) {
	  
	  this.currency(); 
	  }
	 
	private void currency() {
		// TODO Auto-generated method stub
		
	}


	public int add() {
		
		return(val1+val2);
		
	}
	public String add1() {
		return (currency);
		
	}
}
