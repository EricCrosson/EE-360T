/* Written by Eric Crosson */
/* 2016-03-10 */

package pset2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Random;

public class EqualsTester {

    C c1 = new C(1);
    C c2 = new C(2);
    C c3 = new C(2);
    D d1 = new D(1, 2);
    D d2 = new D(2, 3);
    D d3 = new D(3, 4);
    Object oc1 = new C(1);
    Object oc2 = new C(2);
    Object od1 = new D(1, 2);
    Object od2 = new D(2, 3);
    Object o = new Object();
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = new Object();

    Random rand = new Random();

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

    @Test public void test0MatchingC() {
        setC(0);
        boolean a = c1.equals(c2);
        boolean b = c2.equals(c3);
        boolean c = c1.equals(c3);
        assertFalse(a && b && c);
    }

    @Test public void test2MatchingC() {
        setC(2);
        boolean a = c1.equals(c2);
        boolean b = c2.equals(c3);
        boolean c = c1.equals(c3);
        assertFalse(a && b && c);
    }

    @Test public void test3MatchingC() {
        setC(3);
        boolean a = c1.equals(c2);
        boolean b = c2.equals(c3);
        boolean c = c1.equals(c3);
        assertTrue(a && b && c);
    }

    @Test public void test0MatchingD() {
        setD(0);
        boolean a = d1.equals(d2);
        boolean b = d2.equals(d3);
        boolean c = d1.equals(d3);
        assertFalse(a && b && c);
    }

    @Test public void test2MatchingD() {
        setD(2);
        boolean a = d1.equals(d2);
        boolean b = d2.equals(d3);
        boolean c = d1.equals(d3);
        assertFalse(a && b && c);
    }

    @Test public void test3MatchingD() {
        setD(3);
        boolean a = d1.equals(d2);
        boolean b = d2.equals(d3);
        boolean c = d1.equals(d3);
        assertTrue(a && b && c);
    }

    @Test public void test0MatchingO() {
        setO(0);
        boolean a = o1.equals(o2);
        boolean b = o2.equals(o3);
        boolean c = o1.equals(o3);
        assertFalse(a && b && c);
    }

    @Test public void test2MatchingO() {
        setO(2);
        boolean a = o1.equals(o2);
        boolean b = o2.equals(o3);
        boolean c = o1.equals(o3);
        assertFalse(a && b && c);
    }

    @Test public void test3MatchingO() {
        setO(3);
        boolean a = o1.equals(o2);
        boolean b = o2.equals(o3);
        boolean c = o1.equals(o3);
        assertTrue(a && b && c);
    }


    public void setC() {setC(3);}
    public void setC(int matching) {
        if (matching == 3) {
            int f = get_random();
            c1 = new C(f);
            c2 = new C(f);
            c3 = new C(f);
        } else if (matching == 2) {
            int f = get_random();
            int f_different = get_random(f);
            c1 = new C(f);
            c2 = new C(f_different);
            c3 = new C(f_different);
        } else {
            int f = get_random();
            int f_diff = get_random(f);
            int f_different = get_random(f, f_diff);
            c1 = new C(f);
            c2 = new C(f_diff);
            c3 = new C(f_different);
        }
    }

    public void setD() {setD(3);}
    public void setD(int matching) {
        if (matching == 3) {
            int f = get_random();
            int g = get_random();
            d1 = new D(f, g);
            d2 = new D(f, g);
            d3 = new D(f, g);
        } else if (matching == 2) {
            int f = get_random();
            int f_different = get_random(f);
            int g = get_random();
            int g_different = get_random(g);
            d1 = new D(f, g);
            d2 = new D(f_different, g_different);
            d3 = new D(f_different, g_different);
        } else {
            int f = get_random();
            int f_diff = get_random(f);
            int f_different = get_random(f, f_diff);
            int g = get_random();
            int g_diff = get_random(g);
            int g_different = get_random(g, g_diff);
            d1 = new D(f, g);
            d2 = new D(f_diff, g_diff);
            d3 = new D(f_different, g_different);
        }
    }

    public void setO() {setO(3);}
    public void setO(int matching) {
        if (matching == 3) {
            o1 = new Object();
            o2 = o1;
            o3 = o1;
        } else if (matching == 2) {
            o1 = new Object();
            o2 = o1;
            o3 = new Object();
        } else {
            o1 = new Object();
            o2 = new Object();
            o3 = new Object();
        }
    }

    @Test public void testNullNeverEquals() {

        assertFalse(new Object().equals(null));
    }


    @Test public void TestisCCDTransitive() {
        assertFalse(isCCDTransitive(c1, c2, d1));
    }

    @Test public void TestisCCObjectTransitive() {
        assertFalse(isCCObjectTransitive(c1, c2, o));
    }

    @Test public void TestisCDCTransitive() {
        assertFalse(isCDCTransitive(c1, d1, c2));
    }

    @Test public void TestisCDDTransitive() {
        assertFalse(isCDDTransitive(c1, d1, d2));
    }

    @Test public void TestisCDObjectTransitive() {
        assertFalse(isCDObjectTransitive(c1, d1, o));
    }

    @Test public void TestisCObjectCTransitive() {
        assertFalse(isCObjectCTransitive(c1, o, c2));
    }

    @Test public void TestisCObjectDTransitive() {
        assertFalse(isCObjectDTransitive(c1, o, d1));
    }

    @Test public void TestisCObjectObjectTransitive() {
        assertFalse(isCObjectObjectTransitive(c1, o1, o2));
    }

    @Test public void TestisDCCTransitive() {
        assertFalse(isDCCTransitive(d1, c1, c2));
    }

    @Test public void TestisDCDTransitive() {
        assertFalse(isDCDTransitive(d1, c1, d2));
    }

    @Test public void TestisDCObjectTransitive() {
        assertFalse(isDCObjectTransitive(d1, c1, o));
    }

    @Test public void TestisDDCTransitive() {
        assertFalse(isDDCTransitive(d1, d2, c1));
    }

    @Test public void TestisDDObjectTransitive() {
        assertFalse(isDDObjectTransitive(d1, d2, o));
    }

    @Test public void TestisDObjectCTransitive() {
        assertFalse(isDObjectCTransitive(d1, o, c1));
    }

    @Test public void TestisDObjectDTransitive() {
        assertFalse(isDObjectDTransitive(d1, o, d1));
    }

    @Test public void TestisDObjectObjectTransitive() {
        assertFalse(isDObjectObjectTransitive(d1, o1, o2));
    }

    @Test public void TestisObjectCCTransitive() {
        assertFalse(isObjectCCTransitive(o, c1, c2));
    }

    @Test public void TestisObjectCDTransitive() {
        assertFalse(isObjectCDTransitive(o1, c1, d1));
    }

    @Test public void TestisObjectCObjectTransitive() {
        assertFalse(isObjectCObjectTransitive(o1, c1, o2));
    }

    @Test public void TestisObjectDCTransitive() {
        assertFalse(isObjectDCTransitive(o, d1, c1));
    }

    @Test public void TestisObjectDDTransitive() {
        assertFalse(isObjectDDTransitive(o, d1, d2));
    }

    @Test public void TestisObjectDObjectTransitive() {
        assertFalse(isObjectDObjectTransitive(o1, d1, o2));
    }

    @Test public void TestisObjectObjectCTransitive() {
        assertFalse(isObjectObjectCTransitive(o1, o2, c1));
    }

    @Test public void TestisObjectObjectDTransitive() {
        assertFalse(isObjectObjectDTransitive(o1, o2, d1));
    }


    private boolean isCCDTransitive(C c1, C c2, D d) {
        if (!c1.equals(c2)) {return false;}
        if (!c2.equals(d)) {return false;}
        if (!c1.equals(d)) {return false;}
        return true;
    }

    private boolean isCCObjectTransitive(C c1, C c2, Object o) {
        if (!c1.equals(c2)) {return false;}
        if (!c2.equals(o)) {return false;}
        if (!c1.equals(o)) {return false;}
        return true;
    }

    private boolean isCDCTransitive(C c1, D d, C c2) {
        if (!c1.equals(d)) {return false;}
        if (!d.equals(c2)) {return false;}
        if (!c1.equals(c2)) {return false;}
        return true;
    }

    private boolean isCDDTransitive(C c, D d1, D d2) {
        if (!c.equals(d1)) {return false;}
        if (!d1.equals(d2)) {return false;}
        if (!c.equals(d2)) {return false;}
        return true;
    }

    private boolean isCDObjectTransitive(C c, D d, Object o) {
        if (!c.equals(d)) {return false;}
        if (!d.equals(o)) {return false;}
        if (!c.equals(o)) {return false;}
        return true;
    }

    private boolean isCObjectCTransitive(C c1, Object o, C c2) {
        if (!c1.equals(o)) {return false;}
        if (!o.equals(c2)) {return false;}
        if (!c1.equals(c2)) {return false;}
        return true;
    }

    private boolean isCObjectDTransitive(C c, Object o, D d) {
        if (!c.equals(o)) {return false;}
        if (!o.equals(d)) {return false;}
        if (!c.equals(d)) {return false;}
        return true;
    }

    private boolean isCObjectObjectTransitive(C c, Object o1, Object o2) {
        if (!c.equals(o1)) {return false;}
        if (!o1.equals(o2)) {return false;}
        if (!c.equals(o2)) {return false;}
        return true;
    }

    private boolean isDCCTransitive(D d, C c1, C c2) {
        if (!d.equals(c1)) {return false;}
        if (!c1.equals(c2)) {return false;}
        if (!d.equals(c2)) {return false;}
        return true;
    }

    private boolean isDCDTransitive(D d1, C c, D d2) {
        if (!d1.equals(c)) {return false;}
        if (!c.equals(d2)) {return false;}
        if (!d1.equals(d2)) {return false;}
        return true;
    }

    private boolean isDCObjectTransitive(D d, C c, Object o) {
        if (!d.equals(c)) {return false;}
        if (!c.equals(o)) {return false;}
        if (!d.equals(o)) {return false;}
        return true;
    }

    private boolean isDDCTransitive(D d1, D d2, C c) {
        if (!d1.equals(d2)) {return false;}
        if (!d2.equals(c)) {return false;}
        if (!d1.equals(c)) {return false;}
        return true;
    }

    private boolean isDDObjectTransitive(D d1, D d2, Object o) {
        if (!d1.equals(d2)) {return false;}
        if (!d2.equals(o)) {return false;}
        if (!d1.equals(o)) {return false;}
        return true;
    }

    private boolean isDObjectCTransitive(D d, Object o, C c) {
        if (!d.equals(o)) {return false;}
        if (!o.equals(c)) {return false;}
        if (!d.equals(c)) {return false;}
        return true;
    }

    private boolean isDObjectDTransitive(D d1, Object o, D d2) {
        if (!d1.equals(o)) {return false;}
        if (!o.equals(d2)) {return false;}
        if (!d1.equals(d2)) {return false;}
        return true;
    }

    private boolean isDObjectObjectTransitive(D d, Object o1, Object o2) {
        if (!d.equals(o1)) {return false;}
        if (!o1.equals(o2)) {return false;}
        if (!d.equals(o2)) {return false;}
        return true;
    }

    private boolean isObjectCCTransitive(Object o, C c1, C c2) {
        if (!o.equals(c1)) {return false;}
        if (!c1.equals(c2)) {return false;}
        if (!o.equals(c2)) {return false;}
        return true;
    }

    private boolean isObjectCDTransitive(Object o1, C c, D d) {
        if (!o1.equals(c)) {return false;}
        if (!c.equals(d)) {return false;}
        if (!o1.equals(d)) {return false;}
        return true;
    }

    private boolean isObjectCObjectTransitive(Object o1, C c, Object o2) {
        if (!o1.equals(c)) {return false;}
        if (!c.equals(o2)) {return false;}
        if (!o1.equals(o2)) {return false;}
        return true;
    }

    private boolean isObjectDCTransitive(Object o, D d, C c) {
        if (!o.equals(d)) {return false;}
        if (!d.equals(c)) {return false;}
        if (!o.equals(c)) {return false;}
        return true;
    }

    private boolean isObjectDDTransitive(Object o, D d1, D d2) {
        if (!o.equals(d1)) {return false;}
        if (!d1.equals(d2)) {return false;}
        if (!o.equals(d2)) {return false;}
        return true;
    }

    private boolean isObjectDObjectTransitive(Object o1, D d, Object o2) {
        if (!o1.equals(d)) {return false;}
        if (!d.equals(o2)) {return false;}
        if (!o1.equals(o2)) {return false;}
        return true;
    }

    private boolean isObjectObjectCTransitive(Object o1, Object o2, C c) {
        if (!o1.equals(o2)) {return false;}
        if (!o2.equals(c)) {return false;}
        if (!o1.equals(c)) {return false;}
        return true;
    }

    private boolean isObjectObjectDTransitive(Object o1, Object o2, D d) {
        if (!o1.equals(o2)) {return false;}
        if (!o2.equals(d)) {return false;}
        if (!o1.equals(d)) {return false;}
        return true;
    }
}
