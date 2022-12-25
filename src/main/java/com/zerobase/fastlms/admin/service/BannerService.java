package com.zerobase.fastlms.admin.service;

import java.util.List;
import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.model.BannerInput;
import com.zerobase.fastlms.admin.model.BannerParam;

public interface BannerService {

    List<BannerDto> list(BannerParam parameter);

    BannerDto getById(long id);

    boolean set(BannerInput parameter);

    boolean add(BannerInput parameter);

    boolean del(String idList);

    List<BannerDto> bannerList();

}
