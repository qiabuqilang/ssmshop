package com.ssmshop.service;

import org.springframework.web.multipart.MultipartFile;

public interface IFile {
    String upload(MultipartFile multipartFile,String path);
}
