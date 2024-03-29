package oop;

public class Vehicle {
	private String name = "";
	private String color = "";
	private String model = "";
	private String company = "";
	private String engine = "800";
	
	public static int count = 0;
	
	public Vehicle()
	{
		count++;
		
	}
	
	public Vehicle (String name, String color, String model, String company, String engine)
	{
		this.name = name;
		this.color = color;
		this.model = model;
		this.company =  company;
		this.engine = engine;
		count++;
	}
	public void setName(String name)
	{
		this.name =  name;
	}
	public String getName()
	{
		return this.name; 
		
	}
	public void setColor(String color)
	{
		this.color =  color;
	}
	public String getColor()
	{
		return this.color; 
		
	}
	public void setModel(String model)
	{
		this.model =  model;
	}
	public String getModel()
	{
		return this.model; 
		
	}
	public void setCompany(String company)
	{
		this.company =  company;
	}
	public String getCompany()
	{
		return this.company; 
		
	}

	public void setEngine(String engine)
	{
		this.engine =  engine;
	}
	private String getEngine()
	{
		return this.engine; 
		
	}
	public int getSpeed()
	{
		String a = getEngine();
		if(a == "800")
			return 90;
		else
			return 120;
	}
	
	public String getInfo()
	{
		return "This is a vehicle";
	}
	
	public static String getVehicle()
	{
		return "You have set the Name of that Vehicle";
		
	}

}
