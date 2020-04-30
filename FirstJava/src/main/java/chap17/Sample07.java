package chap17;

import java.util.stream.Stream;

public class Sample07
{

    public static void main(String[] args) {
        String[] arrStr = null;
        Stream<Object> stream = Stream.of((arrStr == null ? Stream.empty() : arrStr));
    }

}
