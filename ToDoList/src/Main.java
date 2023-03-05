import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> inputList = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int menu = -1;
        while (menu != 0) {
            System.out.println("""
                    Please choose an action.
                    to add task to list press 1.
                    to see list press 2.
                    to upgrade the list press 3.
                    to exit press'0'.""");
            menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1 -> getTask();
                case 2 -> showList();
                case 3 -> upgradeList();
                case 0 ->System.out.println("Good bye...");
                default -> System.out.println("Invalid value. Please enter a valid value.");
            }

        }scanner.close();
    }
// gets tasks from user.
    public static void getTask () {

        while (true) {
            System.out.print("Enter a task('quit' to exit): ");
            String task = scanner.nextLine();
            if (task.equals("quit")) {
                break;
            }
            inputList.add(task);

        }
    }
    public static void showList (){
    if (inputList.size()==0) {
        System.out.println("Task list is empty");
    } else {
        for (int i=0; i<inputList.size();i++){
            String task=inputList.get(i);
            System.out.printf("%d %s\n",i+1,task);
        }
    }
    }
    public static void upgradeList(){
        try {
            System.out.println("Type the number of task which you want to remove from list: ");
            int taskNum = scanner.nextInt();
            scanner.nextLine();
            inputList.remove(taskNum - 1);
            System.out.println("The task has been removed successfully. Current list: ");
            showList();
        }
        catch (Exception e){
            System.out.println("Please try again /n"+ e);
        }

    }
}