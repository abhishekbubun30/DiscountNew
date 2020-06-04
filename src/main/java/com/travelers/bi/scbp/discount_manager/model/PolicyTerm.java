package com.travelers.bi.scbp.discount_manager.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PolicyTerm {
	
	private String policyEffectiveDate;
	private String billingPlanCode;
	private String adverseBillingCount;

}
