package classTest;

public class Fun {



    public Fun() {
        System.out.println("classTest.Fun constructor");//looks like constructor executed always
        //when instance of class is created
    }
    public void fun() {
        System.out.println("classTest.Fun method");
    }
    public static void main(String[] args) {
        Fun fu = new Fun();
        fu.fun();
        Fen fe = new Fen();
        fe.fen();
        Fin fi = new Fin();
        fi.fin();
        Fon fo = new Fon();
        fo.fon();
        Fan fa = new Fan();
        fa.fan();
        fa.run();
    }
}

class Fen {

    Fen() {
        System.out.println("fen construuctor");

    }
    void fen() {
        System.out.println("classTest.Fen method");
    }
}

class Fin {
    void fin() {
        System.out.println("classTest.Fin method");
    }
}

class Fon {
    void fon() {
        System.out.println("classTest.Fon method");
    }
}

