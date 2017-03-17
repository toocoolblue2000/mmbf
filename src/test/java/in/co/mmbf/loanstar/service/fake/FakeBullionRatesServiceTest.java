package in.co.mmbf.loanstar.service.fake;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import in.co.mmbf.loanstar.model.BullionPrice;
import in.co.mmbf.loanstar.service.fake.FakeBullionRatesService;

public class FakeBullionRatesServiceTest {

	private FakeBullionRatesService service = new FakeBullionRatesService();

	@Test
	public void test() throws IOException {
		List<BullionPrice> currentRates = service.getCurrentRates();
		assertThat(currentRates, notNullValue());
		System.out.println(currentRates);
	}

}
