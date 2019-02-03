package co.com.sorteopremios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.sorteopremios.entity.Premio;

public interface  PremioRepository extends JpaRepository<Premio, Integer> {

}
