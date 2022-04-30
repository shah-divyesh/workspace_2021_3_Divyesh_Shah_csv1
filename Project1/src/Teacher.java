import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Teacher extends Person{
    private double hourlyWage;

    public Teacher() { }

    public Teacher(int id, int age, String lastName, String firstName, String parentFirstName, String parentLastName, double hourlyWage) {
        super(id, age, lastName, firstName, parentFirstName, parentLastName);
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public String toString() {
        return "Teacher{ " +super.toString()+
                " hourlyWage = " + hourlyWage +
                " }"  ;
    }

    public static void demo(){
        System.out.println("Teacher Class demo method called");
        List<Teacher> teacherList=new ArrayList<Teacher>();
        System.out.println("-------------------------Reading teachers.csv file and adding Teacher Object to teacherList-------------------------");
        addTeachers(teacherList);
        for (Teacher list:teacherList){
            System.out.println(list.toString());
        }
    }

    public static void addTeachers(List<Teacher> teacherList){
        try {
            Scanner inLine=new Scanner(new BufferedReader(new FileReader("F:\\CSYE6200\\workspace_2021_3_Divyesh_Shah_csv1\\Project1\\src\\teachers.csv")));
            while(inLine.hasNextLine()){
                String readLine=inLine.nextLine();
                Scanner s=new Scanner(readLine);
                s.useDelimiter(",");
                int id=s.nextInt();
                int age=s.nextInt();
                String fName=s.next();
                String lName=s.next();
                String parentFirstName=s.next();
                String parentLastName=s.next();
                double hourlyWage=s.nextDouble();
                teacherList.add(new Teacher(id,age,fName,lName,parentFirstName,parentLastName,hourlyWage));
                s.close();
            }
            inLine.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
