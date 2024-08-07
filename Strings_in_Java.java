//Strings : Sequence of characters
//In java ,strings are Objects
//java provides a class called string in 'java.lang' package .
//always used in " " quotes.
//In java String objects are Immutable.

//Operation of string class
// 1. length()
// 2. concat()
// 3.charAt()
// 4.compareTo() -- returns either 0,1,-1
// 5.compareToIgnoreCase()
// 6.endsWith()
// 7.equals()
// 8.equalsIgnoreCase()
//9.indexOf()
//10.substring()
//11.matches()
//12.lastIndexOf()
//13.toLowerCase()
//14.toUpperCase()
//15.trim()



public class Strings_in_Java {
    public static void main(String[] args) {
        String greeting = "Good Morning";
        System.out.println(greeting);

        //2nd method -creating an object
        String greet = new String("GOod Evening");
        System.out.println(greet);

        //3rd method - using array
        char msg[] =  {'j','a','v','a'};
        String name = new String(msg);
        // System.out.println(msg);
        System.out.println(name);
        
    }
}
