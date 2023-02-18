package springbootjsp.springjsp.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<Databasebean, String> {

	List<Databasebean> findByUsername(String username);
	
	
}
