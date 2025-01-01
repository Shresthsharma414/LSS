package com.LSS.repository;
<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
=======
>>>>>>> dbfb524 (added accommodator model)

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LSS.models.Login;
<<<<<<< HEAD
@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {
	

	public List<Login> findPassByUsernameAndPass(String username,String password);
	
=======

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
>>>>>>> dbfb524 (added accommodator model)

}
