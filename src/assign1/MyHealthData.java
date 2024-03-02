/**
 * File name: MyHealthData.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 3
 * Date: 2023-10-11
 * Professor: Sandra Iroakazi
 * Purpose: The class is to Schedule an event on year,month and day
 */
package assign1;

/**
 * MyHealthData is the domain class to keep user's information and health data
 * It has the following features:
 * * calculate BMI heath value
 * * display user's information and health data
 * It extends super class MyHealthDataBase
 * @author Liying Guo
 * @version 1.0
 * @since 2023-10-07
 *
 */
public class MyHealthData extends MyHealthDataBase
{
	/**
	 * patient's first name
	 */
	private String firstName;
	/**
	 * patient's last name
	 */
	private String lastName;
	/**
	 * patient's gender
	 */
	private String gender;
	/**
	 * patient's birth year
	 */
	private int birthYear;
	/**
	 * the year the data is recorded
	 */
	private int currentYear;
	/**
	 * patient's height
	 */
	private double height;
	/**
	 * patient's weight
	 */
	private double weight;

	/**
	 * This constructor sets all fields as passed including:
	 * firstName,lastName,gender,birthYear,currentYear,height,weight
	 * @param firstName patient's first name
	 * @param lastName patient's last name
	 * @param gender patient's gender
	 * @param height patient's height
	 * @param weight patient's weight
	 * @param birthYear patient's birth year
	 * @param currentYear current year
	 */
	public MyHealthData(String firstName,String lastName,String gender,double height,double weight,int birthYear,int currentYear) 
	{	
		//pass value to field-firstName
		this.firstName=firstName;
		//pass value to field-lastName
		this.lastName=lastName;
		//pass value to gender
		this.gender=gender;
		//pass value to field-birthYear
		this.birthYear=birthYear;
		//pass value to field-currentYear
		this.currentYear=currentYear;
		//pass value to field-height
		this.height=height;
		//pass value to field-weight
		this.weight=weight;
	}

	/**
	 * Returns the first name for this patient.
	 * @return the first name for this patient.
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}

	/**
	 * Returns the last name for this patient.
	 * @return the last name for this patient.
	 */
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	/**
	 * Returns the gender for this patient.
	 * @return the gender for this patient.
	 */
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	/**
	 * Returns the birth year for this patient.
	 * @return the birth year for this patient.
	 */
	public int gerBirthYear()
	{
		return birthYear;
	}
	public void setBirthYear(int birthYear)
	{
		this.birthYear=birthYear;
	}
	
	/**
	 * Returns the year of the data record.
	 * @return the year of the data record.
	 */
	public int getCurrentYear() 
	{
		return currentYear;
	}
	
	/**
	 * Returns the height for this patient.
	 * @return the height for this patient.
	 */
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	
	/**
	 * Returns the weight for this patient.
	 * @return the weight for this patient.
	 */
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	
	/**
	 * Returns the age for this patient. It is the difference between birth year and recent year.
	 * @return the age for this patient.
	 */
	public int getAge()
	{
		return currentYear-birthYear;
	}
	
	public void displayMyHealthData() 
    { 

    //TO DO 5: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
    // START CODE
		System.out.printf("""
				firstName:%s,
				lastName:%s,
				gender:%s,
				birthYear:%d,
				height:%.2f,
				weight:%.2f,
				BMI:%.2f,
				in (Year): %d
				""",firstName,lastName,gender,birthYear,height,weight,this.calculateBMI(weight, height),currentYear);
    //END CODE

    //You do not need to modify this piece of code, it is fine as it is.

       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    } 

} // end class MyHealthData