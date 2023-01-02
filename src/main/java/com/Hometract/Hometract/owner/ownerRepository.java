package com.Hometract.Hometract.owner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ownerRepository extends JpaRepository<owner, Long> {

}
