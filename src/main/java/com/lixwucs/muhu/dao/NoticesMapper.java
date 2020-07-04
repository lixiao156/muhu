package com.lixwucs.muhu.dao;


import com.lixwucs.muhu.bean.Channels;
import com.lixwucs.muhu.bean.Notices;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface NoticesMapper {
    List<Notices> findAll();
    int insertSelective(Notices notices);
}