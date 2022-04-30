import java.io.*;

public class FileUtil {
    /*
     * Method to read CSV file
     */
    public static void readCSVFile(String path) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader(path));
        String readLine=null;
        while((readLine=br.readLine())!=null){
            System.out.println("Students { "+readLine.toString()+" }");
        }
        br.close();
    }


    /*
     * Method to create CSV File
     * */
    public static void writeCSVFile(String path) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter(path));
        String[] data = students();
        bw.write("ID,AGE,FirstName,LastName,ParentFirstName,ParentLastName"+"\n");
        for(String studentData: data ){
            bw.write(studentData);
            bw.write("\n");
        }
        bw.close();
    }

    /*
     * Method to pass data to write in CSV File
     * */
    public static String[] students(){
        String[] studentList={
                "1,22,Riya,Mistry,Deepak,Mistry",
                "2,28,Komal,Chawat,Natwar,Chawat",
                "3,15,Shreya,Mehar,Ramesh,Mehar",
                "4,35,Ishaan,Patil,Vikas,Patil",
                "5,12,Mahi,Shah,Anil,Shah",
        };
        return studentList;
    }

    public static void demo() throws IOException {
        System.out.println("FileUtil Class demo method called"+"\n");
        System.out.println("----------------Reading data From CSV File----------------------");
        readCSVFile("F:\\CSYE6200\\workspace_2021_3_Divyesh_Shah_csv1\\Project1\\src\\students.csv");
        System.out.println("----------------Reading From CSV File completed------------------"+"\n");

        System.out.println("---------------------Writing data to CSV File--------------");
        String writeFilePath = "F:\\CSYE6200\\workspace_2021_3_Divyesh_Shah_csv1\\Project1\\src\\CSVFileCreated.csv";
        System.out.println("***\n***\n***\n***\n***");
        writeCSVFile(writeFilePath);
        System.out.println("---------------------Writing to CSV File Completed-----------------");
    }
}
