package com.ego.service;

import com.ego.pojo.TbItemParamItem;

/**
 * 规格参数内容
 * @Author: aelchao aelchao207@gmail.com
 * @Date: 2018/8/29 下午6:32
 */
public interface TbItemParamItemDubboService {

    // 新增规格参数值
    int insertTbItemParamItem(TbItemParamItem tbItemParamItem);

    // 根据商品id查询规则参数内容
    TbItemParamItem selectByTbItemId(long tbItemId);
}
