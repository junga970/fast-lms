package com.zerobase.fastlms.history.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zerobase.fastlms.history.entity.History;

public interface HistoryRepository extends JpaRepository<History, Long> {
    
    List<History> findByUserId(String userId);
    
    long countByUserId(String userId);

}
