package in.co.mmbf.loanstar.model;

public enum MetalPurity {


	TWENTY_TWO_KARAT_916("22K", 916),
	TWENTY_THREE_KARAT_995("23K", 995),
	TWENTY_FOUR_KARAT_999("24K", 999);

	private int purity;

	private MetalPurity(String karat, int purity) {
		this.purity = purity;
	}

	public static MetalPurity getEnum(int purity) {
		for (MetalPurity enumeration : values()) {
			if (enumeration.purity == purity) return enumeration;
		}
		return null;
	}
}
