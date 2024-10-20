public class LinkedList {
    Node head;


    // constructor
    LinkedList() {
        head = null;
    }

    boolean isEmpty() {
        return (head == null);
    }


    // اضافه عنصر في اول ال list
    void insertFirst(int newValue) {
        // هنا في حاله اذا كان ال list فيها عناصر او لا هيتم انشاء new node جديده
        Node newNode = new Node(); // 1: create new node

        newNode.data = newValue; // ال data بتاعت كلاس node هتساوي ال newValue

        // عامل check عشان لو ال list فاضيه هيكون ال pointer بتاع data ب null
        if (isEmpty()) {
            newNode.next = null;
            head = newNode; // هنا ال head بيشاور علي ال newNode
        } else {
            // تحقيق شرط اذا كان يوجد عناصر في ال list
            newNode.next = head; // بخاي ال pointer بتاع ال newNode يشاور علي ال head بتاعت العنصر الموجود سابقا في ال list عشان عايز اضيف newNode فالاول
            head = newNode; // وهنا بخلي ال head بيشاور علي ال nweNode عشان هي بقت الاول
        }


    }

    // المرور علي عناصر ال list لعرضها
    void display() {

        Node temp = head; // عملنا هنا متغير بيساوي ال head عشان اقدر اتحرك بيه في ال list واطبع العناصر

        while (temp != null) // عملت check عشان اطبع العناصر ووقت لما يكون ال temp ب null اعرف انه وصل لاخر ال list
        {
            //معني الشرط طول ما ال temp لا يساوي null اطبع ال data اللي في class Node
            System.out.println(temp.data);

            // traversing     عبور الاشياء
            temp = temp.next; //انتقال من node الي node اخري
        }
    }

    int Count() {
        int counter = 0;
        Node temp = head;
        while (temp != null) {
            counter++;

            // traversing     عبور الاشياء
            temp = temp.next; //انتقال من node الي node اخري
        }
        return counter;
    }

    boolean isFound(int key) {
        boolean found = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                found = true;
            temp = temp.next;

        }
        return found;
    }


    void insertBefore(int item, int newValue) {
        if (isEmpty())

            insertFirst(newValue);

        if (isFound(item)) {
            Node newNode = new Node();
            newNode.data = newValue;
            Node temp = head;// بخليه يساوي ال head عشان يبدأ من الاول

            while (temp != null && temp.data != item) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        } else
            System.out.println("error!! the item not found");


    }


    void append(int newValue) {
        if (isEmpty()) {
            insertFirst(newValue);

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node();
            newNode.data = newValue;
            temp.next = newNode;
            newNode.next = null;
        }
    }


    void delete(int item) {
        Node delTemp = head;
        if (isEmpty()) {
            System.out.println("list is empty,no items to delete");
        } else if (head.data == item) {
            Node FirstDelTemp = head;
            head = head.next;
        } else if (item != head.data) {
            System.out.println("error!! not found the items for delete\n");
        } else {
            delTemp = head;
            Node preTemp = null;
            while (delTemp.data != item) {
                preTemp = delTemp;
                delTemp = delTemp.next;
            }
            preTemp.next = delTemp.next;
        }


    }
}
////// by me