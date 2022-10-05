//copypast task1
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls =new ArrayList<String>();
//        girls.add("Merey");
//        girls.add("Dana");
//        girls.add("Aru");
//        girls.add("Aizh");
//        System.out.println(girls);
//
//
//    }
//}

//copypast task2
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls =new ArrayList<String>();
//        girls.add("Merey");
//        girls.add("Dana");
//        girls.add("Aru");
//        girls.add("Aizh");
//        for (int i = 0; i < girls.size(); i++) {
//            System.out.println(girls.get(i));
//
//        }
//
//    }
//}




//copypast task3
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls = new ArrayList<String>();
//       girls.add("Merey");
//        girls.add("Dana");
//       girls.add("Aru");
//       girls.add("Aizh");
//      for (String i : girls) {
//            System.out.println(i);
//        }
//    }
//}



//copypast task4
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(10);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(25);
//        for (int i :myNumbers) {
//            System.out.println(i);
//        }
//    }
//}


//copypast task5
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls = new ArrayList<String>();
//        girls.add("Merey");
//        girls.add("Dana");
//        girls.add("Aru");
//        girls.add("Aizh");
//        Collections.sort(girls);
//        for (String i :girls)
//        System.out.println(i);
//    }
//}


//copypast task6
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
//        myNumbers.add(33);
//        myNumbers.add(15);
//        myNumbers.add(20);
//        myNumbers.add(34);
//        myNumbers.add(8);
//        myNumbers.add(12);
//
//        Collections.sort(myNumbers);
//       for (int i : myNumbers) {
//        System.out.println(i);
//    }
//}}


//copypast task7
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> girls =  new ArrayList<String>();
//        girls.add("Merey");
//        girls.add("Dana");
//        girls.add("Aru");
//        girls.add("Aizh");
//        System.out.println(girls);
//
//        String girl = girls.get(0);
//        System.out.println("get method:" +girls);
//
//        girls.set(0, "Yuki");
//        System.out.println("set method:" +girls);
//
//        girls.remove(0);
//        System.out.println("remove method:" +girls);
//
//        girls.clear();
//        System.out.println("clear method:" +girls);
//
//        int s = girls.size();
//        System.out.println("list size:" +s);
//
//    }
//}



//problem 1
//Write a Java program to create a new array list, add some colors (string) and print out the collection.
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("Pink");
//        colors.add("White");
//        colors.add("Purple");
//        colors.add("Black");
//        System.out.println( colors );
//    }
//}


//problem 2
//Write a Java program to insert an element into the array list at the first position.
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> companies = new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Microsoft");
//        companies.add("Chrome");
//        companies.add("Amazon");
//        companies.add("Samsung");
//        System.out.println(companies);
//
//        companies.add(1, "Lenova");
//        companies.add(3, "LG");
//
//        System.out.println(companies);
//        }
//    }

//problem 3
//Write a Java program to retrieve an element (at a specified index) from a given array list
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> companies = new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Microsoft");
//        companies.add("Chrome");
//        companies.add("Amazon");
//        companies.add("Samsung");
//        System.out.println(companies);
//
//       String element = companies.get(0);
//       System.out.println("Second element: "+element);
//        element = companies.get(2);
//
//
//        System.out.println("First element: "+element);
//    }
//}
//Problem4
//Write a Java program to update specific array element by given element

//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> companies = new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Amazon");
//        companies.add("Microsoft");
//        companies.add("Chrome");
//        companies.add("Samsung");
//        System.out.println(companies);
//
//
//        companies.set(3, "Disney");
//
//        System.out.println(companies);
//    }
//}

//Problem 5
//Write a Java program to remove the third element from a array list.

//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> companies = new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Microsoft");
//        companies.add("Chrome");
//        companies.add("Amazon");
//        companies.add("Samsung");
//        System.out.println(companies);
//
//
//        companies.remove(3);
//
//        System.out.println("removing result:\n"+companies);
//    }
//    }


//Problem6
//Write a Java program to search an element in a array list

//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> companies = new ArrayList<String>();
//        companies.add("Disney");
//        companies.add("Samsung");
//        companies.add("LG");
//        companies.add("Google");
//        companies.add("Microsoft");
//
//        if (companies.contains("Samsung")) {
//            System.out.println("Element bar");
//        } else {
//            System.out.println("Element jok");
//        }
//    }
//}


//Problem7
//Write a Java program to copy one array list into another

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//            List<String> birthday = new ArrayList<String>();
//            birthday.add("1");
//            birthday.add("2");
//            birthday.add("1");
//            birthday.add("2");
//            System.out.println("birthday: " + birthday);
//            List<String> Year = new ArrayList<String>();
//        Year.add("2");
//        Year.add("0");
//        Year.add("0");
//        Year.add("4");
//            System.out.println("Year: " + Year);
//
//            Collections.copy(birthday, Year);
//            System.out.println("Copy birthday to year\nCopied:");
//            System.out.println("birthday: " + birthday);
//            System.out.println("Year: " + Year);
//        }
//    }
//Problem8
//Write a Java program to shuffle elements in a array list

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<String> companies = new ArrayList<String>();
//        companies.add("Amazon");
//        companies.add("Google");
//        companies.add("Chrome");
//        companies.add("Microsoft");
//        companies.add("Disney");
//        System.out.println("before shuffling:\n" + companies);
//        Collections.shuffle(companies);
//        System.out.println("after shuffling:\n" + companies);
//    }
//}


//Problem9
//Write a Java program to reverse elements in a array list

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//
//        List<String> companies = new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Microsoft");
//        companies.add("Disney");
//        companies.add("Amazon");
//        companies.add("Chrome");
//        System.out.println("before reversing :\n" + companies);
//        Collections.reverse(companies);
//        System.out.println("after reversing :\n" + companies);
//    }
//}



//Bonus

//Problem1
//Write a Java program to extract a portion of a array list. Given first index and second index.

//import java.util.ArrayList;
//import java.util.List;
//
//public class Main  {
//    public static void main(String[] args) {
//
//        List<String> companies = new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Amazon");
//        companies.add("Chrome");
//        companies.add("Disney");
//        companies.add("LG");
//        System.out.println("List: " + companies);
//        List<String> sub_List = companies.subList(0, 3);
//        System.out.println("List first  elements: " + sub_List);
//    }
//}

//Problem 2
//Write a Java program to compare two array lists.

//import java.util.ArrayList;
//public class Main{
// 	public static void main(String[] args) {
// ArrayList<String> companies = new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Microsoft");
//        companies.add("Amazon");
//        companies.add("Chrome");
//        companies.add("Disney");
//        ArrayList<String> numbers = new ArrayList<String>();
//        numbers.add("1");
//        numbers.add("2");
//        numbers.add("3");
//        numbers.add("4");
//        numbers.add("5");
//        numbers.add("6");
//
//        if (companies.equals(numbers) == true) {
//             System.out.println(" Array List bir birine ten");
//         }
//         else{
//             System.out.println(" Array List bir birine ten emes");
//         }
//
// 	}
// }


//Problem3
//Write a Java program of swap two elements in an array list.

//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> companies= new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Amazon");
//        companies.add("Disney");
//        companies.add("Chrome");
//        companies.add("JavaFx");
//
//        System.out.println("before Swap:");
//        for(String a: companies){
//            System.out.println(a);
//        }
//
//        Collections.swap(companies, 1, 4);
//        System.out.println("after swap:");
//        for(String b: companies){
//            System.out.println(b);
//        }
//    }
//}







//Problem4
//Write a Java program to join two array lists

//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<String> companies= new ArrayList<String>();
//        companies.add("Google");
//        companies.add("Chrome");
//        companies.add("Disney");
//        companies.add("Amazon");
//        companies.add("Tele2");
//        System.out.println("first array: " + companies);
//        ArrayList<String> companies1=new ArrayList<String>();
//        companies1.add("Google");
//        companies1.add("Chrome");
//        companies1.add("Disney");
//        companies1.add("Tele2");
//        System.out.println("second array: " + companies1);
//
//
//        ArrayList<String> a = new ArrayList<String>();
//        a.addAll(companies);
//        a.addAll(companies1);
//        System.out.println("New array: " + a);
//
//
//    }
//}

