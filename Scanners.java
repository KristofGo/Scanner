import java.util.Scanner; // import the scanner class

    class Scanners {
    public static void main(String[] args) {
        while (true) {
            Scanner myObj = new Scanner(System.in); // Creating object
            System.out.println("Enter username");
            
            String userName = myObj.nextLine();
            System.out.println("Username is: "+ userName); // output user input 
        }
    }
}