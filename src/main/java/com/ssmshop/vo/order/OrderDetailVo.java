package com.ssmshop.vo.order;

import com.ssmshop.pojo.Order;
import com.ssmshop.pojo.OrderAction;
import com.ssmshop.pojo.OrderGoods;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;

import java.math.BigDecimal;
import java.util.List;

public class OrderDetailVo {
    class BaseInfo{
        /**
         * 订单 ID： 1498 订单号： 201704111622453006 会员： 张谷泉
         E-Mail：  电话： 13512345678 应付金额： 0.00
         订单状态： 已确认 / 已支付 / 未发货 下单时间： 2017-04-11 16:22 支付时间： 2017-04-11 16:22
         支付方式： 其他方式 发票抬头： N
         */
        private Integer orderId;

        private String orderSn;

        private Integer userId;

        private Byte orderStatus;

        private Byte shippingStatus;

        private Byte payStatus;

        private String email;

        private String shippingCode;

        private String payCode;

        private String payName;

        private String invoiceTitle;

        public Integer getOrderId() {
            return orderId;
        }

        public void setOrderId(Integer orderId) {
            this.orderId = orderId;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Byte getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Byte orderStatus) {
            this.orderStatus = orderStatus;
        }

        public Byte getShippingStatus() {
            return shippingStatus;
        }

        public void setShippingStatus(Byte shippingStatus) {
            this.shippingStatus = shippingStatus;
        }

        public Byte getPayStatus() {
            return payStatus;
        }

        public void setPayStatus(Byte payStatus) {
            this.payStatus = payStatus;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getShippingCode() {
            return shippingCode;
        }

        public void setShippingCode(String shippingCode) {
            this.shippingCode = shippingCode;
        }

        public String getPayCode() {
            return payCode;
        }

        public void setPayCode(String payCode) {
            this.payCode = payCode;
        }

        public String getPayName() {
            return payName;
        }

        public void setPayName(String payName) {
            this.payName = payName;
        }

        public String getInvoiceTitle() {
            return invoiceTitle;
        }

        public void setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
        }
    }
    class ConsigneeInfo{
        private String shippingName;

        private String consignee;

        private Integer country;

        private Integer province;

        private Integer city;

        private Integer district;

        private Integer twon;

        private String address;

        private String zipcode;

        private String mobile;

        private String userNote;

        public String getShippingName() {
            return shippingName;
        }

        public void setShippingName(String shippingName) {
            this.shippingName = shippingName;
        }

        public String getConsignee() {
            return consignee;
        }

        public void setConsignee(String consignee) {
            this.consignee = consignee;
        }

        public Integer getCountry() {
            return country;
        }

        public void setCountry(Integer country) {
            this.country = country;
        }

        public Integer getProvince() {
            return province;
        }

        public void setProvince(Integer province) {
            this.province = province;
        }

        public Integer getCity() {
            return city;
        }

        public void setCity(Integer city) {
            this.city = city;
        }

        public Integer getDistrict() {
            return district;
        }

        public void setDistrict(Integer district) {
            this.district = district;
        }

        public Integer getTwon() {
            return twon;
        }

        public void setTwon(Integer twon) {
            this.twon = twon;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getUserNote() {
            return userNote;
        }

        public void setUserNote(String userNote) {
            this.userNote = userNote;
        }
    }
    class FeeInfo{
        private BigDecimal goodsPrice;

        private BigDecimal shippingPrice;

        private BigDecimal userMoney;

        private BigDecimal couponPrice;

        private Integer integral;

        private BigDecimal integralMoney;

        private BigDecimal orderAmount;

        private BigDecimal totalAmount;

        private Integer addTime;

        private Integer shippingTime;

        private Integer confirmTime;

        private Integer payTime;

        private Short orderPromId;

        private BigDecimal orderPromAmount;

        private BigDecimal discount;

        private String adminNote;

        private String parentSn;

        private Byte isDistribut;

        public BigDecimal getGoodsPrice() {
            return goodsPrice;
        }

        public void setGoodsPrice(BigDecimal goodsPrice) {
            this.goodsPrice = goodsPrice;
        }

        public BigDecimal getShippingPrice() {
            return shippingPrice;
        }

        public void setShippingPrice(BigDecimal shippingPrice) {
            this.shippingPrice = shippingPrice;
        }

        public BigDecimal getUserMoney() {
            return userMoney;
        }

        public void setUserMoney(BigDecimal userMoney) {
            this.userMoney = userMoney;
        }

        public BigDecimal getCouponPrice() {
            return couponPrice;
        }

        public void setCouponPrice(BigDecimal couponPrice) {
            this.couponPrice = couponPrice;
        }

        public Integer getIntegral() {
            return integral;
        }

        public void setIntegral(Integer integral) {
            this.integral = integral;
        }

        public BigDecimal getIntegralMoney() {
            return integralMoney;
        }

        public void setIntegralMoney(BigDecimal integralMoney) {
            this.integralMoney = integralMoney;
        }

        public BigDecimal getOrderAmount() {
            return orderAmount;
        }

        public void setOrderAmount(BigDecimal orderAmount) {
            this.orderAmount = orderAmount;
        }

        public BigDecimal getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(BigDecimal totalAmount) {
            this.totalAmount = totalAmount;
        }

        public Integer getAddTime() {
            return addTime;
        }

        public void setAddTime(Integer addTime) {
            this.addTime = addTime;
        }

        public Integer getShippingTime() {
            return shippingTime;
        }

        public void setShippingTime(Integer shippingTime) {
            this.shippingTime = shippingTime;
        }

        public Integer getConfirmTime() {
            return confirmTime;
        }

        public void setConfirmTime(Integer confirmTime) {
            this.confirmTime = confirmTime;
        }

        public Integer getPayTime() {
            return payTime;
        }

        public void setPayTime(Integer payTime) {
            this.payTime = payTime;
        }

        public Short getOrderPromId() {
            return orderPromId;
        }

        public void setOrderPromId(Short orderPromId) {
            this.orderPromId = orderPromId;
        }

        public BigDecimal getOrderPromAmount() {
            return orderPromAmount;
        }

        public void setOrderPromAmount(BigDecimal orderPromAmount) {
            this.orderPromAmount = orderPromAmount;
        }

        public BigDecimal getDiscount() {
            return discount;
        }

        public void setDiscount(BigDecimal discount) {
            this.discount = discount;
        }

        public String getAdminNote() {
            return adminNote;
        }

        public void setAdminNote(String adminNote) {
            this.adminNote = adminNote;
        }

        public String getParentSn() {
            return parentSn;
        }

        public void setParentSn(String parentSn) {
            this.parentSn = parentSn;
        }

        public Byte getIsDistribut() {
            return isDistribut;
        }

        public void setIsDistribut(Byte isDistribut) {
            this.isDistribut = isDistribut;
        }
    }
    private List<OrderAction> orderActionList;
    private List<OrderGoods> goodsInfoList;
    private BigDecimal totalPrice;
    private BaseInfo baseInfo = new BaseInfo();
    private ConsigneeInfo consigneeInfo = new ConsigneeInfo();
    private FeeInfo feeInfo = new FeeInfo();
    public OrderDetailVo(Order order){
        BeanUtils.copyProperties(order,baseInfo);
        BeanUtils.copyProperties(order,consigneeInfo);
        BeanUtils.copyProperties(order,feeInfo);
        this.totalPrice = order.getTotalAmount();
    }

    public List<OrderAction> getOrderActionList() {
        return orderActionList;
    }

    public void setOrderActionList(List<OrderAction> orderActionList) {
        this.orderActionList = orderActionList;
    }

    public List<OrderGoods> getGoodsInfoList() {
        return goodsInfoList;
    }

    public void setGoodsInfoList(List<OrderGoods> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }


    public ConsigneeInfo getConsigneeInfo() {
        return consigneeInfo;
    }

    public void setConsigneeInfo(ConsigneeInfo consigneeInfo) {
        this.consigneeInfo = consigneeInfo;
    }

    public FeeInfo getFeeInfo() {
        return feeInfo;
    }

    public void setFeeInfo(FeeInfo feeInfo) {
        this.feeInfo = feeInfo;
    }
}
