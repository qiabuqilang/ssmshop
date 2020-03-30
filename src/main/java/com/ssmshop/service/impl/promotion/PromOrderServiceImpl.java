package com.ssmshop.service.impl.promotion;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.PromOrderMapper;
import com.ssmshop.pojo.PromOrder;
import com.ssmshop.pojo.PromOrderExample;
import com.ssmshop.service.promotion.IPromOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("iPromOrderService")
public class PromOrderServiceImpl implements IPromOrderService{
    @Autowired
    private PromOrderMapper promOrderMapper;
    @Override
    public ServerResponse<PageInfo<PromOrder>> list(int pageNum, int pageSize) {
        PromOrderExample promOrderExample = new PromOrderExample();
        promOrderExample.createCriteria();
        PageHelper.startPage(pageNum,pageSize);
        List<PromOrder> promOrderList = this.promOrderMapper.selectByExample(promOrderExample);
        PageInfo<PromOrder> pageInfo = new PageInfo<>(promOrderList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<?> detail(Long promOrderId) {
        PromOrder promOrder = this.promOrderMapper.selectByPrimaryKey(promOrderId);
        if (null != promOrder){
            return ServerResponse.createBySuccess(promOrder);
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<?> add(PromOrder promOrder) {
        if (this.promOrderMapper.insertSelective(promOrder)>0){
            return ServerResponse.createBySuccess(promOrder);
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<?> edit(Long promOrderId, PromOrder promOrder) {
        promOrder.setId(promOrderId);
        if (this.promOrderMapper.updateByPrimaryKeySelective(promOrder)>0){
            PromOrder promOrderBack = this.promOrderMapper.selectByPrimaryKey(promOrder.getId());
            return ServerResponse.createBySuccess(promOrderBack);
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<?> remove(Long promOrderId) {
        if (this.promOrderMapper.deleteByPrimaryKey(promOrderId)>0){
            return ServerResponse.createBySuccess();
        }else{
            return ServerResponse.createByError();
        }
    }
}
