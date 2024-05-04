package com.manoj.projectjdk17.nomiso;

public class Runner {
    public static void main(String[] args) {
        SerializeAndDeserialize obj = new SerializeAndDeserialize();

        Node node = obj.deSerialize("1,2,3,null,null,4,5");
        String serializedData = obj.serialize(node);
        System.out.println(serializedData);
    }
}
