package com.lixwucs.muhu.service;

import com.lixwucs.muhu.bean.Notices;
import com.lixwucs.muhu.dao.NoticesMapper;
import com.lixwucs.muhu.service.iservice.NoticesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 11:50
 */
@Service
public class NoticesServiceImpl implements NoticesService {

    @Autowired
    private NoticesMapper noticesMapper;


    @Override
    public List<Notices> findAll() {

        return noticesMapper.findAll();
    }

    @Override
    public int insertSelective(Notices notices) {
        return noticesMapper.insertSelective(notices);
    }
}
