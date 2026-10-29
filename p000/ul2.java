package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ul2 {
    /* JADX INFO: renamed from: a */
    public static i62 m11582a(long j, Object obj) {
        i62 i62Var = (i62) cv4.m4183j(j, obj);
        if (((AbstractC0560d2) i62Var).f16738a) {
            return i62Var;
        }
        int size = i62Var.size();
        i62 i62VarMo6682n = i62Var.mo6682n(size == 0 ? 10 : size * 2);
        cv4.m4190q(j, obj, i62VarMo6682n);
        return i62VarMo6682n;
    }
}
