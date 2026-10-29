package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l11 {

    /* JADX INFO: renamed from: a */
    public final iv2 f23694a;

    /* JADX INFO: renamed from: b */
    public final iv2 f23695b;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        l73 l73Var = new l73(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        new l11(l73Var, new l73(fValueOf2, fValueOf2));
    }

    public l11(l73... l73VarArr) {
        this.f23694a = new iv2(l73VarArr.length);
        this.f23695b = new iv2(l73VarArr.length);
        int length = l73VarArr.length;
        int i = 0;
        while (true) {
            iv2 iv2Var = this.f23694a;
            if (i >= length) {
                y62.m12972h0(iv2Var);
                y62.m12972h0(this.f23695b);
                return;
            } else {
                iv2Var.m6944a(((Number) l73VarArr[i].f23833a).floatValue());
                this.f23695b.m6944a(((Number) l73VarArr[i].f23834b).floatValue());
                i++;
            }
        }
    }
}
