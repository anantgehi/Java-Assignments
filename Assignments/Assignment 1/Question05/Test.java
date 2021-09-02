/*
5.Create a class called Employee that includes three instance
variables—a first name (type String), a last name (type String)
and a monthly salary (double). Provide a constructor that
initializes the three instance variables. Provide a set and a
get method for each instance variable. If the monthly salary is
not positive, do not set its value. Write a test application
named EmployeeTest that demonstrates class Employee’s
capabilities. Create two Employee objects and display each
object’s yearly salary. Then give each Employee a 10% raise and
display each Employee’s yearly salary again.
*/

class Employee{
    String first_name;
    String last_name;
    Double salary;
    
    Employee(){
        first_name= "Nil";
        last_name = "Nil";
        salary = 0.0;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setSalary(Double salary) {
        if(salary>0)
        this.salary = salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Double getSalary() {
        return salary;
    }

}
