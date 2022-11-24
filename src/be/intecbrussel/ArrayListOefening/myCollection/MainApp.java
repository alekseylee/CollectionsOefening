package be.intecbrussel.ArrayListOefening.myCollection;

public class MainApp {
    public static void main(String[] args) {
        String[] collection = {"Alexey","Zakaria","Ramona"};
        MyCollection myCollection = new MyCollection(collection);
        MyCollection myCollection1 = new MyCollection(new String[]{"Alexey","Zakaria","Ramona"});
        System.out.println(myCollection1.get(1));

        myCollection.add("Jussi");
        System.out.println(myCollection.size());

        myCollection1.remove(0);
        for (int i=0; i< myCollection1.size(); i++) {
            System.out.println(myCollection1.get(i));
        }


//        ArrayList<String> list = new ArrayList<>();
//        list.add("first");
//        list.add("second");
//
//
//        ArrayList<String> list2 = new ArrayList<>(){
//            {
//                add("first");
//                add("second");
//            }
//        };
//
//        System.out.println(list.get(0));
//
//        System.out.println(list.size());
//        list.remove(0);
//        System.out.println(list.size());
    }
}
