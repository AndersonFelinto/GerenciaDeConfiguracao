package br.unipe.pos.Test;

import br.unipe.pos.model.Valores;
import junit.framework.TestCase;

public class ValoresTest extends TestCase{
	
	private Valores valores;
	
	/**
	 * Algum comentário
	 */
	protected void setUp() throws Exception {
		super.setUp();
		valores = new Valores();
		
		valores.ins(3);
		valores.ins(2);
		valores.ins(1);
		valores.ins(4);

	}
	
	/**
	 * Outro comentários
	 */
	public void testValores() {
		assertEquals(false, valores.ins(0));
		assertEquals(false, valores.ins(-80));
		assertEquals(true, valores.ins(10));
			
		assertEquals(5, valores.size());
		
		assertEquals(-1, valores.del(100)); // nao está no vetor
		
		assertEquals(10, valores.del(4));		
		
		assertEquals(1, valores.lower());
	
		
		
		assertEquals(4, valores.greater());
		assertEquals(2.5, valores.mean());
		
		
		valores.del(0);
		valores.del(1);
		valores.del(2);
		valores.del(3);
		
		assertEquals(-1, valores.del(100)); // lista sem valor
		
		assertEquals(-1, valores.lower());
		assertEquals(-1, valores.greater());
		assertEquals(-1d, valores.mean());
		
	}
}
