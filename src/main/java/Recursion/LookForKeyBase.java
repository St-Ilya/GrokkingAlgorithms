package Recursion;

import java.util.Stack;

public class LookForKeyBase {
    public static void main(String[] args) {

    }

    public static void lookForKey(Box mainBox) {
        Stack<Box> pile = mainBox.makeAPileToLookThrought();
        while (!pile.isEmpty()) {
            Box box = pile.pop();
            for (Item item : box) {
                if (item.isABox()) {
                    pile.push(item);
                } else if (item.isAKey()) {
                    System.out.println("found the key!");
                }
            }
        }
    }
}

class Box {
    public Stack<Box> makeAPileToLookThrought() {
        return null;
    }
}

class Item extends Box {

    public boolean isABox() {
        return true;
    }


    public boolean isAKey() {
        return true;
    }
}
