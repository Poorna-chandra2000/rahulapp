package com.rahul.rahulapp.Repositories;

import com.rahul.rahulapp.Entities.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepo extends JpaRepository<Info,Long> {
}
