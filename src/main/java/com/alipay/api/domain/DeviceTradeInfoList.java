package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot设备交易信息列表
 *
 * @author auto create
 * @since 1.0, 2020-05-07 22:20:17
 */
public class DeviceTradeInfoList extends AlipayObject {

	private static final long serialVersionUID = 7254363929656188243L;

	/**
	 * 设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * DAU
	 */
	@ApiField("dau")
	private Long dau;

	/**
	 * 刷脸DAU
	 */
	@ApiField("device_face_trade_dau")
	private Long deviceFaceTradeDau;

	/**
	 * 设备名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/**
	 * 设备序列号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 设备激活状态
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * 扫脸交易笔数
	 */
	@ApiField("face_trade_cnt")
	private Long faceTradeCnt;

	/**
	 * 激活时间
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/**
	 * 统计时间
	 */
	@ApiField("max_dt")
	private String maxDt;

	/**
	 * 商家pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 门店信息
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 交易金额
	 */
	@ApiField("trade_amt")
	private String tradeAmt;

	/**
	 * 交易笔数
	 */
	@ApiField("trade_cnt")
	private Long tradeCnt;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public Long getDau() {
		return this.dau;
	}
	public void setDau(Long dau) {
		this.dau = dau;
	}

	public Long getDeviceFaceTradeDau() {
		return this.deviceFaceTradeDau;
	}
	public void setDeviceFaceTradeDau(Long deviceFaceTradeDau) {
		this.deviceFaceTradeDau = deviceFaceTradeDau;
	}

	public String getDeviceName() {
		return this.deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public Long getFaceTradeCnt() {
		return this.faceTradeCnt;
	}
	public void setFaceTradeCnt(Long faceTradeCnt) {
		this.faceTradeCnt = faceTradeCnt;
	}

	public String getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}

	public String getMaxDt() {
		return this.maxDt;
	}
	public void setMaxDt(String maxDt) {
		this.maxDt = maxDt;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTradeAmt() {
		return this.tradeAmt;
	}
	public void setTradeAmt(String tradeAmt) {
		this.tradeAmt = tradeAmt;
	}

	public Long getTradeCnt() {
		return this.tradeCnt;
	}
	public void setTradeCnt(Long tradeCnt) {
		this.tradeCnt = tradeCnt;
	}

}
