package p000;

import java.lang.invoke.VarHandle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f61 extends gp2 {

    /* JADX INFO: renamed from: a */
    public e61 f18783a;

    /* JADX INFO: renamed from: b */
    public static f61 m5592b(e61 e61Var) {
        f61 f61Var = new f61();
        f61Var.f18783a = e61Var;
        VarHandle.storeStoreFence();
        return f61Var;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f18783a != e61.f17839e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f61) && ((f61) obj).f18783a == this.f18783a;
    }

    public final int hashCode() {
        return Objects.hash(f61.class, this.f18783a);
    }

    public final String toString() {
        return "Ed25519 Parameters (variant: " + this.f18783a + ")";
    }
}
