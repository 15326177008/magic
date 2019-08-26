package com.example.demo.service;


import com.example.demo.bean.po.AppInfo;
import com.example.demo.bean.po.AppInfoKey;
import com.example.demo.dao.AppInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/8/7 0007.
 */
@Service
public class AppInfoService {
    @Autowired(required = false)
    AppInfoMapper appInfoMapper;

    public AppInfo getAppInfoById(AppInfoKey appInfoKey){
        AppInfo appInfo = appInfoMapper.selectByPrimaryKey(appInfoKey);
        System.out.println(appInfo.getAppName());
        return appInfo;
    }

    public List<AppInfo> getAppList(){
        List<AppInfo> list = appInfoMapper.getAppList();
        return list;
    }
}
