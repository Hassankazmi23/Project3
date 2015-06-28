
public class Pitcher extends Baseplayer{
	private String p;

	
	public Pitcher(String a, String ni, String l, String f, String avei, String e){
		super(a, ni, l, f, avei, e);
		p = e;
}
	
	public String getp(){
		return p;
}
	
	public void setp(String e){
		p=e;
}

}
