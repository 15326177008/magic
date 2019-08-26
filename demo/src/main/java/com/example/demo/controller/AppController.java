package com.example.demo.controller;


import com.example.demo.bean.po.AppInfo;
import com.example.demo.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * Created by Administrator on 2019/8/5 0005.
 */


@Controller
public class AppController {
    @Autowired
    public AppInfoService appService;
    @RequestMapping("/getAppList")
    public String getAppList(ModelMap modelMap){
        List<AppInfo> appList = appService.getAppList();
        modelMap.addAttribute("appList",appList);
        System.out.println(appList.size());
        return "appList";
    }
}
