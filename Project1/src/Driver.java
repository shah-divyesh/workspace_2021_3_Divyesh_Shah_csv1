import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        Person.demo();
        System.out.println();
        Student.demo();
        System.out.println();
        Teacher.demo();
        System.out.println();
        FileUtil.demo();
    }
}

/*
 * Output of the Student.demo() which shows the state of the Student objects.
 */
//-------------------------Reading students.csv file and adding Student Object to studentList-------------------------
//    Student{  id = 11, age = 23, lastName = 'Shah', firstName = 'Divyesh', parentFirstName = 'Suresh', parentLastName = 'Shah' studentId = 10, gpa = 3.12 }
//    Student{  id = 52, age = 16, lastName = 'Desai', firstName = 'Yash', parentFirstName = 'Ramesh ', parentLastName = 'Desai' studentId = 12, gpa = 3.28 }
//    Student{  id = 14, age = 25, lastName = 'Patel', firstName = 'Yaksh', parentFirstName = 'Jayesh', parentLastName = 'Desai' studentId = 5, gpa = 2.81 }
//    Student{  id = 25, age = 10, lastName = 'Virani', firstName = 'Alex', parentFirstName = 'Jigar', parentLastName = 'Virani' studentId = 1, gpa = 3.5 }


/*
 * Output of the Teacher.demo() which shows the state of the Teacher object.
 */

//	-------------------------Reading teachers.csv file and adding Teacher Object to teacherList-------------------------
//    Teacher{  id = 14, age = 45, lastName = 'Rana', firstName = 'Ishita ', parentFirstName = 'Deepak', parentLastName = 'Prajapati' hourlyWage = 15.5 }

/*
 * Output of the FileUtil.demo() which reads and writes the CSV file.
 */

//----------------Reading data From CSV File----------------------
//    Students { 11,23,Divyesh,Shah,Suresh,Shah,10,3.12 }
//    Students { 52,16,Yash,Desai,Ramesh ,Desai,12,3.28 }
//    Students { 14,25,Yaksh,Patel,Jayesh,Desai,5,2.81 }
//    Students { 25,10,Alex,Virani,Jigar,Virani,1,3.5 }
//----------------Reading From CSV File completed------------------
//
//---------------------Writing data to CSV File---------------------
//      ***
//      ***
//      ***
//      ***
//      ***
//---------------------Writing to CSV File Completed-----------------