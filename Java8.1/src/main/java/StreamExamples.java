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
        System.out.println(users);

        //2
        Stream<User> anotherStream = Stream.generate(()->User.createUser()).limit(3);

        myStream.filter(val -> val.getAge() > 50).forEach(val -> System.out.println(val));


        users.stream().map(val -> {val.setAge(val.getAge() * 2);
            return val;
        })
                .forEach((val -> System.out.println(val)));
    }
}
