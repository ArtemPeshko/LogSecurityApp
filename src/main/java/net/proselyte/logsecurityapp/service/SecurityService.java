package net.proselyte.logsecurityapp.service;

/**
 * Service for Security.
 *
 * Created by Artem on 20.12.2016
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}