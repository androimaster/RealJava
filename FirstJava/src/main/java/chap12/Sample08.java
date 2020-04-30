package chap12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Sample08 {

    public static void main(String[] args) {
        Location loc = new Location(0,0);
        System.out.println(loc);
        Player.RIGHT.excute(loc, 10);
        Player.UP.excute(loc, 20);
        Player.DOWN.excute(loc, 15);
        Player.LEFT.excute(loc, 2);
    }

}

@Setter
@Getter
@AllArgsConstructor
@ToString
class Location {
    private int X = 0;
    private int Y = 0;
}

@AllArgsConstructor
@Getter
enum Player {
    LEFT{
        @Override
        public void excute(Location loc, int distance) {
            loc.setX(loc.getX() - distance);
            System.out.printf("LEFT  %2d - %s\n", distance, loc.toString());
        }
    },
    RIGHT{
        @Override
        public void excute(Location loc, int distance) {
            loc.setX(loc.getX() + distance);
            System.out.printf("RIGHT %2d - %s\n", distance, loc.toString());
        }
    },
    UP{
        @Override
        public void excute(Location loc, int distance) {
            loc.setY(loc.getY() + distance);
            System.out.printf("UP    %2d - %s\n", distance, loc.toString());
        }
    },
    DOWN{
        @Override
        public void excute(Location loc, int distance) {
            loc.setY(loc.getY() - distance);
            System.out.printf("DOWN  %2d - %s\n", distance, loc.toString());
        }
    };

    public abstract void excute(Location loc, int distance);
}