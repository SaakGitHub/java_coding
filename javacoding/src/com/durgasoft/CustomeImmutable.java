package com.durgasoft;

public final class CustomeImmutable {
	
	private int i;
	CustomeImmutable(int i){
		this.i=i;
	}

	public CustomeImmutable modify(int i) 
	{
		if(this.i==i)
			return this;
		else
			return new CustomeImmutable(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomeImmutable t1 = new CustomeImmutable(10);
		CustomeImmutable t2 = new CustomeImmutable(101);
		CustomeImmutable t3 = new CustomeImmutable(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
	}

}
