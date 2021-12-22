/**
 * COPYRIGHT NOTICE
 * <p>
 * All Technical Data and software is Copyright (c), 2021 by
 * COLOMBIAN AIR FORCE.
 * <p>
 * COPYRIGHT NOTICE
 */
package co.mil.fac.cetad.apidemo.services;

import co.mil.fac.cetad.apidemo.repositories.User;

import java.util.List;

/**
 * @author: Ing. Manuel Fernando Garizao;
 * Email: manuel.garizao@fac.mil.co manuelfp@gmail.com
 * @date: 21/12/21, 11:28 AM
 **/
public interface UserService {

    User createUser(User user);

    User editUser(User user);

    List<User> listAllUser();

    boolean deleteUserById(String nui);

}
