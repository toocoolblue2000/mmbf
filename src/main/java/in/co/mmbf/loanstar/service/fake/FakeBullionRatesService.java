package in.co.mmbf.loanstar.service.fake;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import in.co.mmbf.loanstar.model.BullionPrice;
import in.co.mmbf.loanstar.model.Metal;
import in.co.mmbf.loanstar.model.MetalPurity;
import in.co.mmbf.loanstar.service.BullionRatesRestService;

@Service
@Profile("fake")
public class FakeBullionRatesService implements BullionRatesRestService{

	private List<BullionPrice> lastFetchedData;

	@Override
	public List<BullionPrice> getCurrentRates() {
		if (lastFetchedData == null) {
			try {
				fetchOverNetwork();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return lastFetchedData;
	}

	@Scheduled(fixedDelay=5000)
	public void fetchOverNetwork() throws IOException {
		Elements select = Jsoup.connect("http://ibjarates.com/").timeout(15000).get()
			.select("#goldrate > div > div.row > div.col-md-4 > div.table-responsive "
					+ " > table.table.table-bordered > tbody > tr");

		List<BullionPrice> bullionPrices = new ArrayList<>();
		for(Element element : select) {
			String[] extract = element.text().split(" ");
			if(extract.length > 2) {
				BullionPrice bullionPrice = new BullionPrice();
				bullionPrice.setMetal(Metal.getEnum(extract[0]));
				bullionPrice.setPurity(MetalPurity.getEnum(Integer.parseInt(extract[1])));
				if (extract.length > 3) {
					bullionPrice.setPrice(new BigDecimal(extract[3]));
				} else {
					bullionPrice.setPrice(new BigDecimal(extract[2]));
				}
				bullionPrices.add(bullionPrice);
			}
		}
		this.lastFetchedData = bullionPrices;
	}
}
