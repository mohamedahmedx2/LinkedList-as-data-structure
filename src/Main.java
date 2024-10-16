import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedList list = new LinkedList();
        if (list.isEmpty()) {
            System.out.println("the list is empty");
        } else {
            System.out.println("the list contains " + list.Count());
        }

        for (int i = 1;i< 5;i++)
        {
            System.out.println("enter item to insert in the list " + i);
            int item = scanner.nextInt();
            list.insertFirst(item);
        }
        list.display();
        System.out.println("the list contains " + list.Count());
//        System.out.println("enter item to insert in the list");
//        int item = scanner.nextInt();
//        list.insertFirst(item);
       // list.display();


        System.out.println("enter item to search for");
        int item = scanner.nextInt();
        if (list.isFound(item))
        {
            System.out.println("item found");
        }else
        {
            System.out.println("item not found");
        }

    }
}