import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PencilTest {
	
	Paper paper;
	Pencil underTest;
	
	@Before
	public void setUp() {
		this.underTest = new Pencil();
		this.paper = new Paper();
	}
	

	@Test
	public void shouldReturnExpectedString() {
		underTest.write(paper, "She sells sea shells");
		String expected = "She sells sea shells";
		
		assertEquals(expected, paper.getWords());
	}
	
	@Test
	public void shouldAppendNewStringValueToExistingString() {
		paper.words = "She sells sea shells";
		
		underTest.write(paper, "by the sea shore");
		String expected = "She sells sea shells by the sea shore";
		
		assertEquals(expected, paper.getWords());
	}
	
	@Test
	public void pencilConstructorSetsDurability() {
		Pencil newPencil = new Pencil(100);
		int expected = 100;
		
		assertEquals(expected, newPencil.durability);
	}

}
