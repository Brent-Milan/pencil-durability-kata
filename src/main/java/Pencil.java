
public class Pencil {
	
	int durability;
	
	
	//Constructors
	public Pencil() {
		
	}
	
	public Pencil(int durability){
		this.durability = durability;
	}

	//Methods
	void write(Paper paper, String message) {
		if(paper.words == null) {
			paper.words = message;
		} else {
			paper.words = paper.words + " " + message;
		}
	}

}
