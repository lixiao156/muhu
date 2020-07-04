package com.lixwucs.muhu.service;

import com.lixwucs.muhu.bean.NewsDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 15:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuServiceImplTest {
    @Autowired
    private MenuServiceImpl menuService;

    @Test
    public void findNewsByChannelsId() {
        List<NewsDo> newsByChannelsId = menuService.findNewsByChannelsId(1l);
        for (NewsDo news:newsByChannelsId
             ) {
            System.out.println(news.toString());
        }
    }
}