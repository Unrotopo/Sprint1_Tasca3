package Nivell3.Exercici1V2.management;

import java.io.*;
import java.util.ArrayList;

public class CSVManager {

    public static String filePathCsv = "src\\Nivell3\\Exercici1\\resources\\people.csv";

    public void writeLine(String surname, String name, String id) {
        try {
            FileWriter csv = new FileWriter(filePathCsv, true);
            csv.write(surname + "," + name + "," + id + "\n");
            csv.close();
            System.out.println("Person added successfully");
        } catch (IOException e) {
            System.out.println("Directory not found");
        }
    }

    public ArrayList<String[]> CSVToList(String filePathCsv) {
        ArrayList<String[]> listOfPersons = new ArrayList<>();
        String[] data;
        try {
            File file = new File(filePathCsv);
            FileReader csv = new FileReader(file);
            BufferedReader br = new BufferedReader(csv);
            String line;

            while ((line = br.readLine()) != null) {
                data = line.split(",");
                listOfPersons.add(data);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return listOfPersons;
    }
}
