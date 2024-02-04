public class Computer {

	private String computerNumber;
	private String IcdModel;
	private int ramSize;
	private int hddSize;
	private boolean hasGPU;

	public Computer() {
	}

	public Computer(String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGPU) {
		this.computerNumber = computerNumber;
		this.IcdModel = icdModel;
		this.ramSize = ramSize;
		this.hddSize = hddSize;
		this.hasGPU = hasGPU;
	}


	public String getComputerNumber() {
		return computerNumber;
	}

	public void setComputerNumber(String number) {
		this.computerNumber = computerNumber;
	}

	public String getIcdModel() {
		return IcdModel;
	}

	public void setIcdModel(String icdModel) {
		IcdModel = icdModel;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getHddSize() {
		return hddSize;
	}

	public void setHddSize(int hddSize) {
		this.hddSize = hddSize;
	}

	public boolean isHasGPU() {
		return hasGPU;
	}

	public void setHasGPU(boolean hasGPU) {
		this.hasGPU = hasGPU;
	}

	public boolean equals(Computer obj) {
		Computer c = (Computer) obj;
		return this.computerNumber == c.computerNumber;
	}


	public Computer clone() {
		return new Computer(this.computerNumber, this.IcdModel ,this.ramSize, this.hddSize, this.hasGPU);
	}

}
