package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r22 {

    /* JADX INFO: renamed from: a */
    public int f28967a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ r22 m10181a(int i) {
        r22 r22Var = new r22();
        r22Var.f28967a = i;
        VarHandle.storeStoreFence();
        return r22Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r22) && this.f28967a == ((r22) obj).f28967a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28967a);
    }

    public final String toString() {
        return c75.m3878j("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.f28967a, ")");
    }
}
