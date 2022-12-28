package mapdemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
 public static void main(String[] args) {
	/*
	 separate hierarchy : collection of objects having key value pair (generic with 2 type safety)
	unordered, non-indexed
key : unique, values may be duplicate
 HashMap  : unordered, one null key allowed, values can be multiple null
 LinkedHashMap:ordered on keys, one null key allowed, values can be multiple null
 TreeMap: sorted in ascending order, no null key allowed, values can be multiple null
 */
	
	 // word dictionary : store word as key, meaning as value
	 Map<String, String> dictionary =new HashMap<String, String>();
	 dictionary.put("sun","planet which gives energy to all other planets");
	 dictionary.put("abc","xyz xyz"); 
	 dictionary.put("abc","pqr pqr");
	 dictionary.put("sunnn","planet which gives energy to all other planets");
	 System.out.println(dictionary);
	 
	 Map<String, String> dictionary1=new LinkedHashMap<String, String>();
	 dictionary1.put("sun","planet which gives energy to all other planets");
	 dictionary1.put("abc","xyz xyz"); 
	 dictionary1.put("abc","pqr pqr");
	 dictionary1.put("sunnn","planet which gives energy to all other planets");
	 System.out.println(dictionary1);
	 
	 Map<String, String> dictionary2=new TreeMap<String, String>();
	 dictionary2.put("sun","planet which gives energy to all other planets");
	 dictionary2.put("abc","xyz xyz"); 
	 dictionary2.put("abc","pqr pqr");
	 dictionary2.put("sunnn","planet which gives energy to all other planets");
	 dictionary2.put("dominant","any meaning to add");
	 System.out.println(dictionary2);
	 
	 String meaning=dictionary2.get("sun");
	 System.out.println(meaning);
	 
	 dictionary2.remove("sunnn");
	 System.out.println(dictionary2);
	 System.out.println(dictionary2.containsKey("sun"));
	 // containsValue
	 String prevmean=dictionary2.replace("dominant", "more powrful than other");
	 System.out.println(prevmean);
	 System.out.println(dictionary2);
	 String prev=dictionary2.replace("moon", "a planet");
	 System.out.println(prev); // key not present so old value returned null
	 System.out.println(dictionary2);
	 Set<String> keys=dictionary2.keySet(); // all keys are unique hence keySet returns a Set
    System.out.println(keys);
    System.out.println(keys.getClass());  // KeySet
    
    Collection<String> values= dictionary2.values();
    System.out.println(values);
    System.out.println(values.getClass());   // Values
    
//  Map is generice with 2 type safety, Iterator is generic with 1 typesafety,
    // Entry : generic with 2 typesafety, Inner interface of Map
    
    Iterator<Entry<String, String>> itr=dictionary2.entrySet().iterator();
    
    while(itr.hasNext()) {
        Entry<String,String>  keyvalue =itr.next();
    	System.out.println(keyvalue.getClass());
    	System.out.println(keyvalue);
    	String word=keyvalue.getKey();
    	 meaning=keyvalue.getValue();
    	System.out.println(word+" -----> "+meaning);
    }
    
    // Employee ID, Salary : Map<Integer,Double>
    // collection does not support primitive co
	/*
	 * Student : sid, sname, std Marks : ph, ch, math, total, perct :  Map<Student,Marks>
	 */

    
    
 }
}