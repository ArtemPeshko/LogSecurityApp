package net.logform.logsecurityapp.service;

import net.logform.logsecurityapp.model.User;

/**
 * Service class for {@link net.logform.logsecurityapp.model.User}
 * Created by Artem on 20.12.2016.
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}