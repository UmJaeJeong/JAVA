package sec_verify04;

public abstract class Printer {
	static int USB;
	static int PARALLEL;
	private String modelName;
	private String manufacturer;
	private int type;				//USB �Ǵ� ���� ����Ʈ
	protected int numberOfPrinted;	//�μ��� ���� �ż�
	protected int numberOfPaper;	//���� ���� �ż�
	
	public Printer(String modelName, String manufacturer, int type, int numberOfPaper) {
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.type = type;
		this.numberOfPaper = numberOfPaper;
	}
	
	public String getModelName() {
		return modelName;
	}


	public String getManufacturer() {
		return manufacturer;
	}

	
	public int getType() {
		return type;
	}


	public void setNumberOfPrinted(int numberOfPrinted) {
		this.numberOfPrinted = numberOfPrinted;
	}

	public int getNumberOfPaper() {
		return numberOfPaper;
	}

	public void setNumberOfPaper(int numberOfPaper) {
		this.numberOfPaper = numberOfPaper;
	}
	
	public abstract boolean print();

	
}
