package sec2_verify09;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	
	Song(){}
	Song(String title, String artist, String album, String[] composer, int year, int track){
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	void show() {
		System.out.println("�뷡 ����:"+this.title);
		System.out.println("����:"+this.artist);
		System.out.println("�ٹ�:"+this.album);
		System.out.print("�۰:");
		for(int i=0; i<this.composer.length;i++) {
			if(i!=this.composer.length-1)
			System.out.print(this.composer[i]+",");
			else System.out.print(this.composer[i]);
		}
		

	}
	
}
