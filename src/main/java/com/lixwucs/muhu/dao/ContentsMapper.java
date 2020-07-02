package com.lixwucs.muhu.dao;


import com.lixwucs.muhu.bean.Contents;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;



public interface ContentsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Contents record);

    int insertSelective(Contents record);

    Contents selectByPrimaryKey(Long id);

    List<Contents> contList(Long ChannelId);

    int updateByPrimaryKeySelective(Contents record);

    int updateByPrimaryKeyWithBLOBs(Contents record);

    int updateByPrimaryKey(Contents record);
}