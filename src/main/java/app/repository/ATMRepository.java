package app.repository;

import app.model.ATM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ATMRepository extends JpaRepository<ATM,Integer> {
}
