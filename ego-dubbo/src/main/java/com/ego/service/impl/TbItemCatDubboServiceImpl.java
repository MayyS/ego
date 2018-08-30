package com.ego.service.impl;

import com.ego.mapper.TbItemCatMapper;
import com.ego.pojo.TbItemCat;
import com.ego.pojo.TbItemCatExample;
import com.ego.service.TbItemCatDubboService;
import com.ego.utils.MyDubboUtils;

import javax.annotation.Resource;
import java.util.List;

public class TbItemCatDubboServiceImpl implements TbItemCatDubboService {
    @Resource
    private TbItemCatMapper tbItemCatMapper;
    @Resource
    private MyDubboUtils myDubboUtils;

    //根据父类目id查询所有子类目
    @Override
    public List<TbItemCat> selectTbItemCatByPid(long pid) {
        //创建查询对象
        TbItemCatExample example = new TbItemCatExample();
        //添加查询条件
        example.setOrderByClause("sort_order asc");
        example.createCriteria().andParentIdEqualTo(pid).andStatusEqualTo(1);
        return tbItemCatMapper.selectByExample(example);
    }

    //根据商品类目id查询类目
    @Override
    public TbItemCat selectTbItemCatById(long id) {
        return tbItemCatMapper.selectByPrimaryKey(id);
    }

    //查询所有商品类目
    @Override
    public List<TbItemCat> selectAllCat() {
        return myDubboUtils.selectAllCat(0);
    }
}
