import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_communicate {

	@Test
	void second_Test() {
		Simple s=new Simple();
		String elements=s.conCat("computer", "system");
		assertEquals("computersystem", elements);
	}

}
