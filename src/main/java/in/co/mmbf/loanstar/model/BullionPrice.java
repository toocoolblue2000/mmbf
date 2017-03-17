package in.co.mmbf.loanstar.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BullionPrice implements Serializable {

	/** Serial Version UID*/
	private static final long serialVersionUID = 2078470621596174032L;

	private Metal metal;

	private MetalPurity purity;

	private BigDecimal price;

	private Date lastUpdated;

	public BullionPrice() {
		lastUpdated = new Date();
	}

	public Metal getMetal() {
		return metal;
	}

	public void setMetal(Metal metal) {
		this.metal = metal;
	}

	public MetalPurity getPurity() {
		return purity;
	}

	public void setPurity(MetalPurity purity) {
		this.purity = purity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public String getLastUpdatedSince() {
		long diffInMillies = System.currentTimeMillis() - lastUpdated.getTime();
		return String.format("%d min, %d sec",
			    TimeUnit.MILLISECONDS.toMinutes(diffInMillies),
			    TimeUnit.MILLISECONDS.toSeconds(diffInMillies) -
			    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(diffInMillies))
			);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
