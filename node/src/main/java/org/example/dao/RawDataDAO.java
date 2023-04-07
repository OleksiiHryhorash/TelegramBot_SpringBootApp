package org.example.dao;

import org.example.entity.RawDataForDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RawDataDAO extends JpaRepository<RawDataForDB, Long> {

}
