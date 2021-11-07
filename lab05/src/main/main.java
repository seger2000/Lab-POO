package main;

class A {
    protected String a;
    protected X x = new X("mere");

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }
}

class B extends A{
    protected String b;

    public B(String a, String b, X x) {
        super(a, x);
        this.b = b;
    }
}

class C extends B {
    protected String c;

    public C(String a, String b, String c, X x) {
        super(a, b, x);
        this.c = c;
    }
}

class D extends C {
    protected String d;

    public D(String a, String b, String c, String d, X x) {
        super(a, b, c, x);
        this.d = d;
    }
}

class E extends D {
    protected String e;

    public E(String a, String b, String c, String d, String e, X x) {
        super(a, b, c, d, x);
        this.e = e;
    }
}

class F extends E {
    protected String f;

    public F(String a, String b, String c, String d, String e, String f, X x) {
        super(a, b, c, d, e, x);
        this.f = f;
    }
}

class G extends F {
    protected String g;

    public G(String a, String b, String c, String d, String e, String f, String g, X x) {
        super(a, b, c, d, e, f, x);
        this.g = g;
    }
}

class H extends G {
    protected String h;
    //private X x = new X("ana are mere in class H");

    public H(String a, String b, String c, String d, String e, String f, String g, String h, X x) {
        super(a, b, c, d, e, f, g, x);
        this.h = h;
    }
}

class I extends H {
    protected String i;

    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i, X x) {
        super(a, b, c, d, e, f, g, h, x);
        this.i = i;
    }
}

class J extends I {
    protected String j;

    public J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, X x) {
        super(a, b, c, d, e, f, g, h, i, x);
        this.j = j;
    }

    public String display() {
        return a + b + c + d + e + f + g + h + i + j + "\n" + x.str_x();
    }
}

class X {
    private String x;
    public X(String x) {
        this.x = x;
    }

    public String str_x() {
        return x;
    }

}

public class main {

    public static void main(String[] args) {
        J obj = new J("a", "b", "c","d", "e", "f", "g", "h", "i", "j", new X("pere"));
        System.out.println(obj.display());

    }
}
