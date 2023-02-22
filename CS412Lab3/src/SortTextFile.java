// Afton Lawver
// SIU851463587


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
//Student Class
 
class Student
{
    private String lastName;
    private String firstName;
    private float score;
     public Student(String lastName, String firstName, float score)    {
        this.firstName = firstName;
        this.lastName = lastName; 
        this.score = score;
    }
    public String getlastName() { return lastName;}
    public String getfirstName() { return firstName;}
    public float getScore() { return score;}   
    public void setlastName(String last) { lastName= last; }
    public void setfirstName(String first) { firstName= first; }
    public void setlastName(float s) { score= s; }       
}
 
//nameCompare Class to compare the firstNames
 
class firstNameCompare implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.getfirstName().compareTo(s2.getfirstName());
    }
}
 //nameCompare Class to compare the firstNames
 
class lastNameCompare implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.getlastName().compareTo(s2.getlastName());
    }
}
//marksCompare Class to compare the marks
 
class scoreCompare implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        return (int) (s2.getScore() - s1.getScore());
    }
}


public class SortTextFile
{
    public static void main(String[] args) throws IOException, InterruptedException {
        //Creating BufferedReader object to read the input text file
	System.out.println("Reading from file: "+ "students.txt");
 	
        BufferedReader reader = new BufferedReader(new FileReader("src/students.txt"));
 
        //Creating ArrayList to hold Student objects
 
        ArrayList<Student> studentRecords = new ArrayList<Student>();
 
        //Reading Student records one by one
 
        String currentLine = reader.readLine();

        while (currentLine != null)
        {
            String[] studentDetail = currentLine.split(" ");

            String lastName = studentDetail[0];
            String firstName = studentDetail[1];
            int score = Integer.valueOf(studentDetail[2]);



            //Creating Student object for every student record and adding it to ArrayList
 
            studentRecords.add(new Student(lastName, firstName, score));
 
            currentLine = reader.readLine();
        }
        Thread t1 = new Thread(() -> {
            Collections.sort(studentRecords, new firstNameCompare());
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter("sortFirstName.txt"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //Writing every studentRecords into output text file

            for (Student student : studentRecords)
            {
                try {
                    writer.write(student.getlastName());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    writer.write(" " +student.getfirstName());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    writer.write(" "+student.getScore());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                try {
                    writer.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            //Closing the resources

            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Collections.sort(studentRecords, new lastNameCompare());
                BufferedWriter writer = null;
                try {
                    writer = new BufferedWriter(new FileWriter("sortLastName.txt"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                //Writing every studentRecords into output text file

                for (Student student : studentRecords)
                {
                    try {
                        writer.write(student.getlastName());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        writer.write(" " +student.getfirstName());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        writer.write(" "+student.getScore());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        writer.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                //Closing the resources

                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                Collections.sort(studentRecords, new scoreCompare());
                BufferedWriter writer = null;
                try {
                    writer = new BufferedWriter(new FileWriter("sortScore.txt"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                //Writing every studentRecords into output text file

                for (Student student : studentRecords)
                {
                    try {
                        writer.write(student.getlastName());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        writer.write(" " +student.getfirstName());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        writer.write(" "+student.getScore());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    try {
                        writer.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                //Closing the resources

                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

    }
}