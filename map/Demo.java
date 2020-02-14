package map;

public class Demo {

    public static void main(String args[]) {
        HashMap hashMap = new HashMap();

        boolean isEmpty = hashMap.isEmpty();
        System.out.println(isEmpty);
        hashMap.put("Asish", "Pati");
        isEmpty = hashMap.isEmpty();
        System.out.println(isEmpty);
        hashMap.put("Asish", "Pati");
        hashMap.put("asish", "Pati");
        hashMap.put("asish1", "Pati1");
        System.out.println(isEmpty);
        System.out.println(hashMap.get("asish1"));
        System.out.println(hashMap.get("asish"));
        hashMap.remove("asish1");
        System.out.println(hashMap.get("asish"));
        hashMap.remove("asish");
        System.out.println(hashMap.get("asish"));
        hashMap.remove("Asish");
        System.out.println(hashMap.get("asish"));
    }
}
