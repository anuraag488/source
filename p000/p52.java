package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class p52 implements Iterable, cc2 {

    /* JADX INFO: renamed from: a */
    public final int f27382a;

    /* JADX INFO: renamed from: b */
    public final int f27383b;

    /* JADX INFO: renamed from: c */
    public final int f27384c;

    public p52(int i, int i2, int i3) {
        if (i3 == 0) {
            C1077qn.m9987m("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C1077qn.m9987m("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f27382a = i;
        this.f27383b = ks5.m7619t(i, i2, i3);
        this.f27384c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p52)) {
            return false;
        }
        if (isEmpty() && ((p52) obj).isEmpty()) {
            return true;
        }
        p52 p52Var = (p52) obj;
        return this.f27382a == p52Var.f27382a && this.f27383b == p52Var.f27383b && this.f27384c == p52Var.f27384c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f27382a * 31) + this.f27383b) * 31) + this.f27384c;
    }

    public boolean isEmpty() {
        int i = this.f27383b;
        int i2 = this.f27384c;
        int i3 = this.f27382a;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        q52 q52Var = new q52();
        int i = this.f27384c;
        q52Var.f28223a = i;
        int i2 = this.f27383b;
        q52Var.f28224b = i2;
        int i3 = this.f27382a;
        boolean z = false;
        if (i <= 0 ? i3 >= i2 : i3 <= i2) {
            z = true;
        }
        q52Var.f28225c = z;
        if (z) {
            i2 = i3;
        }
        q52Var.f28226d = i2;
        VarHandle.storeStoreFence();
        return q52Var;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f27383b;
        int i2 = this.f27384c;
        int i3 = this.f27382a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
