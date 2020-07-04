package com.lixwucs.muhu.service.iservice;

import com.lixwucs.muhu.bean.Channels;
import com.lixwucs.muhu.bean.Contents;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/1 10:14
 */
public interface ContentsService {

    List<Contents> findAll();
    int insert(Contents contents);
    int insertSelective(Contents contents);

}
