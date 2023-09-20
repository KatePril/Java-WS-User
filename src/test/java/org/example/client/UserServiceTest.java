package org.example.client;

import org.example.client.generated.UserService;
import org.example.client.generated.UserServiceImplService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {
    static UserServiceImplService service;
    static UserService userService;

    @BeforeAll
    static void setup() {
        service = new UserServiceImplService();
        userService = service.getUserServiceImplPort();
    }

    @Test
    public void givenUserService_whenUserMary_thenGenderIsFemale() {
        assertEquals("FEMALE", userService.findByName("Mary").getGender().name());
    }

    @Test
    public void givenUserService_whenUserJohn_thenPhoneNumberIsCorrect() {
        assertEquals("+380 (66) 432 72 88", userService.findByName("John").getPhone());
    }

    @Test
    public void givenUserService_whenUserEdward_thenAgeIsCorrect() {
        assertEquals(18, userService.findByName("Edward").getAge());
    }

}
