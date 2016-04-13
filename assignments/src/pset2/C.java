package pset2;

public class C {
    
    int f;

    public C(int f) {
        this.f = f;
    }

    public String getClassName(Object o) {
        return o.getClass().getName();
    }

    @Override
    public boolean equals(Object oh) {
        if (this == oh)
            return true;
        if (oh == null)
            return false;
        if (this.getClass() != oh.getClass())
            return false;
        C other = (C) oh;
        if (f != other.f)
            return false;
        return true;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + f;
    }
}
