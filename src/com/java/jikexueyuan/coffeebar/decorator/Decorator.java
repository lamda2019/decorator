package com.java.jikexueyuan.coffeebar.decorator;

import com.java.jikexueyuan.coffeebar.Drink;

public  class Decorator extends Drink {
	private Drink Obj;

	public Decorator(Drink Obj){
		this.Obj=Obj;
	};
	
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		System.out.println("super.getPrice() "+super.getPrice()+" Obj.cost() "+Obj.cost());
		return super.getPrice()+Obj.cost();
	}

	@Override
	public String getDescription()
	{
		return super.description+"-"+super.getPrice()+"&&"+Obj.getDescription();
	}
	
	}
