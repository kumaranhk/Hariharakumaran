public class EmployeeDetails {
    public void employeeName(String empName , int empId){
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID : " + empId);
    }
    public void employeeAddress(String empAdd){
        System.out.println("Employee address : " + empAdd);
    }
    public void employeeSalary(double empSalary){
        System.out.println("Employee salary : " + empSalary);
    }
    public void employeeMobileNum(long empNum){
        System.out.println("Employee Mobile Number :"+empNum);
    }

    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.employeeName("Kumaran" ,1215 );
        emp1.employeeAddress("Manglore");
        emp1.employeeSalary(150000);
        emp1.employeeMobileNum(1234567890);
    }
}
