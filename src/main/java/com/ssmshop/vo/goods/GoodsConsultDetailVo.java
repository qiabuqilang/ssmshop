package com.ssmshop.vo.goods;

import com.ssmshop.pojo.Goods;
import com.ssmshop.pojo.GoodsConsult;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class GoodsConsultDetailVo {
    private Integer id;

    private Integer goodsId;

    private String username;

    private Long addTime;

    private Byte consultType;

    private String content;

    private Integer parentId;

    private Byte isShow;

    private List<GoodsConsult> replay;

    public GoodsConsultDetailVo(GoodsConsult goodsConsult,List<GoodsConsult> goodsConsultList){
        BeanUtils.copyProperties(goodsConsult,this);
        this.replay = goodsConsultList;
    }

    public GoodsConsultDetailVo(Integer id, Integer goodsId, String username, Long addTime, Byte consultType, String content, Integer parentId, Byte isShow, List<GoodsConsult> replay) {
        this.id = id;
        this.goodsId = goodsId;
        this.username = username;
        this.addTime = addTime;
        this.consultType = consultType;
        this.content = content;
        this.parentId = parentId;
        this.isShow = isShow;
        this.replay = replay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public Byte getConsultType() {
        return consultType;
    }

    public void setConsultType(Byte consultType) {
        this.consultType = consultType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public List<GoodsConsult> getReplay() {
        return replay;
    }

    public void setReplay(List<GoodsConsult> replay) {
        this.replay = replay;
    }
}
