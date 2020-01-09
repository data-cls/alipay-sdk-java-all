package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * isv智能导购线下交易数据同步
 *
 * @author auto create
 * @since 1.0, 2019-12-18 16:30:26
 */
public class KoubeiServindustryPromoIntelligentguideSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8157765942571943789L;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 单商户下的门店交易数据列表
	 */
	@ApiListField("trade_infos")
	@ApiField("intelligent_guide_trade_info")
	private List<IntelligentGuideTradeInfo> tradeInfos;

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public List<IntelligentGuideTradeInfo> getTradeInfos() {
		return this.tradeInfos;
	}
	public void setTradeInfos(List<IntelligentGuideTradeInfo> tradeInfos) {
		this.tradeInfos = tradeInfos;
	}

}
