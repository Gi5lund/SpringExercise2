package com.example.springexercise2.repository;

import com.example.springexercise2.model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepo
	{
		public List<Item> fetchAllItems(){
			// this is where the actual SQL communication would be done
			List<Item> items=new ArrayList<>();
			items.add(new Item("Computer",100));
			items.add(new Item("Laptop",150));
			items.add(new Item("Iphone",125));

			return items;
		}
	}
