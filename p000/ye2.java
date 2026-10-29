package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ye2 {

    /* JADX INFO: renamed from: a */
    public static final ye2 f35161a;

    static {
        ye2 ye2Var = new ye2();
        if (p11.m9351b(0.0f, 0.0f) < 0 || p11.m9351b(0.0f, 0.0f) < 0 || p11.m9351b(0.0f, 0.0f) < 0 || p11.m9351b(0.0f, 0.0f) < 0) {
            p32.m9361a("Layer outsets must be non-negative");
        }
        VarHandle.storeStoreFence();
        f35161a = ye2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye2) && p11.m9352c(0.0f, 0.0f) && p11.m9352c(0.0f, 0.0f) && p11.m9352c(0.0f, 0.0f) && p11.m9352c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + c75.m3874f(0.0f, c75.m3874f(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String strM9353d = p11.m9353d(0.0f);
        String strM9353d2 = p11.m9353d(0.0f);
        return c75.m3882n(zi4.m13625y("LayerOutsets(left=", strM9353d, ", top=", strM9353d2, ", right="), p11.m9353d(0.0f), ", bottom=", p11.m9353d(0.0f), ")");
    }
}
