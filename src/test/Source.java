package test;

import java.util.ArrayList;

class Student
{
	private String name;
	private String collegeName;
	private float percentage;
	private float scholarship;
	
	public Student(String name, String collegeName, float percentage) {
		
		this.name = name;
		this.collegeName = collegeName;
		this.percentage = percentage;
		//this.scholarship = scholarship;
	}
	
  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public float getScholarship() {
		return scholarship;
	}
	public void setScholarship(float scholarship) {
		this.scholarship = scholarship;
	}
	
}
class Portal
{
	ArrayList<Student> studentList=new ArrayList<>();
	float scholarship;
	public void assignScholarship()
	{
		for(Student s:studentList)
		{
			if(s.getPercentage() < 81)
			{
				scholarship=0;
			}
			else if(s.getPercentage() >= 81 && s.getPercentage() <91)
			{
				scholarship=5000;
			}
			else 
			{
				scholarship=10000;
			}

		}
	}
	
	public float totalScholarship()
	{
		return scholarship;
	}
}
public class Source 
{
  public static void main(String[] args)
  {
	Portal obj=new Portal();
	obj.studentList.add(new Student("Steve","IIht",89));
	obj.studentList.add(new Student("Bob","Niht",94));
	obj.studentList.add(new Student("Alice","Abcd",59));
	obj.assignScholarship();
	System.out.println(obj.totalScholarship());
	
	
}   
}
