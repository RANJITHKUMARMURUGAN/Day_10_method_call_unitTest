import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Simple_test {

	@Test
	void addition_Test() {
		Simple s=new Simple();
		int result=s.Addition(100, 200);
		assertEquals(300, result);
	}

}
