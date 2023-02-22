package Day02;

public class ProjectASR extends Framework {

	public static void main(String[] args) {
		browser("Chrome");
		application("https://asr--hotfixdev.lightning.force.com/lightning");
		typeIn("//input[@type='email']", "jinsi.sj@publicissapient.com.ccsf.hotfixdev");
		typeIn("//input[@type='password']", "Welcome@12345");
		clickIn("//input[@type='submit']");
		
		
	}

}
