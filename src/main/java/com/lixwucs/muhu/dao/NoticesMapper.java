package com.lixwucs.muhu.dao;


import com.lixwucs.muhu.bean.Notices;
import org.apache.ibatis.annotations.Mapper;


public interface NoticesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Notices record);

    int insertSelective(Notices record);

    Notices selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Notices record);

    int updateByPrimaryKey(Notices record);
}