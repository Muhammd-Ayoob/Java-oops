class Student
{
    private String name;
    private String rollno;
    private Department deparment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public Department getDeparment() {
        return deparment;
    }

    public void setDeparment(Department deparment) {
        this.deparment = deparment;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", rollno=" + rollno + ", deparment=" + deparment + '}';
    }
    
    
}
class Department
{
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", code=" + code + '}';
    }
    
}
public class AggregationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s=new Student();
        
        s.setName("Muhammad Ayoob");
        
        s.setRollno("18CS85");
        
        Department d=new Department();
        
        d.setName("Computer Systems");
        
        d.setCode("CS");
        
        s.setDeparment(d);
        
        System.out.println("Student name: "+s.getName()+" Department "+s.getDeparment().getName()+" Department code "+s.getDeparment().getCode());
    }
    
}
