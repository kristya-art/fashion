package model;

public class PDFFile {
	
	String filename;
	byte[] content;
	public PDFFile(String filename, byte[]content) {
		super();
		this.filename = filename;
		this.content = content;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
}
