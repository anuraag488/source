package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xp3 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f34516a = as4.m3262u(new da2((byte) 28));

    /* JADX INFO: renamed from: b */
    public static final kj0 f34517b = as4.m3263v(new t63((byte) 8));

    /* JADX INFO: renamed from: c */
    public static final jq3 f34518c;

    /* JADX INFO: renamed from: d */
    public static final jq3 f34519d;

    static {
        long j = pb0.f27501h;
        f34518c = new jq3(true, Float.NaN, j, null, true);
        f34519d = new jq3(false, Float.NaN, j, null, true);
    }

    /* JADX INFO: renamed from: a */
    public static jq3 m12729a(p44 p44Var, int i) {
        boolean z = (i & 1) != 0;
        float f = (i & 2) != 0 ? Float.NaN : 20.0f;
        long j = pb0.f27501h;
        if ((i & 8) != 0) {
            p44Var = null;
        }
        p44 p44Var2 = p44Var;
        if (p11.m9352c(f, Float.NaN) && ws4.m12408a(j, j) && p44Var2 == null) {
            return z ? f34518c : f34519d;
        }
        return new jq3(z, f, j, p44Var2, true);
    }
}
