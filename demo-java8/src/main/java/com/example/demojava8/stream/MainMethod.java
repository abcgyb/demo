package com.example.demojava8.stream;

import com.example.demojava8.stream.dto.Artist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: MainMethod
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-10-09 15:16
 * @Version 1.0
 **/
public class MainMethod {
    public static void main(String[] args) {
        List<Artist> artists = createArtistsList();

        //流的几种生成方式
        //基本生成
        Stream stream = Stream.of("a", "b", "c");
        //数组生成
        String[] strArray = new String[]{"a", "b", "c"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        //集合生成
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();

        //如果有一个函数可以将一种类型的值转换成另外一种类型，map 操作就可以使用该函数
        //转换大小写
        System.out.println("转换大小写结果为：");
        artists.stream().map(artist -> artist.getName().toUpperCase()).forEach(s -> System.out.println(s));
        //转换平方数
        System.out.println("转换平方数结果为：");
        artists.stream().map(artist -> artist.getAge() * artist.getAge()).forEach(s -> System.out.println(s));

        //过滤器
        //来自伦敦的艺术家
        System.out.println("来自伦敦的艺术家为：");
        artists.stream().filter(artist -> artist.getFrom().equals("London")).forEach(artist -> System.out.println(artist.getName()));
        //年龄小于50的艺术家
        System.out.println("年龄小于50的艺术家为：");
        artists.stream().filter(artist -> artist.getAge() < 50).forEach(artist -> System.out.println(artist.getName()));

        //流的连接操作
        System.out.println("流的连接结果为：");
        Stream<Integer> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        ).flatMap((childList) -> childList.stream());
        inputStream.forEach(integer -> System.out.println(integer));

        //组合取值，取的年龄小于50岁的艺术家来自的城市
        System.out.println("年龄小于50岁的艺术家来自的城市为：");
        artists.stream().filter(artist -> artist.getAge() < 50).map(artist -> artist.getFrom()).forEach(s -> System.out.println(s));

        //查看中间操作结果
        System.out.println("年龄小于50岁的艺术家来自的城市中间操作过程为：");
        artists.stream().filter(artist -> artist.getAge() < 50)
                .peek(e -> System.out.println("Filtered value: " + e.getName()))
                .map(artist -> artist.getFrom())
                .peek(e -> System.out.println("Mapped value: " + e))
                .forEach(s -> System.out.println(s));

        //最大值最小值操作
        System.out.println("年龄最大的艺术家是：" +
                artists.stream().max(Comparator.comparing(artist -> artist.getAge())).get().getName());
        System.out.println("年龄最小的艺术家是：" +
                artists.stream().min(Comparator.comparing(artist -> artist.getAge())).get().getName());

        //reduce模式(重写求最大值)
        System.out.println("年龄最大的艺术家是：" +
                artists.stream().reduce((artist, artist2) -> (artist.getAge() > artist2.getAge()) ? artist : artist2).get().getName());
        //reduce模式求和
        System.out.println("所有人的年龄之和为：" +
                artists.stream().map(Artist::getAge).reduce((integer, integer2) -> integer + integer2).get());

        //limit与skip

        //整合操作
        artists.stream().filter(artist -> artist.getName().startsWith("R")).map(artist -> artist.getFrom()).collect(Collectors.toList()).forEach(s -> System.out.println(s));

        //高阶引用部分
        //元素排序
        List<Integer> numbers = Arrays.asList(4, 2, 3, 1);
        System.out.println("排序后的集合对象是(升序)：");
        numbers.stream().sorted().forEach(integer -> System.out.println(integer));
        System.out.println("排序后的集合对象是(降序)：");
        numbers.stream().sorted((o1, o2) -> o1 > o2 ? o1 : o2).forEach(integer -> System.out.println(integer));
        //对象排序
        System.out.println("各位艺术家按照年龄排序：");
        artists.stream().sorted(Comparator.comparing(Artist::getAge)).map(Artist::getName).forEach(s -> System.out.println(s));
        artists.stream().sorted(Comparator.comparing(Artist::getAge).reversed()).map(Artist::getName).forEach(s -> System.out.println(s));
        //多属性排序
        System.out.println("各位艺术家按照年龄升序，身高降序：");
        artists.stream().sorted(Comparator.comparing(Artist::getAge).thenComparing(Comparator.comparing(Artist::getHeigth).reversed())).map(Artist::getName).forEach(s -> System.out.println(s));

        //去重方法
        System.out.println("distinct方法测试");
        Integer[] nums = {2, 2, 3, 1, 1, 4, 5, 5, 6};
        //数组转换为列表
        List<Integer> numList = Arrays.asList(nums);
        //去重顺序输出
        numList.stream().distinct().sorted().forEach(System.out::println);

    }


    /**
     * @return java.util.List<com.example.demojava8.stream.animal.Artist>
     * @Author GaoYueBin
     * @Description 初始化数组对象
     * @Date 2019/10/9 15:28
     * @Param []
     **/
    private static List<Artist> createArtistsList() {
        //初始化数组对象
        List<Artist> artists = Arrays.asList(new Artist("London", "John Lennon", 20, 160),
                new Artist("Paris", "Paul McCartney", 30, 170),
                new Artist("London", "George Harrison", 40, 190),
                new Artist("Paris", "Ringo Starr", 50, 180)
        );
        return artists;
    }
}
