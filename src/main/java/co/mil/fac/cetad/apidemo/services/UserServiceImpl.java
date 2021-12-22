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
import co.mil.fac.cetad.apidemo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @author: Ing. Manuel Fernando Garizao;
 * Email: manuel.garizao@fac.mil.co manuelfp@gmail.com
 * @date: 21/12/21, 11:35 AM
 **/
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User editUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> listAllUser() {
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteUserById(String nui) {
        try {
            userRepository.deleteById(nui);
        } catch (IllegalArgumentException ex) {
            return false;
        }
        return true;
    }

}
