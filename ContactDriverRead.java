import java.io.*;
public class ContactDriverRead {
    public static void main(String[] args) {
        try{
            FileInputStream fi = new FileInputStream("contactsOut.dat");
            ObjectInputStream inStream = new ObjectInputStream(fi);

            boolean eof = false;
            while(!eof){
                try{
                    Contact temp = (Contact) inStream.readObject();
                    System.out.println(temp);
                }catch(EOFException e){
                    System.out.println("Reached end of file");
                    eof = true;
                }
            }
            inStream.close();
        }catch(FileNotFoundException e){
            System.out.println("Not able to access file");
        }catch(ClassNotFoundException e){
            System.out.println("class not found");
        }catch(IOException e){
            System.out.println("Problem reading from file");
        }
    }
}
