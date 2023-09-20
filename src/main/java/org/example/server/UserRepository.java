package org.example.server;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static final Map<String, User> users = new HashMap<>();

    static {}

    private static void initData() {
        User john = new User();
        john.setName("John");
        john.setPhone("+380 (66) 432 72 88");
        john.setAge(29);
        john.setGender(Gender.MALE);

        users.put(john.getName(), john);

        User mary = new User();
        mary.setName("Mary");
        mary.setPhone("+380 (98) 567 21 34");
        mary.setAge(23);
        mary.setGender(Gender.FEMALE);

        users.put(mary.getName(), mary);

        User edward = new User();
        edward.setName("Edward");
        edward.setPhone("+380 (98) 908 07 23");
        edward.setAge(18);
        edward.setGender(Gender.MALE);

        users.put(edward.getName(), edward);
    }

    public User findUser(String name) {
        return users.get(name);
    }
}
