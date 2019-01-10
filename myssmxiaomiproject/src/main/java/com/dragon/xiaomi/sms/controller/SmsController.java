package com.dragon.xiaomi.sms.controller;

import com.dragon.xiaomi.commons.redis.JedisClientPool;
import com.dragon.xiaomi.utils.msg.IndustrySMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @Date 2019/1/9 15:48
 * @Classname SmsController
 */
@Controller
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    private JedisClientPool jedisClientPool;

    @RequestMapping("/msg")
    public String getPhoneCode(String phone){
        String phoneCode = IndustrySMS.execute(phone);
        System.err.println(phoneCode);
        jedisClientPool.set(phone, phoneCode);
        jedisClientPool.expire(phone, 120);
        return phoneCode;
    }

}
