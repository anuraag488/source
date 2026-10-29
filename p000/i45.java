package p000;

import java.lang.invoke.VarHandle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i45 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public C0973o7 f21127a;

    /* JADX INFO: renamed from: b */
    public static i45 m6664b(C0973o7 c0973o7) {
        i45 i45Var = new i45();
        i45Var.f21127a = c0973o7;
        VarHandle.storeStoreFence();
        return i45Var;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f21127a != C0973o7.f26376C;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i45) && ((i45) obj).f21127a == this.f21127a;
    }

    public final int hashCode() {
        return Objects.hash(i45.class, this.f21127a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f21127a + ")";
    }
}
