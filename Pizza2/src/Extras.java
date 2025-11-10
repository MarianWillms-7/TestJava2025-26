import java.util.ArrayList;

public class Extras
{
	private String extras;
	private double preis;

	public Extras(String extras, double preis)
	{
		super();
		this.extras = extras;
		this.preis = preis;
	}

	public String getExtras()
	{
		return extras;
	}

	public void setExtras(String extras)
	{
		this.extras = extras;
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
		return  extras;
	}
}
