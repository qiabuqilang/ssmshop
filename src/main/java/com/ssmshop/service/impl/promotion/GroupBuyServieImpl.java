package com.ssmshop.service.impl.promotion;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsMapper;
import com.ssmshop.dao.GroupBuyMapper;
import com.ssmshop.pojo.Goods;
import com.ssmshop.pojo.GroupBuy;
import com.ssmshop.pojo.GroupBuyExample;
import com.ssmshop.service.promotion.IGroupBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("iGroupBuyService")
public class GroupBuyServieImpl implements IGroupBuyService{
    @Autowired
    private GroupBuyMapper groupBuyMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public ServerResponse<PageInfo<GroupBuy>> list(int pageNum, int pageSize) {
        GroupBuyExample groupBuyExample = new GroupBuyExample();
        groupBuyExample.createCriteria();
        PageHelper.startPage(pageNum,pageSize);
        List<GroupBuy> groupBuyList = this.groupBuyMapper.selectByExample(groupBuyExample);
        PageInfo<GroupBuy> pageInfo = new PageInfo<>(groupBuyList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<GroupBuy> detail(int groupBuyId) {
        GroupBuy groupBuy = this.groupBuyMapper.selectByPrimaryKey(groupBuyId);
        if (null != groupBuy){
            return ServerResponse.createBySuccess(groupBuy);
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<?> add(GroupBuy groupBuy) {
        Goods goods = this.goodsMapper.selectByPrimaryKey(groupBuy.getGoodsId());
        groupBuy.setGoodsName(goods.getGoodsName());
        if (this.groupBuyMapper.insertSelective(groupBuy)>0){
            return ServerResponse.createBySuccess(groupBuy);
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<?> edit(int groupBuyId, GroupBuy groupBuy) {
       groupBuy.setId(groupBuyId);
       if (this.groupBuyMapper.updateByPrimaryKeySelective(groupBuy)>0){
           return ServerResponse.createBySuccess(groupBuy);
       }else{
           return ServerResponse.createByError();
       }
    }

    @Override
    public ServerResponse<?> remove(int groupBuyId) {
        if (this.groupBuyMapper.deleteByPrimaryKey(groupBuyId)>0){
            return ServerResponse.createBySuccess();
        }else{
            return ServerResponse.createByError();
        }
    }
}
