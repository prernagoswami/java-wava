public class Main {
    public static void main(String[] args) {
         DynamicArray dynamic = new DynamicArray(5);

        //  System.out.println(dynamic.capacity);

         dynamic.add("A");
         dynamic.add("B");
         dynamic.add("C");

         System.out.println(dynamic);
         System.out.println(dynamic.size);
         System.out.println(dynamic.capacity);
         System.out.println(dynamic.isEmpty());

    }
}
