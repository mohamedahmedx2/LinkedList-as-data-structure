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

        System.out.println("enter item to insert in the list");
        int item = scanner.nextInt();
        list.insertFirst(item);

        System.out.println("enter item to insert in the list");
        int item2 = scanner.nextInt();
        list.insertFirst(item2);


        System.out.println("enter item to insert in the list");
        int item3 = scanner.nextInt();
        list.insertFirst(item3);
        System.out.println("the list contains " + list.Count());






//        System.out.println("enter item old");
//        int itemOld = scanner.nextInt();
//        System.out.println("enter the new value");
//        int newValue = scanner.nextInt();
//        list.insertBefore(itemOld,newValue);
//        list.display();

        System.out.println("enter the new value in last");
        int nvLast = scanner.nextInt();
        list.append(nvLast);


        System.out.println("enter item to delete");
        int delItem = scanner.nextInt();
        list.delete(delItem);

        System.out.println("final the items in LinkedList:");
        list.display();

//        System.out.println("enter item to search for");
//        int itemSearch = scanner.nextInt();
//        if (list.isFound(itemSearch))
//        {
//            System.out.println("item found");
//        }else
//        {
//            System.out.println("item not found");
//        }

    }
}



////// by me