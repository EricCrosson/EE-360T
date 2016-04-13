package pset2;

public class D extends C {

    int g;

    public D(int f, int g) {
        super(f);
        this.g = g;
    }

    public String getClassName(Object o) {
        return o.getClass().getName();
    }

    @Override
    public boolean equals(Object oh) {
        // returns a boolean consistent with the Java contract for equals
        // method;
        // returns true if and only if o is an object of class D and
        // has the same value for field f as this.f and the same value
        // for field g as this.g

        if (this == oh) {
            return true;
        }
        if (!(super.equals(oh) && (getClassName(oh).equals(getClassName(this))))) {
            return false;
        }
        D other = (D) (oh);
        if (g != other.g) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        // returns an integer consistent with the Java contract for hashCode
        // method; does not return a constant value

        final int prime = 17;
        return prime * super.hashCode() + g;
    }
}
