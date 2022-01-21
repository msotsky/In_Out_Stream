import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class ContactDriver{

    public static void main(String[] args){
        try{
            File file = new File("contact.in");
            Scanner scan = new Scanner(file);

            FileOutputStream fo = new FileOutputStream("contactsOut.dat");
            ObjectOutputStream outStream = new ObjectOutputStream(fo);

            while(scan.hasNext()){
                try{
                    String name = scan.next();
                    int month = scan.nextInt();
                    int day = scan.nextInt();
                    Contact temp = new Contact(name, month, day);
                    System.out.println(temp);
                    outStream.writeObject(temp);
    
                    outStream.writeObject(temp);
                }catch(InputMismatchException e){
                    System.out.println("Error reading in data");
                    scan.nextLine();
                }
                outStream.close();
                scan.close();

            }
        }catch(FileNotFoundException e){
            System.out.println("Not able to access file");
        }catch(IOException e){
            System.out.println("Problem writting to file");
        }
    }
}