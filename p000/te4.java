package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class te4 implements qe4, Serializable {

    /* JADX INFO: renamed from: a */
    public Object f31098a;

    public final boolean equals(Object obj) {
        if (obj instanceof te4) {
            return qs5.m10116u(this.f31098a, ((te4) obj).f31098a);
        }
        return false;
    }

    @Override // p000.qe4
    public final Object get() {
        return this.f31098a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31098a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f31098a + ")";
    }
}
