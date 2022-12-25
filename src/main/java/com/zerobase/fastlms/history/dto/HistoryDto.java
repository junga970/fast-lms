package com.zerobase.fastlms.history.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.zerobase.fastlms.admin.dto.CategoryDto;
import com.zerobase.fastlms.admin.entity.Category;
import com.zerobase.fastlms.history.entity.History;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class HistoryDto {
    
    String userId;
    String ip;
    String userAgent;
    LocalDateTime accessDt;
    
    //추가컬럼
    long totalCount;
    long seq;
    
    public static HistoryDto of(History history) {
        
        return HistoryDto.builder()
                .userId(history.getUserId())
                .ip(history.getIp())
                .userAgent(history.getUserAgent())
                .accessDt(history.getAccessDt())
                .build();
    }

    public static List<HistoryDto> of(List<History> histories) {
        if (histories!= null) {
            List<HistoryDto> historyList = new ArrayList<>();
            for(History x : histories) {
                historyList.add(of(x));
            }
            return historyList;
        }
        
        return null;
    }
}
