import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;
import static org.junit.Assert.*;

public class StreamTest {
    @Test
    public void streamtest(){
//        List<String> list = Arrays.asList("a","abc","ab");
//        System.out.println(list.stream().filter(li->!li.equals("ab")).collect(Collectors.toList()));
//
//        System.out.println(Stream.of(2,5,1,4,8).filter(i->i%2==0).sorted().collect(Collectors.toList()));
//
//        System.out.println(Stream.of(9,1,3,6,4).max(Comparator.comparing(i->i)).get());
//
//        System.out.println(Stream.of(2,7,3,5,2,1).map(i->i*2).collect(Collectors.toList()));
//
        System.out.println(Stream.of(3,2,6,83,43,23,75,34,26,75).collect(maxBy(comparing(i->i))));//reduce((i,j)->i+j).get());

        System.out.println(Stream.of(3,2,6,83,43,23,75,34,26,75).mapToInt(i->i).summaryStatistics().getSum());

        List<String> list = Arrays.asList("1","23","45");
        System.out.println(list.stream().mapToInt(i->Integer.parseInt(i)).summaryStatistics().getMax());

//
//        Map<String,String> users = new HashMap<>();
//        Map<String,String> dbs= new HashMap<>();
//        users.put("123","i want to work");
//        String key = "123";
//        dbs.put(key,"i want to go home");
//        //users.computeIfAbsent("123",dbs::get);
//        users.computeIfPresent(key,(k,v)->dbs.get(key));
//        System.out.println(users.size());
//        users.entrySet().forEach(k->{
//            System.out.println(k.getKey()+" "+k.getValue());
//        });

    }

    @Test
    public void testOrder(){

        List<Integer> list = Arrays.asList(4,3,2,1);
        HashSet<Integer> hashSet = new HashSet<>(list);
        assertEquals(list.stream().collect(toList()),list);
        assertEquals(hashSet.stream().collect(toList()), list);
    }

    @Test
    public void testGroup(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        assertEquals(Arrays.asList(1,3,5,7,9),funA(list).get(false));
        List<Book> books = Arrays.asList(new Book("mysql从删库到跑路","小李","隔壁老王"),
                new Book("c++从入门到入土","小张","隔壁老王"),
                new Book("21天放弃java","小明","路人甲"),
                new Book("突破天际的发际线","小张","路人甲"));
        assertEquals(Arrays.asList(new Book("mysql从删库到跑路","小李","隔壁老王"),
                new Book("c++从入门到入土","小张","隔壁老王")),
                funB(books).get("路人甲"));
    }

    /**
     *  根据boolean分组
     * @param list
     * @return
     */
    public Map<Boolean,List<Integer>> funA(List<Integer> list){
        return list.stream().collect(partitioningBy(i->i%2==0));
    }

    public Map<String,List<Book>> funB(List<Book> books){
        return books.stream().collect(groupingBy((Book::getBookAuthor)));
    }

}
@Data
@AllArgsConstructor
class Book{
    String bookName;
    String bookOwner;
    String bookAuthor;
}