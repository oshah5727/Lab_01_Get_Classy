import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args) {

        ArrayList<Person> personRecords = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonTestData.txt");

        boolean done = false;

        String personRec = "";
        String ID = "";
        String FirstName = "";
        String LastName = "";
        String Title = "";
        int YearOfBirth = 0;

        do {
        ID = SafeInput.getNonZeroLenString(in, "Enter the ID [6 digits]");
        FirstName = SafeInput.getNonZeroLenString(in, "Enter the first name");
        LastName = SafeInput.getNonZeroLenString(in, "Enter the last name");
        Title = SafeInput.getNonZeroLenString(in, "Enter the title");
        YearOfBirth = SafeInput.getRangedInt(in, "Enter the year of birth", 1940,2000);

        personRec = ID + ", " + FirstName + ", " + LastName + ", " + Title + ", " + YearOfBirth;

        Person objPersonRecords = new Person(ID, FirstName, LastName, Title, YearOfBirth);
        personRecords.add(objPersonRecords);

        done = SafeInput.getYNConfirm(in, "Are you done entering all the data elements for each person?");
        }

        while(!done);

      //  for(Person p: personRecords)
       //     System.out.println(p);

        try
        {
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            for(Person rec: personRecords)
            {
                String recDetails = rec.toCSVDataRecord();
                System.out.println(recDetails);
                writer.write(recDetails);
                writer.newLine();
            }
            writer.close();
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
