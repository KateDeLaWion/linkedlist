import java.util.LinkedList;

public class Student {

    public static void main(String[] args) {

        // Create linked list 1
//        LinkedList<String> animals = new LinkedList<>();
//
//        animals.add("horse");
//        animals.add("pig");
//        animals.add("sheep");
//
//        animals.add(0,"horse");
//        animals.add(1,"pig");
//        animals.add(2,"sheep");
//
//                System.out.println("My farm looks consists of : " + animals);





        // Create linked list 2
        LinkedList<String> mammals = new LinkedList<>();
        mammals.add(0,"horse");
        mammals.add(1,"pig");
        mammals.add(2,"sheep");

        System.out.println("My mammals farm looks consists of : " + mammals);

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Croc");
        animals.addAll(mammals);

        System.out.println("Animals combined : " + animals);

        String strIndex = animals.get(1);
        System.out.println("Element at index 1 : " + strIndex);

        int str2 = animals.indexOf("Croc");
        System.out.println("Croc is at the index of " + str2);
        int str3 = animals.indexOf("sheep");
        System.out.println("sheep is at the index of " + str3);

        System.out.println("size of the linked list is: "
                + animals.size());

        animals.addFirst("cat");
        animals.addFirst("dog");
        System.out.println("addFirst then the list is:" + animals);

        animals.addLast("koala");
        animals.addLast("cow");
        System.out.println("addLast then the list is:" + animals);

        System.out.println("removeFirst is: " + animals.removeFirst());
        System.out.println("removeFirst then the list is:" + animals);

        System.out.println("removeLast is : " + animals.removeLast());
        System.out.println("removedLast then give the list is :" + animals);

        System.out.println("set replaced : " + animals.set(3, "deer"));
        System.out.println("set then to The new LinkedList is:" + animals);

        System.out.println("get element is: " + animals.get(2));
        System.out.println("get new LinkedList is:" + animals);

//        clear only clear the content in the linkedlist but the linkedlist is still there to be added
        animals.clear();
        System.out.println("clear() List is : " + animals);

    }
}
