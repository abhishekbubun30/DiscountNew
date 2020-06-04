package com.travelers.bi.scbp.discount_manager.model;

import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Policy {
	private String policyNumber;
	private String policyFormCode;
	private List<PolicyTerm> policyTerm;

}
