package pset2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Random;

public class HashCodeTester {
    /*
     * P5: If two object are equal according to the equals(Object)
     * method, then calling the hashCode method on each of
     * the two objects must produce the same integer result
     */

    C c1 = new C(1);
    C c2 = new C(2);

    D d1 = new D(1, 2);
    D d2 = new D(2, 3);

    Random rand = new Random();

    @Test public void CCTrue() {
        setC();
        assertTrue(c1.hashCode() == c2.hashCode());
    }

    @Test public void CCFalse() {
        setC(0);
        assertFalse(c1.hashCode() == c2.hashCode());
    }

    @Test public void DDTrue() {
        setD();
        assertTrue(d1.hashCode() == d2.hashCode());
    }

    @Test public void DDFalse() {
        setD(0);
        assertFalse(d1.hashCode() == d2.hashCode());
    }

    @Test public void DC() {
        setC(0);
        setD(0);
        assertFalse(c1.hashCode() == d2.hashCode());
    }

    @Test public void CD() {
        setC(0);
        setD(0);
        assertFalse(d1.hashCode() == c2.hashCode());
    }

    public Integer get_random() {
        return rand.nextInt();
    }

    public Integer get_random(int not_this_value) {
        int trial = not_this_value;
        while(trial == not_this_value) {trial = rand.nextInt();}
        return trial;
    }

    public Integer get_random(int not_this_value, int not_this_value_either) {
        int trial = not_this_value;
        while(!((trial != not_this_value) && (trial != not_this_value_either))) {
            trial = rand.nextInt();
        }
        return trial;
    }

    public void setC() {setC(2);}
    public void setC(int matching) {
        if (matching == 2) {
            int f = get_random();
            c1 = new C(f);
            c2 = new C(f);
        } else {
            int f = get_random();
            int f_diff = get_random(f);
            c1 = new C(f);
            c2 = new C(f_diff);
        }
    }

    public void setD() {setD(2);}
    public void setD(int matching) {
        if (matching == 2) {
            int f = get_random();
            int g = get_random();
            d1 = new D(f, g);
            d2 = new D(f, g);
        } else {
            int f = get_random();
            int f_diff = get_random(f);
            int g = get_random();
            int g_diff = get_random(g);
            d1 = new D(f, g);
            d2 = new D(f_diff, g_diff);
        }
    }
}
