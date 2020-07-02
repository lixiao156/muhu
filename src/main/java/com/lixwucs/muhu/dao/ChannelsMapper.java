package com.lixwucs.muhu.dao;


import com.lixwucs.muhu.bean.Channels;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface ChannelsMapper {

    int insert(Channels record);

    int insertSelective(Channels record);

    Channels channel(Long channelId);

    List<Channels> findAll();

}