package com.ssmshop.controller.backend;

import com.ssmshop.common.ServerResponse;
import com.ssmshop.service.IFileService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/common/")
public class BackendBaseController {
    @Autowired
    private IFileService iFileService;
    @RequestMapping(value = "test.do")
    @ResponseBody
    public ServerResponse test(){
        return ServerResponse.createBySuccess();
    }
    @RequestMapping(value = "upload.do")
    @ResponseBody
    public Map<String ,String> uplod(MultipartFile multipartFile, HttpServletRequest request, HttpServletResponse response){

        Map<String,String> resultMap = new HashMap<>();
        String path = request.getSession().getServletContext().getRealPath("upload");
        String targetFileName = this.iFileService.upload(multipartFile,path);
        if(StringUtils.isBlank(targetFileName)){
            resultMap.put("success","false");
            resultMap.put("msg","上传失败");
            return resultMap;
        }
        resultMap.put("success","true");
        resultMap.put("msg","上传成功");
        resultMap.put("file_path",targetFileName);
        response.addHeader("Access-Control-Allow-Headers","X-File-Name");
        return resultMap;

    }
}
