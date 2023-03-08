package com.example.kakaoapi;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/oauth")
public class OAuthController {
    /*
    카카오 callback
    * [GET]/outh/kakao/callback
     */
    @Autowired
    private OAuthService kakao;
    @ResponseBody
    @GetMapping("/kakao")
    public void kakaoCallback(@RequestParam(value="code", required=false)  String code) {


        String access_Token = kakao.getKakaoAccessToken(code);
        System.out.println("controller access_token : " + access_Token);
    }


}
