import java.util.Random;
import java.util.UUID;

public class User {
    private int id;
    private String name;
    private int age;
    private static int index = 0;

    public static User createUser(){
        User user = new User();
        index ++;
        user.id = index;
        UUID nameRandom = UUID.randomUUID();
        user.name = nameRandom.toString();
        Random random = new Random();
        user.age = random.nextInt(100);
       return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
