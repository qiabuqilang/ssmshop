package com.ssmshop.service.impl.goods;

import com.ssmshop.common.ServerResponse;
import com.ssmshop.dao.GoodsCategoryMapper;
import com.ssmshop.pojo.GoodsCategory;
import com.ssmshop.pojo.GoodsCategoryExample;
import com.ssmshop.service.goods.IGoodsCategoryService;
import com.ssmshop.service.impl.BaseServiceImpl;
import com.ssmshop.vo.goods.GoodsCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("iGoodsCategory")
public class GoodsCategoryServiceImpl extends BaseServiceImpl implements IGoodsCategoryService {
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;
    @Override
    public ServerResponse<List<GoodsCategoryVo>> list() {
        List<GoodsCategoryVo> goodsCategoryVos = new ArrayList<>();
        this.getCategoryByPid(goodsCategoryVos,0);
//        GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
//        goodsCategoryExample.createCriteria();
//        List<GoodsCategory> goodsCategories = this.goodsCategoryMapper.selectByExample(goodsCategoryExample);
//        return ServerResponse.createBySuccess(goodsCategories);
        return ServerResponse.createBySuccess(goodsCategoryVos);
    }

    public ServerResponse add(GoodsCategory goodsCategory){
        this.goodsCategoryMapper.insert(goodsCategory);
        GoodsCategory goodsCategoryFind = this.pidPathAndLevel(goodsCategory,"",goodsCategory.getId(),1);
        goodsCategory.setParentIdPath(goodsCategoryFind.getParentIdPath());
        goodsCategory.setLevel(goodsCategoryFind.getLevel());
       return super.responseBase(this.goodsCategoryMapper.updateByPrimaryKey(goodsCategory));


    }

    public ServerResponse remove(int goodsCategoryId){
      return super.responseBase(this.goodsCategoryMapper.deleteByPrimaryKey((short) goodsCategoryId));
    }

    @Override
    public ServerResponse edit(GoodsCategory goodsCategory) {
        GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
        goodsCategoryExample.createCriteria().andIdEqualTo((short) goodsCategory.getId());
        GoodsCategory goodsCategoryFind = this.pidPathAndLevel(goodsCategory,"",goodsCategory.getId(),1);
        goodsCategory.setParentIdPath(goodsCategoryFind.getParentIdPath());
        goodsCategory.setLevel(goodsCategoryFind.getLevel());
        return super.responseBase(this.goodsCategoryMapper.updateByExample(goodsCategory,goodsCategoryExample));
    }

    private boolean getCategoryByPid(List<GoodsCategoryVo> goodsCategoryVos, int pid){
//        找到所有的子节点
        GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
        goodsCategoryExample.createCriteria().andParentIdEqualTo((short)pid);
        List<GoodsCategory> goodsCategories = this.goodsCategoryMapper.selectByExample(goodsCategoryExample);
//        遍历子节点
        if (goodsCategories.size() >0){
            for (GoodsCategory goodsCategory: goodsCategories
                    ) {
                GoodsCategoryVo vo = new GoodsCategoryVo();
                vo = vo.goodsCategoryToVo(goodsCategory);
                List<GoodsCategoryVo> children = new ArrayList<>();
                if (this.getCategoryByPid(children,goodsCategory.getId())){
                    vo.setChildren(children);
                }else{
                    vo.setChildren(null);
                }
                goodsCategoryVos.add(vo);
            }
            return true;
        }else {
            return  false;
        }

    }


    private GoodsCategory pidPathAndLevel(GoodsCategory goodsCategory,String pidPath,int id,int level) {

        int pid = goodsCategory.getParentId();
        pidPath += pid+"_";
        if (pid>0){
            level++;
            return pidPathAndLevel(this.goodsCategoryMapper.selectByPrimaryKey((short)pid),pidPath,id,level);
        }else{
            pidPath = new StringBuilder(pidPath).reverse().toString()+"_"+id;
            pidPath = pidPath.substring(1);
            goodsCategory.setParentIdPath(pidPath);
            goodsCategory.setLevel((byte)level);
            goodsCategory.setId((short)id);
            return goodsCategory;
        }

    }
}
