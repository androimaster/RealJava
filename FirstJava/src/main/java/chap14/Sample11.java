package chap14;

import static java.lang.annotation.ElementType.PACKAGE;

import java.lang.annotation.Target;

public class Sample11 { }

@Target(PACKAGE)
@interface DontUseIt { }
