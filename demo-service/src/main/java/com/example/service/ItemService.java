package com.example.service;

import com.example.model.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemService {

    private static final Map<Integer, Item> ITEMS = new HashMap<>();

    static {
        ITEMS.put(1, new Item(1, "Первая запись"));
        ITEMS.put(2, new Item(2, "Вторая запись"));
        ITEMS.put(3, new Item(3, "Третья запись"));
        ITEMS.put(4, new Item(4, "Четвертая запись"));
        ITEMS.put(5, new Item(5, "Пятая запись"));
    }

    public Item getItemById(int id) {
        return ITEMS.get(id);
    }
}
