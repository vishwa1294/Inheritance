class WashingMachine{
	
String brand;
String model;

     void setValue(String brand,String model){
		 this.brand=brand;
		 this.model=model;
	 }
	@Override
	public int hashCode()
	{
		System.out.println("invoked hashcode from WashingMachine");
		int value=super.hashCode();
		return value;//super.hashCode();//=7683333;
		
	
	}
	@Override
	public String toString()
	{
		return this.brand.hashCode()+" "+this.model.hashCode();
	}
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("invoked equals from WashingMachine");
		WashingMachine machine=(WashingMachine)obj;
		return this.brand.equals(machine.brand)&& this.model==machine.model;
	}
}
