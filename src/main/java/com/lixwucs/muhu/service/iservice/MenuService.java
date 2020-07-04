package com.lixwucs.muhu.service.iservice;

import com.lixwucs.muhu.bean.NewsDo;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 15:33
 */
public interface MenuService {
    List<NewsDo> findNewsByChannelsId(long channelsId);

    int insert(NewsDo newsDo);

    int update(NewsDo newsDo);

    int delete(NewsDo newsDo);
}
