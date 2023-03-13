package com.example.springexercise2.service;

import com.example.springexercise2.model.Item;
import com.example.springexercise2.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService
	{
		@Autowired
		ItemRepo Itemrepo;
		public List<Item> fetchAllItems(){
		return Itemrepo.fetchAllItems();
		}
	}
