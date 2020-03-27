package com.ssmshop.service.impl.promotion;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.FlashSaleMapper;
import com.ssmshop.dao.GoodsMapper;
import com.ssmshop.pojo.FlashSale;
import com.ssmshop.pojo.FlashSaleExample;
import com.ssmshop.pojo.Goods;
import com.ssmshop.service.promotion.IScareBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("iScareBuyService")
public class ScareBuyServiceImpl implements IScareBuyService {
    @Autowired
    private FlashSaleMapper flashSaleMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public ServerResponse<PageInfo<FlashSale>> list(int pageNum, int pageSize) {
        FlashSaleExample flashSaleExample = new FlashSaleExample();
        flashSaleExample.createCriteria();
        PageHelper.startPage(pageNum,pageSize);
        List<FlashSale> flashSaleList = this.flashSaleMapper.selectByExample(flashSaleExample);
        PageInfo<FlashSale> pageInfo = new PageInfo<>(flashSaleList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<FlashSale> detail(Long flashSaleId) {
        FlashSale flashSale = this.flashSaleMapper.selectByPrimaryKey(flashSaleId);
        if (null != flashSale){
            return ServerResponse.createBySuccess(flashSale);
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<?> add(FlashSale flashSale) {
        Goods goods = this.goodsMapper.selectByPrimaryKey(flashSale.getGoodsId());
        flashSale.setGoodsName(goods.getGoodsName());
        if (this.flashSaleMapper.insertSelective(flashSale)>0){
            return ServerResponse.createBySuccess(flashSale);
        }else{
            return ServerResponse.createByError();
        }


    }

    @Override
    public ServerResponse<?> edit(Long flashSaleId, FlashSale flashSale) {
        flashSale.setId(flashSaleId);
        if (this.flashSaleMapper.updateByPrimaryKeySelective(flashSale)>0){

            return ServerResponse.createBySuccess();
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<?> remove(Long flashSaleId) {
        if (this.flashSaleMapper.deleteByPrimaryKey(flashSaleId)>0){
            return ServerResponse.createBySuccess();
        }else{
            return ServerResponse.createByError();
        }
    }
}
