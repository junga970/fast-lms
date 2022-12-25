package com.zerobase.fastlms.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zerobase.fastlms.admin.dto.BannerDto;
import com.zerobase.fastlms.admin.service.BannerService;
import com.zerobase.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;
    
    private final BannerService bannerService;
    
    @RequestMapping("/")
    public String index(Model model) {
        for (BannerDto b : bannerService.bannerList()) {
            System.out.println(b.getUrl() + " " + b.getUrlFilename());
        }
        
        model.addAttribute("bannerList", bannerService.bannerList());
        
        return "index";
    }
    
    
    
    @RequestMapping("/error/denied")
    public String errorDenied() {
        
        return "error/denied";
    }
    
    
    
}
