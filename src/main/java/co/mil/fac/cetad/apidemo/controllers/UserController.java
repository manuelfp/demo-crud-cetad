/**
 * COPYRIGHT NOTICE
 * <p>
 * All Technical Data and software is Copyright (c), 2021 by
 * COLOMBIAN AIR FORCE.
 * <p>
 * COPYRIGHT NOTICE
 */
package co.mil.fac.cetad.apidemo.controllers;

import co.mil.fac.cetad.apidemo.repositories.User;
import co.mil.fac.cetad.apidemo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Ing. Manuel Fernando Garizao;
 * Email: manuel.garizao@fac.mil.co manuelfp@gmail.com
 * @date: 21/12/21, 12:02 PM
 **/
@RestController
@RequestMapping("/rest/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user ){
        return userService.createUser(user);
    }

    @PutMapping
    public User editUser(@RequestBody User user) {
        return userService.editUser(user);
    }

    @GetMapping
    public List<User> listAllUser() {
        return userService.listAllUser();
    }

    @DeleteMapping("/{nui}")
    public boolean deleteUserById(@PathVariable String nui) {
        return userService.deleteUserById(nui);
    }

}
