package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k12 {

    /* JADX INFO: renamed from: a */
    public int f22814a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ k12 m7357a(int i) {
        k12 k12Var = new k12();
        k12Var.f22814a = i;
        VarHandle.storeStoreFence();
        return k12Var;
    }

    /* JADX INFO: renamed from: b */
    public static String m7358b(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        return i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k12) && this.f22814a == ((k12) obj).f22814a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22814a);
    }

    public final String toString() {
        return m7358b(this.f22814a);
    }
}
