package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ny2 {

    /* JADX INFO: renamed from: a */
    public final Object f26194a;

    /* JADX INFO: renamed from: b */
    public final Object f26195b;

    /* JADX INFO: renamed from: c */
    public final Map f26196c;

    /* JADX INFO: renamed from: d */
    public final pg0 f26197d;

    public ny2(Object obj, Object obj2, Map map, pg0 pg0Var) {
        this.f26194a = obj;
        this.f26195b = obj2;
        this.f26196c = map;
        this.f26197d = pg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8898a(int i, mi0 mi0Var) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(295512821);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            this.f26197d.invoke(this.f26194a, ir1Var, 0);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            gi2 gi2Var = new gi2(b);
            gi2Var.f19805c = this;
            gi2Var.f19804b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = gi2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ny2.class != obj.getClass()) {
            return false;
        }
        ny2 ny2Var = (ny2) obj;
        return z62.m13387o(this.f26194a, ny2Var.f26194a) && z62.m13387o(this.f26195b, ny2Var.f26195b) && z62.m13387o(this.f26196c, ny2Var.f26196c) && this.f26197d == ny2Var.f26197d;
    }

    public final int hashCode() {
        return (this.f26197d.hashCode() * 31) + (this.f26196c.hashCode() * 31) + (this.f26195b.hashCode() * 31) + (this.f26194a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.f26194a + ", contentKey=" + this.f26195b + ", metadata=" + this.f26196c + ", content=" + this.f26197d + ")";
    }

    public ny2(ny2 ny2Var, pg0 pg0Var) {
        this(ny2Var.f26194a, ny2Var.f26195b, ny2Var.f26196c, pg0Var);
    }
}
