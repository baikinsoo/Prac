package test0904;

import java.util.ArrayList;
import java.util.stream.Stream;


public class Test05 {

    public static void main(String[] args) {
        ArrayList<Memeber> members = new ArrayList<>();
        members.add(new Memeber("김푸름", 25, "010-1234-1234", "서울"));
        members.add(new Memeber("김하늘", 35, "010-4321-4321", "대전"));
        members.add(new Memeber("오정임", 45, "010-1313-1313", "대구"));

        System.out.println("<<회원 정보>>");
        Stream<Memeber> stream = members.stream();
        stream.forEach(System.out::println);

        System.out.println("<<연락처>>");
        Stream<Contact> contactList = members.stream()
                .map((m) -> new Contact(m.getName(), m.getPhoneNum()));
        contactList.forEach(System.out::println);

        System.out.println("<<연락처 검색>>");
        Stream<Contact> searchList = members.stream()
                .filter((m) -> m.getName().equals("김푸름"))
                .map((m) -> new Contact(m.getName(), m.getPhoneNum()));
        searchList.forEach(System.out::println);
    }
}
