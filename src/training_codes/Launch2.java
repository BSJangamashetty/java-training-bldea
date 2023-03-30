package training_codes;
class Tiger
{
	String name;
	String color;
	int age;
	String country;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	 String getColor() 
	 {
		return color;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
}
public class Launch2 
{

	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger();
		t1.setName("Ramu");
		t1.setColor("Brown");
		t1.setAge(12);
		t1.setCountry("India");
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getAge());
		System.out.println(t1.getCountry());
		
	}

}
