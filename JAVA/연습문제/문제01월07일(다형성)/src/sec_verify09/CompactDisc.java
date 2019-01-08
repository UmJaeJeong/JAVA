package sec_verify09;

public class CompactDisc extends Product{
	
	private String albumTitle;
	private String artist;
	
	public CompactDisc(int productID, String description, String maker, int price, String albumTitle, String artist) {
		super(productID, description, maker, price);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("�ٹ� ����>>"+this.getAlbumTitle());
		System.out.println("����>>"+this.getArtist());
	}
	
}
