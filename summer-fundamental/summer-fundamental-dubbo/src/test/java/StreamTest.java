import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.println(Stream.of(3,2,6,83,43,23,75,34,26,75).reduce((i,j)->i+j).get());

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
        Assert.assertEquals(list.stream().collect(Collectors.toList()),list);
        Assert.assertEquals(hashSet.stream().collect(Collectors.toList()), list);
    }

}