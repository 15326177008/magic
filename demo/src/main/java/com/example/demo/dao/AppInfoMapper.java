package com.example.demo.dao;

import com.example.demo.bean.po.AppInfo;
import com.example.demo.bean.po.AppInfoKey;

import java.util.List;

public interface AppInfoMapper {
    int deleteByPrimaryKey(AppInfoKey key);

    int insert(AppInfo record);

    int insertSelective(AppInfo record);

    AppInfo selectByPrimaryKey(AppInfoKey key);

    int updateByPrimaryKeySelective(AppInfo record);

    int updateByPrimaryKey(AppInfo record);

    List<AppInfo> getAppList();
}