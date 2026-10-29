package p000;

import java.lang.invoke.VarHandle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v70 extends AbstractC0640f7 {

    /* JADX INFO: renamed from: a */
    public C0973o7 f32438a;

    /* JADX INFO: renamed from: b */
    public static v70 m11755b(C0973o7 c0973o7) {
        v70 v70Var = new v70();
        v70Var.f32438a = c0973o7;
        VarHandle.storeStoreFence();
        return v70Var;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f32438a != C0973o7.f26389o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v70) && ((v70) obj).f32438a == this.f32438a;
    }

    public final int hashCode() {
        return Objects.hash(v70.class, this.f32438a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f32438a + ")";
    }
}
