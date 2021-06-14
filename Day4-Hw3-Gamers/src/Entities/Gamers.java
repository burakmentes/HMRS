package Entities;

import java.util.List;

import Abstracts.Entity;

/*1. Oyuncularýn sisteme kayýt olabileceði, bilgilerini güncelleyebileceði, kayýtlarýný silebileceði bir ortamý simule ediniz. 
 * Müþteri bilgilerinin doðruluðunu e-devlet sistemlerini kullanarak doðrulama yapmak istiyoruz. 
(E-devlet sistemlerinde doðrulama TcNo, Ad, Soyad, DoðumYýlý bilgileriyle yapýlýr. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

2.Oyun satýþý yapýlabilecek satýþ ortamýný simule ediniz.( Yapýlan satýþlar oyuncu ile iliþkilendirilmelidir. Oyuncunun parametre olarak metotta olmasýný kastediyorum.)

3.Sisteme yeni kampanya giriþi, kampanyanýn silinmesi ve güncellenmesi imkanlarýný simule ediniz.
(Kampanya Manager satýn almada  parametre olarak gönderilsin)

4. Satýþlarda kampanya entegrasyonunu simule ediniz.*/

public class Gamers implements Entity{
	private String Email;
	private String Pw;
	private String TcNo;
	private String Name;
	private int DateOfBirth;
	private double WalletBalance;
	
	public Gamers(String email, String pw, String tcNo, String name, int dateOfBirth, double walletBalance) {
		super();
		Email = email;
		Pw = pw;
		TcNo = tcNo;
		Name = name;
		DateOfBirth = dateOfBirth;
		WalletBalance = walletBalance;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPw() {
		return Pw;
	}
	public void setPw(String pw) {
		Pw = pw;
	}
	public String getTcNo() {
		return TcNo;
	}
	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public double getWalletBalance() {
		return WalletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		WalletBalance = walletBalance;
	}

	

}
