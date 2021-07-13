package com.example.final_lab5_service_a.Repository;


import com.example.final_lab5_service_a.Model.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LoggerRepository extends JpaRepository<Logger, Integer> {


}
