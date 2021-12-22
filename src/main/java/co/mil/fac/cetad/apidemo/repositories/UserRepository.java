/**
 * COPYRIGHT NOTICE
 * <p>
 * All Technical Data and software is Copyright (c), 2021 by
 * COLOMBIAN AIR FORCE.
 * <p>
 * COPYRIGHT NOTICE
 */
package co.mil.fac.cetad.apidemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: Ing. Manuel Fernando Garizao;
 * Email: manuel.garizao@fac.mil.co manuelfp@gmail.com
 * @date: 21/12/21, 10:49 AM
 **/
@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
