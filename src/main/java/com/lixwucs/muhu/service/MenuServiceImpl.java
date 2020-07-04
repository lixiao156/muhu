package com.lixwucs.muhu.service;

import com.lixwucs.muhu.bean.NewsDo;
import com.lixwucs.muhu.dao.MenuMapper;
import com.lixwucs.muhu.service.iservice.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 15:34
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<NewsDo> findNewsByChannelsId(long channelsId) {
        return menuMapper.findNewsByChannelsId(channelsId);
    }

    @Override
    public int insert(NewsDo newsDo) {
        return 0;
    }

    @Override
    public int update(NewsDo newsDo) {
        return 0;
    }

    @Override
    public int delete(NewsDo newsDo) {
        return 0;
    }
}
