package com.detroitlabs.FinalProject.model;

import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

    public User findByName(String name);

    public User findByEmail(String email);
}
