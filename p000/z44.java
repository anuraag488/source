package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class z44 {

    /* JADX INFO: renamed from: a */
    public static final C0641f8 f35748a = new C0641f8("NO_VALUE", (byte) 8);

    /* JADX INFO: renamed from: a */
    public static final y44 m13331a(int i, int i2, y30 y30Var) {
        if (i < 0) {
            C1077qn.m9988n(c75.m3877i(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            C1077qn.m9988n(c75.m3877i(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && y30Var != y30.f34832a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + y30Var).toString());
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new y44(i, i3, y30Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ y44 m13332b(int i, int i2, y30 y30Var) {
        int i3 = (i2 & 1) != 0 ? 0 : 1;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            y30Var = y30.f34832a;
        }
        return m13331a(i3, i, y30Var);
    }

    /* JADX INFO: renamed from: c */
    public static final si1 m13333c(v44 v44Var, ro0 ro0Var, int i, y30 y30Var) {
        return ((i == 0 || i == -3) && y30Var == y30.f34832a) ? v44Var : new h80(i, y30Var, ro0Var, v44Var);
    }

    /* JADX INFO: renamed from: d */
    public static final void m13334d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
