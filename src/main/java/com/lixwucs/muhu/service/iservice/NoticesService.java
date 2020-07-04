package com.lixwucs.muhu.service.iservice;

import com.lixwucs.muhu.bean.Notices;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 11:49
 */
public interface NoticesService {

    List<Notices> findAll();

    int insertSelective(Notices notices);

}
