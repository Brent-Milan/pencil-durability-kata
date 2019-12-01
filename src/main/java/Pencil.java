
public class Pencil {

	void write(Paper paper, String message) {
		if(paper.words == null) {
			paper.words = message;
		} else {
			paper.words = paper.words + " " + message;
		}
	}

}
