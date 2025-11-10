import java.util.ArrayList;

public class Groesse
{
	private String groesse;
	private double preis;

	public Groesse(String groesse, double preis)
	{
		super();
		this.groesse = groesse;
		this.preis = preis;
	}

	public String getGroesse()
	{
		return groesse;
	}

	public void setGroesse(String groesse)
	{
		this.groesse = groesse;
	}

	public double getPreis()
	{
		return preis;
	}

	public void setPreis(double preis)
	{
		this.preis = preis;
	}

	@Override
	public String toString()
	{
		return groesse;
	}
}
