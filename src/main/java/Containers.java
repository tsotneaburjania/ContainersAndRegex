import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Containers {
    public static void main(String[] args) {
//       კოლექცია, ArrayList-ის მაგალითზე
        ArrayList<String> arr = new ArrayList<>();
        System.out.println(arr.size());
        arr.add("something");
        arr.add("hey");
        arr.add("this");
        arr.add("is");
        arr.add("mr");
        arr.add("krabs");
        arr.remove(0);
        System.out.println(arr.size());
        System.out.println(arr.get(0));
        String elementZero = arr.get(0);

//        ინტერფეის მითითება, რეალიზატორის ობიექტი
        Collection<String> coll = new ArrayList<>();

//        ლისტის იტერირება.
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(0));
        }

//        Iterator
        Iterator iter = arr.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

//        მაპი (შესაბამისობა)
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("555889889", "George");
        hMap.put("555187178", "Irakli");

//        პირდაპირი წვდომა value-ზე.
//        System.out.println(hMap.get("555889889"));
//        მაპის იტერირება გასაღებების სეტით.
        for (String key :
                hMap.keySet()) {
//            System.out.println(key);
            System.out.println(hMap.get(key));
        }

        Circle circle1 = new Circle(12);
        Circle circle2 = circle1;

        // HashSet
        HashSet<Circle> hashSet = new HashSet<>();
        hashSet.add(circle1);
        hashSet.add(circle2);
        hashSet.add(new Circle(12));

        System.out.println(hashSet);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(14);
        treeSet.add(3);
        treeSet.add(12);
        treeSet.add(1);

        System.out.println(treeSet);


        System.out.println(emailtest());
    }

    // Regex
    private static void phoneTest() {
        String str = "555724521";

        Pattern pattern = Pattern.compile("555\\d{6}");
        Matcher mather = pattern.matcher(str);

        boolean find = false;
        if (mather.find()) {
            find = true;
            System.out.println(mather.group());
            System.out.println(mather.start());
            System.out.println(mather.end());
        }

    }

    private static boolean emailtest() {
        String str = "ravaxarSimon@gmail.com";
        String str1 = "iamguramigmail.com";

        Pattern pattern = Pattern.compile("\\w{3,32}@\\w{3,15}\\.\\w{2,4}");
        Matcher mather = pattern.matcher(str);

        boolean find = false;
        if (mather.find()) {
            find = true;
            System.out.println(mather.group());
            System.out.println(mather.start());
            System.out.println(mather.end());
        }
        return find;
    }

}
