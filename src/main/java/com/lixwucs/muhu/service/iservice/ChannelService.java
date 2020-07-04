package com.lixwucs.muhu.service.iservice;

import com.lixwucs.muhu.bean.Channels;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/1 14:05
 */
public interface ChannelService {

    int insert(Channels record);

    int insertSelective(Channels record);

    Channels channels(Long channelId);

    List<Channels> findAll();

}
