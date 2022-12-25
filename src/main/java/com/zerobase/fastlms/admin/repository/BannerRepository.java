package com.zerobase.fastlms.admin.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.zerobase.fastlms.admin.entity.Banner;

public interface BannerRepository extends JpaRepository<Banner, Long> {
    List<Banner> findByPostYnOrderBySortValueDesc(boolean postYn);
}
