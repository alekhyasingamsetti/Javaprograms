package ex_String_Collection;

public class String_collection_types {
    public static void main(String[] args) {
        String name = "Alekhya";
        System.out.println(name.length());
        // 1. charAt()
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat(" Yuvaraj"));

        // 3. contains()
        System.out.println(name.contains("Al"));

        // 4. equals()
        System.out.println(name.equals("Alekhya"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("alekhya"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('k'));

        String s1 = "name";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));


        // 7. length()
        System.out.println(name.length());


        // 8. replace( , )
        System.out.println(name.replace('h', 'H'));

        // 9. split()

        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);


        System.out.println(" ---");

        // 10. substring( , )
        System.out.println(name.substring(1, 3));
        String ss = "hamburger";
        System.out.println(ss.substring(4,9));


        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("A"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 17. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());


        // 18. compareTo()
        System.out.println(name.compareTo("Alekhya"));


        // 19. compareToIgnoreCase()
//        System.out.println(name.compareToIgnoreCase("sonal"));


        StringBuilder stringBuilder = new StringBuilder("Sonal");
        stringBuilder.append("Patel");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(" It's my World!");
        System.out.println(sb.toString());

    }
}
