package com.aeax;

import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list = new HashMap<>();

    public int addStock(StockItem item){
        if(item != null){
            StockItem inStock = list.get(item.getName());
            if(inStock!=null){
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(),item);
            return item.getQuantityStock();
        }
        return 0;
    }
}
