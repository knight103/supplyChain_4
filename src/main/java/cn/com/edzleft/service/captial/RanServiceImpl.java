package cn.com.edzleft.service.impl;

import cn.com.edzleft.dao.captial.RainMapper;
import cn.com.edzleft.service.Rainservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ASUS on 2017/10/30.
 */
@Service
public class RanServiceImpl implements Rainservice{

    @Autowired
    private RainMapper rainMapper;
}