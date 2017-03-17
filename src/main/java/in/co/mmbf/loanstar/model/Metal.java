package in.co.mmbf.loanstar.model;

public enum Metal {

	Gold("Gold"),
	Silver("Silver");

	private String metalName;

	private Metal(String metalName) {
		this.metalName = metalName;
	}

	public static Metal getEnum(final String metalName) {
		for (Metal enumeration : values()) {
			if (enumeration.metalName.equalsIgnoreCase(metalName)) return enumeration;
		}
		return null;
	}
}
