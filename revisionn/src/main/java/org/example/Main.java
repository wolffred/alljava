package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//        Map<String, Integer> studentID = new HashMap<>();

//        studentID.put("Bob", 1);
//        studentID.put("Bob", 2);
//        studentID.put("Bib", 3);
//
//        System.out.println(studentID);
//
//        Map<String, Map<String, Integer>> classRooms = new HashMap<>();
//
//        classRooms.put("Class 1", studentID);
//        studentID.put("Bab", 4);
//
//        System.out.println(classRooms);

//        List<String> friends = new ArrayList<>();
//        List<String> newFriends = new ArrayList<>();
//
//        Map<String, List> people = new HashMap<>();
//
//        friends.add("Tom");
//        newFriends.add("Tom");
//        friends.add("Tim");
//        newFriends.add("Tim");
//
//        people.put("Thomas", friends);
//        people.put("Matthew", newFriends);

        // put if absent0.
//        friends.add("Tam");
//
//        List<String > fri = people.get("Thomas");

//        System.out.println(fri);
//
//        System.out.println(people);

//        for (Map.Entry entry:people.entrySet()) {
//            System.out.println(entry);
//            System.out.println(entry.toString());
//            System.out.println(entry.getValue());
//            System.out.println(entry.getKey());
//        }

//        for (String key:people.keySet()) {
//            System.out.println(Map.Entry.comparingByKey());
//        }

//        boolean go = people.containsValue(("Matthew"));
//        if (people.containsKey("Matthew")){
//
//        }

        //System.out.println(people.get("Matthew"));

//        Map<String, Map<String, Integer>> companyDust = new HashMap<>();
//
//        Map<String, Integer> sonnidustbins = new HashMap<>();
//        sonnidustbins.put("Upstairs", 5);
//        sonnidustbins.put("Downstairs", 8);
//
//        Map<String, Integer> advdustbins = new HashMap<>();
//        advdustbins.put("Upstairs", 5);
//        advdustbins.put("Downstairs", 8);
//
//        companyDust.put("Son", sonnidustbins);
//        companyDust.put("Advantage",advdustbins);
//
//        System.out.println(companyDust.get("Son").entrySet());
//        System.out.println(companyDust.get("Son").values());


        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("Walter");
        names.add("Saul");

//        names.remove("Walter");

//        System.out.println(names);
//        System.out.println(names.size());
//        System.out.println(names.contains("Walter"));
//        System.out.println(names.isEmpty());

        names.add("Tom");
        names.forEach(System.out :: println);

        for (String name: names) {
            System.out.println(name);
        }

        Iterator <String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }


        List<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(1);

        System.out.println(numberList);


        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);

        Set<Integer> numberSett = new HashSet<>(numberList);
        System.out.println(numberSett);


        Set<String> kl = new Set<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        //Treeset = ordered
        //LindedHashSet = order you put them in


        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();

        linkedList.add("Bab");
        linkedList.add("Beb");
        linkedList.add("Bib");
        linkedList.add("Bob");
        linkedList.add("Bub");
        // for adding and removing


        arrayList.add("Bab");
        arrayList.add("Beb");
        arrayList.add("Bib");
        arrayList.add("Bob");
        arrayList.add("Bub");
        //for retrieving info

        System.out.println(arrayList.get(4));
        arrayList.add(1, "Bob");


    }
}