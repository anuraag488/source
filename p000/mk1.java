package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 {

    /* JADX INFO: renamed from: a */
    public int f24973a;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ mk1 m8337a(int i) {
        mk1 mk1Var = new mk1();
        mk1Var.f24973a = i;
        VarHandle.storeStoreFence();
        return mk1Var;
    }

    /* JADX INFO: renamed from: b */
    public static String m8338b(int i) {
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        return i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mk1) && this.f24973a == ((mk1) obj).f24973a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24973a);
    }

    public final String toString() {
        return m8338b(this.f24973a);
    }
}
