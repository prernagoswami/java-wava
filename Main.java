public class Main {
    public static void main(String[] args) {
         DynamicArray dynamic = new DynamicArray(5);

        //  System.out.println(dynamic.capacity);

         dynamic.add("A");
         dynamic.add("B");
         dynamic.add("C");

        //  dynamic.insert(0, "X");
        //  dynamic.delete("A");
        //  System.out.println(dynamic.search("C"));

         System.out.println(dynamic);
         System.out.println("Size = " + dynamic.size);
         System.out.println("Capacity = " + dynamic.capacity);
         System.out.println(dynamic.isEmpty());

    }
}
