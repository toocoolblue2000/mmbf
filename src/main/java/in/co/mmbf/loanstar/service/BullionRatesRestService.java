package in.co.mmbf.loanstar.service;

import java.util.List;

import in.co.mmbf.loanstar.model.BullionPrice;

public interface BullionRatesRestService {

	List<BullionPrice> getCurrentRates();
}
