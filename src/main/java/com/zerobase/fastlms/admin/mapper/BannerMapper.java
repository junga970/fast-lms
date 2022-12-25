package com.zerobase.fastlms.admin.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.model.BannerParam;

@Mapper
public interface BannerMapper {
    
    long selectListCount(BannerParam parameter);
    List<BannerDto> selectList(BannerParam parameter);
    
}
