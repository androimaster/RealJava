package chap16;

import java.util.function.Supplier;
import lombok.RequiredArgsConstructor;

public class Sample07 {
    public static void main(String[] args) {
        MessageCenter mc = new MessageCenter("Hello~ Lambda!");
        MessageCenter main = getMsg(() -> mc);
        System.out.println(main);
    }

    public static MessageCenter getMsg(Supplier<MessageCenter> mc) {
        return mc.get();
    }
}

@RequiredArgsConstructor
class MessageCenter {
    private final String msg;

    @Override
    public String toString() {
        return msg;
    }
}
