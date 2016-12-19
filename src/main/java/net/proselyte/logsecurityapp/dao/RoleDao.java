package net.proselyte.logsecurityapp.dao;

/**
 * Created by Artem on 20.12.2016.
 */

import net.proselyte.logsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}