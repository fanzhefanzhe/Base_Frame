//package com.helen.delay.service.util;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.File;
//import java.io.IOException;
//
///**
// * @Description: 本地磁盘工具类
// * @Author: songty@cheche365.com
// * @Date: 2022/7/6
// **/
//@Component
//@Slf4j
//public class FileUtil {
//
//    public String saveTempFileDir(MultipartFile file) {
//        // 创建临时目录
//        File tempFile = cn.hutool.core.io.FileUtil.createTempFile();
//        try {
//            file.transferTo(tempFile);
//        } catch (IOException e) {
//            log.error("文件保存失败{}", file.getOriginalFilename());
//        }
//        return tempFile.getAbsolutePath();
//    }
//}
