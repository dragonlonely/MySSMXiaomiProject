package com.dragon.fastdfs.controller;

import com.dragon.fastdfs.utils.FastDfsUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Administrator
 * @Date 2019/1/5 19:11
 * @Classname UploadController
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;

    @PostMapping("/uploadfile")
    @ResponseBody
    public String uploadFile(MultipartFile file){
        String picture =null;
        try {
            FastDfsUtils fastDfsUtils = new FastDfsUtils("classpath:conf.properties");
            String filename = file.getOriginalFilename();
            String ext_name = filename.substring(filename.lastIndexOf(".") + 1);
            String path = fastDfsUtils.fileUpload(file.getBytes(), ext_name);
            picture = IMAGE_SERVER_URL + path;
            System.out.println(picture);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return picture;
    }

}