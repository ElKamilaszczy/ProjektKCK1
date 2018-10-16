import java.util.ArrayList;
import java.util.List;
//siemka
public class Centrala {
	private List<Lekarz> lekarze = new ArrayList<Lekarz>();
	private List<Pacjent> pacjenci = new ArrayList<Pacjent>();
	private List<Recepta> recepty = new ArrayList<Recepta>();
	private List<Skierowanie> skierowania = new ArrayList<Skierowanie>();
	private List<Wizyta> wizyty = new ArrayList<Wizyta>();
	public List<Lekarz> getLekarze() {
		return lekarze;
	}
	public String Logowanie(String login, String haslo)
	{
		if(login == "admin" && haslo == "admin")
			return login;
		for (Lekarz a : lekarze)
		{
			if(a.getLogin() == login && a.getHaslo() == haslo)
				return login;
		}
		return "";
	}
	public List<Pacjent> getPacjenci() {
		return pacjenci;
	}
	public List<Recepta> getRecepty() {
		return recepty;
	}
	public List<Skierowanie> getSkierowania() {
		return skierowania;
	}
	public List<Wizyta> getWizyty() {
		return wizyty;
	}
	
}
