package com.lixwucs.muhu.service;


import org.springframework.stereotype.Service;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/1 10:05
 */
@Service
public class ContentsServiceImpl implements ContentsService {

//    @Autowired
//    private ContentsMapper contentsMapper;
//
//    @Override
//    public int insert(Contents contents){
//        int insert = contentsMapper.insert(contents);
//        return insert;
//    }
//    @Override
//    public Contents selectByPrimaryKey(Long id){
//        Contents  contents = contentsMapper.selectByPrimaryKey(id);
//        return contents;
//    }
//
//    @Override
//    public int deleteByPrimaryKey(Long id) {
//        return 0;
//    }
//
//    @Override
//    public int insertSelective(Contents record) {
//        return 0;
//    }
//    // 根据信息列表的-parentid存储，然后再才能查询出来，这个是后端应该做到的
//    @Override
//    public List<Contents> contList(Long channelId) {
//        // 怎么设计可以返回一个list
//        //先将所有parentid为channnelid的数据存储到list中
//        List<Contents> contents = contentsMapper.contList(channelId);
//        return contents;
//    }
//
//    @Override
//    public int updateByPrimaryKeySelective(Contents record) {
//        return 0;
//    }
//
//    @Override
//    public int updateByPrimaryKeyWithBLOBs(Contents record) {
//        return 0;
//    }
//
//    @Override
//    public int updateByPrimaryKey(Contents record) {
//        return 0;
//    }
}
