package employeemanagement;

public class EmployeeManagement 
{

    public static void main(String[] args) 
    {
        Manager ma=new Manager("Devi",60000,"IT");
        ma.display();
        Employee em=new Employee("Prajith",800000);
        em.display();
    }
    
}
