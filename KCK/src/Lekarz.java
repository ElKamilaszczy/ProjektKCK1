
public class Lekarz {
	private static int total_id = 0;
	private int id;
	private String login;
	private String haslo;
	private String imie;
	private String nazwisko;
	private int wiek;
	private int sala;
	private String telefon;
	
	public Lekarz(String login, String haslo, String imie, Strong nazwisko, int wiek, int sala, String telefon)
	{
		this.id = total_id++;
		this.login = login;
		this.haslo = haslo;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.sala = sala;
		this.telefon = telefon;
	}
}
