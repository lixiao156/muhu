package com.lixwucs.muhu.controller;

import com.lixwucs.muhu.bean.Channels;
import com.lixwucs.muhu.bean.NewsDo;
import com.lixwucs.muhu.dao.MenuMapper;
import com.lixwucs.muhu.service.iservice.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/1 10:51
 */
@Controller
public class IndexController {
    @Autowired
    private ChannelService channelService;

    @RequestMapping(value = {"/","/index"})
    public String index(Model model){
        // 将顶层的目录展示出来即可
        List<Channels> all = channelService.findAll();
        // 根据顶层查找树 放置在前端进行展示 门户频道展示的树
        model.addAttribute("ChannelsList",all);
        // TODO
        return  "index2";
    }
}

