package direction;

public enum WorldParts {
NAMERICA(Direction.NORTH, 44.22, 55.95), SAMERIKA(Direction.SOUTH, 36.97, 88.14), EURASIA(Direction.WEST, 91.38, 20.11), 
AFRICA(Direction.EAST, 31.74, 24.97), ANTARCTIKA(Direction.SOUTH, 95.01, 48.28), AUSTRALIA(Direction.SOUTH, 78.96, 88.24);
	
	Direction way;
	double width;
	double longit;
	private WorldParts(Direction way, double width, double longit) {
		this.way = way;
		this.width = width;
		this.longit = longit;
	}
	public Direction getWay() {
		return way;
	}
	public void setWay(Direction way) {
		this.way = way;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLongit() {
		return longit;
	}
	public void setLongit(double longit) {
		this.longit = longit;
	}
	
	
}
