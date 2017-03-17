package in.co.mmbf.loanstar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import in.co.mmbf.loanstar.model.BullionPrice;

@Component
public class BullionRatesService {

	@Autowired
	private BullionRatesRestService restService;

	@GetMapping
	public List<BullionPrice> getCurrentRates() {
		return restService.getCurrentRates();
	}
}
