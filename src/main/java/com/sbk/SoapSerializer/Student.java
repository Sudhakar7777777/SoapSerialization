package com.sbk.SoapSerializer;

public class Student
{
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int year;

    public Student(int id, String firstName, String lastName, int age, int year)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.year = year;
    }

    public Student()
    {
        this.id = 1;
        this.firstName = "Hello";
        this.lastName = "World";
        this.age = 8;
        this.year = 2;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", year=" + year +
                '}';
    }
}
