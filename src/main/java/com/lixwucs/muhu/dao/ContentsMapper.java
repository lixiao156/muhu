package com.lixwucs.muhu.dao;


import com.lixwucs.muhu.bean.Contents;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;



public interface ContentsMapper {
    List<Contents> findAll();

    int insert(Contents contents);
    int insertSelective(Contents contents);

}