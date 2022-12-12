package com.company;

public interface ActionsNode {
    ListItem getRoot();
    void addValue(ListItem listItem);
    void removeValue(ListItem listItem);
    void traverse(ListItem listItem);
}
