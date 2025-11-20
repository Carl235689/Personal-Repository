import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entry1 = "";
        String entry2 = "";
        String entry3 = "";

        System.out.println("Enter your first diary entry:");
        entry1 = scanner.nextLine();
        System.out.println("Enter your second diary entry:");
        entry2 = scanner.nextLine();
        System.out.println("Enter your third diary entry:");
        entry3 = scanner.nextLine();

        System.out.println("\nAll Diary Entries:");
        System.out.println("1: " + entry1);
        System.out.println("2: " + entry2);
        System.out.println("3: " + entry3);

        System.out.println("\nEnter a keyword to search for:");
        String keyword = scanner.nextLine();
        System.out.println("Search Results:");
        
        String result1 = entry1.contains(keyword) ? entry1 : ""; 
        String result2 = entry2.contains(keyword) ? entry2 : "";
        String result3 = entry3.contains(keyword) ? entry3 : "";
        //^^^ assignes "" value to variable if keyword is not present ^^
        System.out.println("1: " + result1);
        System.out.println("2: " + result2);
        System.out.println("3: " + result3);

        System.out.println("\nEnter the number of the entry to edit (1-3):");
        String editNum = scanner.nextLine();
        System.out.println("Enter the new text:");
        String newText = scanner.nextLine();

        entry1 = editNum.equals("1") ? newText : entry1;
        entry2 = editNum.equals("2") ? newText : entry2;
        entry3 = editNum.equals("3") ? newText : entry3;

        System.out.println("\nEnter the number of the entry to delete (1-3):");
        String delNum = scanner.nextLine();
        entry1 = delNum.equals("1") ? "" : entry1;
        entry2 = delNum.equals("2") ? "" : entry2;
        entry3 = delNum.equals("3") ? "" : entry3;

        int count = 0;
        count += entry1.isEmpty() ? 0 : 1; //assigns correct value to count
        count += entry2.isEmpty() ? 0 : 1;
        count += entry3.isEmpty() ? 0 : 1;
        System.out.println("\nTotal non-empty entries: " + count);

        System.out.println("\nFinal Diary Entries:");
        System.out.println("1: " + entry1);
        System.out.println("2: " + entry2);
        System.out.println("3: " + entry3);

        scanner.close(); //<<<<< because I'm using VSCode
    }
}


    
    
    
    
    
    

