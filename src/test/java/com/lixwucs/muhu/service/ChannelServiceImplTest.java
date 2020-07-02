package com.lixwucs.muhu.service;

import com.lixwucs.muhu.bean.Channels;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/1 14:53
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ChannelServiceImplTest {
    @Autowired
    private ChannelServiceImpl channelService;

    @Test
    public void chennalsList() {
        Channels channels = channelService.channels(0l);
        System.out.println(channels.getChannelName());
    }

    @Test
    public void findAll() {
        List<Channels> all = channelService.findAll();
        System.out.println(all);
    }
}