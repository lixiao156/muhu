package com.lixwucs.muhu.service;

import com.lixwucs.muhu.service.iservice.ReciceFileService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/7 12:07
 */
    public class ReciceFileServiceImpl implements ReciceFileService {

    public String receiveFile(HttpServletRequest request) {
        // 转换为 MultipartHttpServletRequest
        if (request instanceof MultipartHttpServletRequest) {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            // 通过表单中的参数名来接收文件流（可用 file.getInputStream() 来接收输入流）
            MultipartFile file = multipartRequest.getFile("file");
            System.out.println("上传的文件名称:" + file.getOriginalFilename());
            System.out.println("上传的文件大小:" + file.getSize());
            // 接收其他表单参数
            String name = multipartRequest.getParameter("name");
            String content = multipartRequest.getParameter("content");
            System.out.println("name:" + name);
            System.out.println("content:" + content);
            return "OK";
        } else {
            return "不是 MultipartHttpServletRequest";
        }
    }

}
