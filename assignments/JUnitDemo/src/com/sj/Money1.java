package com.sj;

public class Money1 {

	int value;
	String currency;
	
	public Money1(int value, String currency) {
		//super();
		this.value = value;
		this.currency = currency;
	}
	
	public Money1() {
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		
		return value;
	}
	
	public void setCurrency(String currency) {
		
		this.currency=currency;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + value;
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
		Money1 other = (Money1) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	
	
	public Money1 addMoney(Money m)throws NotSameCurrency
	{
		Money1 result = new Money1();
		if(m.currency!=this.currency)
			throw new NotSameCurrency();
		
		result.currency=this.currency;
		result.value=this.value+m.value;
		return result;
	}

	
	  public Money1 addMoney1(Money1 usd70) 
	  { // TODO Auto-generated method stub
	  return null; }
	 
	
}
