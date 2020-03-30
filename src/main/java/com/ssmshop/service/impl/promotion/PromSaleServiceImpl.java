package com.ssmshop.service.impl.promotion;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsMapper;
import com.ssmshop.dao.PromGoodsMapper;
import com.ssmshop.pojo.Goods;
import com.ssmshop.pojo.PromGoods;
import com.ssmshop.pojo.PromGoodsExample;
import com.ssmshop.service.promotion.IPromoSaleService;
import com.ssmshop.vo.promotion.PromGoodsDeatilVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("IPromSaleService")
public class PromSaleServiceImpl implements IPromoSaleService {
    @Autowired
    private PromGoodsMapper promGoodsMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public ServerResponse<PageInfo<PromGoods>> list(int pageNum, int pageSize) {
        PromGoodsExample promGoodsExample = new PromGoodsExample();
        promGoodsExample.createCriteria();
        PageHelper.startPage(pageNum,pageSize);
        List<PromGoods> promGoodsList = this.promGoodsMapper.selectByExample(promGoodsExample);
        PageInfo<PromGoods> pageInfo = new PageInfo<>(promGoodsList);
        return ServerResponse.createBySuccess(pageInfo);
    }

    @Override
    public ServerResponse<?> detail(Long promGoodsId) {
        PromGoodsDeatilVo promGoodsDeatilVo = new PromGoodsDeatilVo();
        promGoodsDeatilVo.setGoodsList(new ArrayList<Goods>());
        PromGoods promGoods = this.promGoodsMapper.selectByPrimaryKey(promGoodsId);
        if (null != promGoods){
            BeanUtils.copyProperties(promGoods,promGoodsDeatilVo);
            String[] promGoodsIdsArr = promGoods.getGoodsIds().split("_");
            for (int i = 0;i<promGoodsIdsArr.length;++i){
                Goods goods = this.goodsMapper.selectByPrimaryKey(Integer.parseInt(promGoodsIdsArr[i]));
                promGoodsDeatilVo.getGoodsList().add(goods);
            }
            return ServerResponse.createBySuccess(promGoodsDeatilVo);
        }else{
            return ServerResponse.createByError();
        }

    }

    @Override
    public ServerResponse<?> add(PromGoods promGoods) {
        if (this.promGoodsMapper.insertSelective(promGoods)>0){
            return ServerResponse.createBySuccess(promGoods);
        }else{
            return ServerResponse.createByError();
        }
    }

    @Override
    public ServerResponse<?> edit(Long promGoodsId, PromGoods promGoods) {
        promGoods.setId(promGoodsId);
        if (this.promGoodsMapper.updateByPrimaryKey(promGoods)>0){
            return ServerResponse.createBySuccess();
        }else{
            return ServerResponse.createByError();
        }
    }


    @Override
    public ServerResponse<String> remove(Long promGoodsId) {
        if (this.promGoodsMapper.deleteByPrimaryKey(promGoodsId)>0){
            return ServerResponse.createBySuccess();
        }else{
            return ServerResponse.createByError();
        }
    }
}
