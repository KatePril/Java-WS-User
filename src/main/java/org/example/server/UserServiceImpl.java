package org.example.server;

import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.server.UserService")
public class UserServiceImpl implements UserService{

    private final UserRepository repository = new UserRepository();

    @Override
    public User findByName(String name) {
        return repository.findUser(name);
    }
}
