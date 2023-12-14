package reproducer;

import java.util.Objects;

public class A {
    public A(String abc, int bcd) {
        this.abc = abc;
        this.bcd = bcd;
    }

    public A() {
    }

    private String abc;
    private int bcd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A a)) return false;

        if (bcd != a.bcd) return false;
        return Objects.equals(abc, a.abc);
    }

    @Override
    public int hashCode() {
        int result = abc != null ? abc.hashCode() : 0;
        result = 31 * result + bcd;
        return result;
    }

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }
}
