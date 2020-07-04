package com.lixwucs.muhu.dao;

import com.lixwucs.muhu.bean.NewsDo;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 14:02
 */
// 根据新闻的类型进行展示消息
public interface MenuMapper {

    List<NewsDo> findNewsByChannelsId(long channelsId);

    int insert(NewsDo newsDo);

    int update(NewsDo newsDo);

    int delete(NewsDo newsDo);
}
