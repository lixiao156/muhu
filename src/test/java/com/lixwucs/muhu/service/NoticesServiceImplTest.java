package com.lixwucs.muhu.service;

import com.lixwucs.muhu.bean.Notices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.soap.Addressing;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 11:55
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class NoticesServiceImplTest {
    @Autowired
    private  NoticesServiceImpl noticesService;
    @Test
    public void findAll() {
        List<Notices> all = noticesService.findAll();
        System.out.println(all.toString());
    }

    @Test
    public void insertSelective() {
        Notices notices = new Notices();
        notices.setAuthor("lisi");
        notices.setChannelsId(1);
        notices.setCreatedid(1l);
        notices.setCreatedtime(new Date());
        notices.setName("Mingzi");
        notices.setTitle("标题");
        notices.setSummary("zhaiyao");
        int i = noticesService.insertSelective(notices);
        System.out.println(1);
    }
}