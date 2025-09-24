import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day2_Example
{
    public static void main(String[] args) {
        List<String> list =List.of(
                "Alice", "Bob", "Charlie", "David", "Eve",
                "Frank", "Grace", "Hannah", "Ian", "Jack",
                "Karen", "Leo", "Mia", "Nathan", "Olivia",
                "Paul", "Quincy", "Rachel", "Sam", "Tina",
                "Uma", "Victor", "Wendy", "Xander", "Yara",
                "Zane", "Aaron", "Bella", "Cody", "Diana",
                "Ethan", "Fiona", "George", "Hazel", "Isaac",
                "Julia", "Kevin", "Lily", "Mark", "Nora"
        );
        System.out.println("This is List");
        System.out.println(list);
        System.out.println("What you Want Search");
        Scanner search= new Scanner(System.in);
        String name = search.nextLine();

        List<String> filterdname=list.stream().filter(a->a.toLowerCase().startsWith(name.toLowerCase())).collect(Collectors.toList());
        System.out.println(filterdname);

    }
}
