package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tm1 {

    /* JADX INFO: renamed from: a */
    public int f31237a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ tm1 m11064a(int i) {
        tm1 tm1Var = new tm1();
        tm1Var.f31237a = i;
        VarHandle.storeStoreFence();
        return tm1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tm1) && this.f31237a == ((tm1) obj).f31237a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31237a);
    }

    public final String toString() {
        int i = this.f31237a;
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }
}
