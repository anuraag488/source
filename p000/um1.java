package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class um1 {

    /* JADX INFO: renamed from: a */
    public int f31990a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ um1 m11584a(int i) {
        um1 um1Var = new um1();
        um1Var.f31990a = i;
        VarHandle.storeStoreFence();
        return um1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof um1) && this.f31990a == ((um1) obj).f31990a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31990a);
    }

    public final String toString() {
        int i = this.f31990a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}
