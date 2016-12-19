package net.proselyte.logsecurityapp.service;

import net.proselyte.logsecurityapp.model.User;

/**
 * Service class for {@link net.proselyte.logsecurityapp.model.User}
 * Created by Artem on 20.12.2016.
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}