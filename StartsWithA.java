import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartsWithA{
  public static void main(String[] args) {
    List<String> names=Arrays.asList("apple","arya","arjun","hey","nithin");
    Stream<String> st = names.stream().filter(name -> (name.startsWith("a")&&name.length()==3));
    System.out.println("The String that starts with "+"a"+" and has a length of 3 is :");
    System.out.println(st.collect(Collectors.toList()));
  }
}
