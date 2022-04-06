//1773. Count Items Matching a Rule

//You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
//
//The ith item is said to match the rule if one of the following is true:
//
//ruleKey == "type" and ruleValue == typei.
//ruleKey == "color" and ruleValue == colori.
//ruleKey == "name" and ruleValue == namei.
//Return the number of items that match the given rule.
//
//
//
//Example 1:
//
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//Output: 1
//Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
//Example 2:
//
//Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
//Output: 2
//Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
//
//
//Constraints:
//
//1 <= items.length <= 104
//1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
//ruleKey is equal to either "type", "color", or "name".
//All strings consist only of lowercase letters.

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        switch(ruleKey){
            case "type":
                for(List<String> x : items)
                        if(x.get(0).equals(ruleValue))
                            count++;

                break;
            case "color":
                for(List<String> c : items)
                    if(c.get(1).equals(ruleValue))
                        count++;

                break;
            case "name":
                for(List<String> n : items)
                    if(n.get(2).equals(ruleValue))
                        count++;

                break;
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> items1 = new ArrayList<>();
        List<String> items2 = new ArrayList<>();
        List<String> items3 = new ArrayList<>();
        items1.add("phone");
        items1.add("blue");
        items1.add("pixel");
        items2.add("computer");
        items2.add("silver");
        items2.add("phone");
        items3.add("phone");
        items3.add("gold");
        items3.add("iphone");
        items.add(items1);
        items.add(items2);
        items.add(items3);
        System.out.println(items);

        CountMatches cm = new CountMatches();
        System.out.println( cm.countMatches(items, "type", "phone"));

    }
}
