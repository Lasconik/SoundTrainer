import java.util.ArrayList;


public class Accord {
    //un accord est un jeu simultané de plusieurs notes
	String nom;
	ArrayList<Note> notesG=new ArrayList<Note>();
	ArrayList<Note> notesP=new ArrayList<Note>();

	public Accord(String s){
		nom=s;
		Musique.accords.add(this);
	}

	public void setGuitare(Note a, Note b, Note c, Note d, Note e, Note f){
		notesG.add(f);
		notesG.add(e);
		notesG.add(d);
		notesG.add(c);
		notesG.add(b);
		notesG.add(a);
	}
	public void setGuitare(){

	}
	public void setPiano(Note a, Note b, Note c, Note d, Note e, Note f){

	}
	public void setPiano(Note a, Note b, Note c){
		notesP.add(a);
		notesP.add(b);
		notesP.add(c);
	}

}
