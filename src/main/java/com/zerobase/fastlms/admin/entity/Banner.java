
package com.zerobase.fastlms.admin.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Banner implements BannerCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    String subject;
    String url;
    String targetType;
    boolean postYn;
    LocalDateTime regDt;
    int sortValue;
    
    String filename;
    String urlFilename;
}
