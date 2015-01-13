
public class Demo {

	public static void main(String[] args) {
		Music m1= new Music("22",243,"Taylor Swift" );
		Music m2= new Music("Begin Again",243,"Taylor Swift" );
		Music m3= new Music("We Are Never Ever Getting Back Together",252,"Taylor Swift" );
		Music m4= new Music("Safe _ Sound ",200,"Taylor Swift" );
		
		PlayList PL = new PlayList("Taylors record");
		
		PL.addMusic(m1);
		PL.addMusic(m2);
		PL.addMusic(m3);
		PL.addMusic(m4);
		
		System.out.println(PL.toString());
		
		

	}

}
