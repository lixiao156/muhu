package com.lixwucs.muhu.service;


import com.lixwucs.muhu.bean.Channels;
import com.lixwucs.muhu.bean.Contents;
import com.lixwucs.muhu.dao.ChannelsMapper;
import com.lixwucs.muhu.dao.ContentsMapper;
import com.lixwucs.muhu.service.iservice.ContentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/1 10:05
 */
@Service
public class ContentsServiceImpl implements ContentsService {
    @Autowired
    private ContentsMapper contentsMapper;
    @Override
    public List<Contents> findAll() {
        return contentsMapper.findAll();
    }

    @Override
    public int insert(Contents contents) {
        return contentsMapper.insert(contents);
    }

    @Override
    public int insertSelective(Contents contents) {
        return contentsMapper.insertSelective(contents);
    }
}
