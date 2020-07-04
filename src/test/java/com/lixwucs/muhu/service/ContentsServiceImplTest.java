package com.lixwucs.muhu.service;

import com.lixwucs.muhu.bean.Channels;
import com.lixwucs.muhu.bean.Contents;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 11:55
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ContentsServiceImplTest {
   @Autowired
   private ContentsServiceImpl contentsService;
    @Test
    public void findAll() {
        List<Contents> all = contentsService.findAll();
        System.out.println(all.toString());

    }

    @Test
    public void insert() {
        Contents contents = new Contents();
        contents.setContent("新闻内容");
        int insert = contentsService.insert(contents);
        System.out.println(insert);
    }

    @Test
    public void insertSelective() {
        Contents contents = new Contents();
        contents.setContent("新闻内容");
        int insert = contentsService.insertSelective(contents);
        System.out.println(insert);
    }
}