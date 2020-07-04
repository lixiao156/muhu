package com.lixwucs.muhu.service;

import com.lixwucs.muhu.bean.Channels;
import com.lixwucs.muhu.dao.ChannelsMapper;
import com.lixwucs.muhu.service.iservice.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/1 14:05
 */
@Service
public class ChannelServiceImpl implements ChannelService {

    @Autowired
    private ChannelsMapper channelsMapper;

    @Override
    public int insert(Channels record) {
        return channelsMapper.insert(record);
    }

    @Override
    public int insertSelective(Channels record) {
        return channelsMapper.insertSelective(record);
    }

    @Override
    public Channels channels(Long channelId) {
        return channelsMapper.channel(channelId);
    }

    @Override
    public List<Channels> findAll() {
        return channelsMapper.findAll();
    }

}
