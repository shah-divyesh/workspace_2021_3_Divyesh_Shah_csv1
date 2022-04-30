import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person  implements Comparable<Student> {
    private int studentId;
    private double gpa;

    public Student() {}

    public Student(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName, int studentId, double gpa) {
        super(id, age, firstName, lastName, parentFirstName, parentLastName);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{ " +
                super.toString() +
                " studentId = " + studentId +
                ", gpa = " + gpa +
                " }" ;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.getStudentId(),o.getStudentId());
    }

    /*
     * Method to read csv file and create Student Objects from the file
     */

    public static void createStudentObjectFromCSVFile(List<Student> studentList){
        try {
            BufferedReader br=new BufferedReader(new FileReader("F:\\CSYE6200\\workspace_2021_3_Divyesh_Shah_csv1\\Project1\\src\\students.csv"));
            String readLine=null;

            while((readLine=br.readLine())!=null){
                String[] datafields=readLine.split(",");
                int personId=new Integer(datafields[0]);
                int age=new Integer(datafields[1]);
                String fName=datafields[2];
                String lName=datafields[3];
                String parentFirstName=datafields[4];
                String parentLastName=datafields[5];
                int studentId=new Integer(datafields[6]);
                double studentGpa=new Double(datafields[7]);
                studentList.add(new Student(personId,age,fName,lName,parentFirstName,parentLastName,studentId,studentGpa));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("IO exception thrown ");
            e.printStackTrace();
        }
    }

    public static int sortStudentListById(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }

    public static int sortStudentListByStudentId(Student o1, Student o2) {
        return Integer.compare(o1.getStudentId(), o2.getStudentId());
    }

    public static int sortStudenListByLastName(Student o1, Student o2) {
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }

    public static int sortStudenListByFirstName(Student o1, Student o2) {
        return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
    }

    public static int sortStudenListByGpa(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }

    public static void demo(){
        List<Student> studentList=new ArrayList<Student>();
        System.out.println("Student Class demo method called");

        System.out.println("-------------------------Reading students.csv file and adding Student Object to studentList-------------------------");
        createStudentObjectFromCSVFile(studentList);
        for (Student list:studentList){
            System.out.println(list.toString());
        }

        System.out.println();
        System.out.println("---------------------Sorting Student List by ID-----------------------");
        studentList.sort(Student::sortStudentListById);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println("---------------------Sorting Student List by StudentId-----------------------");
        studentList.sort(Student::sortStudentListByStudentId);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println("-----------------------Sorting Student List by LastName-----------------------");
        studentList.sort(Student::sortStudenListByLastName);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println("-----------------------Sorting Student List by FirstName-----------------------");
        studentList.sort(Student::sortStudenListByFirstName);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println("-----------------------Sorting Student List by GPA-----------------------");
        studentList.sort(Student::sortStudenListByGpa);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }
}
