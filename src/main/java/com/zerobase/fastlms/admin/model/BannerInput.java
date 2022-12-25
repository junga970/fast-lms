package com.zerobase.fastlms.admin.model;

import lombok.Data;

@Data
public class BannerInput {

    long id;
    long BannerId;
    String subject;
    String url;
    String targetType;
    int sortValue;
    boolean postYn;
    
    //삭제를 위한
    String idList;
    
    //ADD
    String filename;
    String urlFilename;

}
