package com.develogical;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestRecentItemsList{
	@Test
	public void ShouldBeEmptyAtInitialization(){
		RecentItemsList L = new RecentItemsList();
		assertEquals(0,L.get_size());
	}
	@Test
	public void ShouldBeAbleToAddToList(){
		RecentItemsList L = new RecentItemsList();
		L.add("a");
		assertEquals(1, L.get_size());
	}

	@Test
	public void ShouldRetrieveItemFromList(){
		RecentItemsList L = new RecentItemsList();
		String expectedListItem = "a";
		L.add(expectedListItem);
		String listItem = L.getMostRecent();
		assertNotNull(listItem);
		assertEquals(expectedListItem, listItem);
	}

	@Test
	public void TheMostRecentItemIsFirst(){
		RecentItemsList L = new RecentItemsList();
		String expectedListItem = "a";
		L.add(expectedListItem);
		L.add("b");
		L.add(expectedListItem);

		assertEquals(expectedListItem,L.getMostRecent());
	}

	@Test
	public void ItemsInListShouldBeUnique(){
		RecentItemsList L = new RecentItemsList();
		String expectedListItem = "a";
		L.add(expectedListItem);
		L.add(expectedListItem);
		assertEquals(1, L.get_size());
	}

}
