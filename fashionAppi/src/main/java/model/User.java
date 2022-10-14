package model;

public class User {
	
	private String username;
	private String password;
	private String address;
	private String receivePaper;
	private String[] favoriteFrameworks;
	private String gender;
	private String country;
	private String favoriteNumber;
	private String artnr;
	
	public String getArtnr() {
		return artnr;
	}
	public void setArtnr(String artnr) {
		this.artnr = artnr;
	}
	public String getFavoriteNumber() {
		return favoriteNumber;
	}
	public void setFavoriteNumber(String favoriteNumber) {
		this.favoriteNumber = favoriteNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReceivePaper() {
		return receivePaper;
	}
	public void setReceivePaper(String receivePaper) {
		this.receivePaper = receivePaper;
	}
	public String[] getFavoriteFrameworks() {
		return favoriteFrameworks;
	}
	public void setFavoriteFrameworks(String[] favoriteFrameworks) {
		this.favoriteFrameworks = favoriteFrameworks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String createPassword() {
		return favoriteNumber+username + favoriteNumber;
    }
}
