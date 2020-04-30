package chap17;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Sample09 {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();;
        IntStream.rangeClosed(1,100)
                 .forEach(i -> {
                          boardList.add(
                              new Board(i, "title_" + i, "user" + i, LocalDateTime.now())
                          );
                      }
                  );
        boardList.stream().forEach(System.out::println);
    }
}

@Data
@AllArgsConstructor
class Board {
    int no;
    String title;
    String user;
    LocalDateTime createdate;
}