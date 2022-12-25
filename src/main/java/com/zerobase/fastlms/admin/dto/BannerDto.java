package com.zerobase.fastlms.admin.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.zerobase.fastlms.admin.entity.Banner;
import com.zerobase.fastlms.admin.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BannerDto {
    Long id;
    
    String image;
    String subject;
    String contents;
    String url;
    String targetType;
    boolean postYn;
    LocalDateTime regDt;
    int sortValue;
    
    String filename;
    String urlFilename;
    
    //추가컬럼
    long totalCount;
    long seq;
    
    public static List<BannerDto> of (List<Banner> banners) {
        if (banners != null) {
            List<BannerDto> bannerList = new ArrayList<>();
            for(Banner x : banners) {
                bannerList.add(of(x));
            }
            return bannerList;
        }
        
        return null;
    }
    
    public static BannerDto of(Banner banner) {
        return BannerDto.builder()
                .id(banner.getId())
                .subject(banner.getSubject())
                .url(banner.getUrl())
                .targetType(banner.getTargetType())
                .postYn(banner.isPostYn())
                .regDt(banner.getRegDt())
                .sortValue(banner.getSortValue())
                .filename(banner.getFilename())
                .urlFilename(banner.getUrlFilename())
                .build();
    }
}
