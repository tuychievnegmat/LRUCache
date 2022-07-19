package com.coderbyte.LRUCache;


import com.coderbyte.LRUCache.model.LRUCache;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LruCacheApplicationTests {


	@Test
	void testABACAB() {
		String[] abacab = {"A", "B", "A", "C","A","B"};
		String text = LRUCache.LRUCache(abacab);
		System.out.println(text + " aba");

		Assert.assertEquals("CAB", text);
	}

	@Test
	void testABCDEDQZC() {
		String[] abacab = {"A", "B", "C", "D", "E", "D","Q", "Z", "C"};
		String text = LRUCache.LRUCache(abacab);

		Assert.assertEquals("EDQZC", text);
	}

	@Test
	void testABCDAEDZ(){
		String[] abcdaedz = {"A", "B", "C", "D", "A", "E", "D", "Z"};
		String text = LRUCache.LRUCache(abcdaedz);
		Assert.assertEquals("CAEDZ", text);
	}

	@Test
	void testEMPTY(){
		String[] empty = {"", "", "", "", "", ""};
		String text = LRUCache.LRUCache(empty);
		Assert.assertEquals("EMPTY", text);
	}

}
