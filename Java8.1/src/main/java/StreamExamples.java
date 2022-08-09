import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        //1
        User user1 = User.createUser();
        User user2 = User.createUser();
        User user3 = User.createUser();
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        Stream<User> myStream = users.stream();

        //2
        Stream<User> anotherStream = Stream.generate(()->User.createUser()).limit(3);

    }
}
