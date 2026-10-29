package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p24 {

    /* JADX INFO: renamed from: a */
    public final Class f27325a;

    /* JADX INFO: renamed from: b */
    public final u50 f27326b;

    public p24(Class cls, u50 u50Var) {
        this.f27325a = cls;
        this.f27326b = u50Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p24)) {
            return false;
        }
        p24 p24Var = (p24) obj;
        return p24Var.f27325a.equals(this.f27325a) && p24Var.f27326b.equals(this.f27326b);
    }

    public final int hashCode() {
        return Objects.hash(this.f27325a, this.f27326b);
    }

    public final String toString() {
        return this.f27325a.getSimpleName() + ", object identifier: " + this.f27326b;
    }
}
