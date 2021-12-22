/**
 * COPYRIGHT NOTICE
 * <p>
 * All Technical Data and software is Copyright (c), 2021 by
 * COLOMBIAN AIR FORCE.
 * <p>
 * COPYRIGHT NOTICE
 */
package co.mil.fac.cetad.apidemo.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author: Ing. Manuel Fernando Garizao;
 * Email: manuel.garizao@fac.mil.co manuelfp@gmail.com
 * @date: 21/12/21, 10:14 AM
 **/
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String nui;
    private String firstName;
    private String lastName;

    public User(String nui) {
        this.nui = nui;
    }

}
