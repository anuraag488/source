package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: sp */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1153sp {

    /* JADX INFO: renamed from: a */
    public Object f30455a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C1153sp m10887a(Object obj) {
        C1153sp c1153sp = new C1153sp();
        c1153sp.f30455a = obj;
        VarHandle.storeStoreFence();
        return c1153sp;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1153sp) && z62.m13387o(this.f30455a, ((C1153sp) obj).f30455a);
    }

    public final int hashCode() {
        Object obj = this.f30455a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f30455a + ")";
    }
}
