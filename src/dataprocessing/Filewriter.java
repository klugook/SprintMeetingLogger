package dataprocessing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void filewriter(String newString, String path) throws IOException {
        System.out.println("programming needed in Filewriter.filewriter");
        System.out.println(newString);



        System.out.println("=====================");
        System.out.println("Opening file....");
        BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
        System.out.println("Opening file.... "+ path);
        System.out.println("Writing to file....");
        bw.append(newString);
        bw.newLine();
        bw.close();


//        Ryans lokale AvengersMeetingLog_backup.txt
        try {
            System.out.println("=====================");
            System.out.println("Opening file....");
            String pathRyan = "F:\\Online syncs\\ONEDRIVE 2020 DEC\\OneDrive\\Documenten\\NEW-the-avengers\\files\\AvengersMeetingLog_backup.txt";
            BufferedWriter RyanAvengers_bw = new BufferedWriter(new FileWriter(pathRyan, true));
            System.out.println("Writing to file....");
            RyanAvengers_bw.append(newString);
            RyanAvengers_bw.newLine();
            RyanAvengers_bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done!");
    }
}

