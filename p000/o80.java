package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o80 {

    /* JADX INFO: renamed from: b */
    public static final n80 f26420b = new n80();

    /* JADX INFO: renamed from: a */
    public Object f26421a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ o80 m8978a(Object obj) {
        o80 o80Var = new o80();
        o80Var.f26421a = obj;
        VarHandle.storeStoreFence();
        return o80Var;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m8979b(Object obj) {
        if (obj instanceof n80) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o80) && z62.m13387o(this.f26421a, ((o80) obj).f26421a);
    }

    public final int hashCode() {
        Object obj = this.f26421a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f26421a;
        if (obj instanceof m80) {
            return ((m80) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
