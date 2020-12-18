package com.main.percobaan4;

public class Outer {

    static String test;
    String str = "outer class field";

    Outer(){
        new Inner();
    }

    class Inner {

        static final String str = "constant is ok";

        Inner(){
            System.out.println(Outer.this.str);
            test = "inherits static member";
            System.out.println(test);
        }
    }

    public class PublicInner{}
    protected class ProtectedInner{}
    private class PrivateInner{}
    abstract class AbstractInner{}
    final class FinalInner{}
    static class StaticInner{}

}
