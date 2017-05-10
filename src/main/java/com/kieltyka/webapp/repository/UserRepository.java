package com.kieltyka.webapp.repository;

import com.kieltyka.webapp.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by domin on 5/9/17.
 */
public interface UserRepository extends CrudRepository<User,Integer> {
}
