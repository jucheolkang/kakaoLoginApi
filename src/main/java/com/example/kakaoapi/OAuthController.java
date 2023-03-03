package com.example.kakaoapi;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/outh")
public class OAuthController {
    /*
    카카오 callback
    * [GET]/outh/kakao/callback
     */
    @ResponseBody
    @GetMapping("/kakao")
    public String kakaoCallback(@RequestParam String code){
        System.out.println(code);
        return code;
    }
}
