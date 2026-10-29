package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wo3 {

    /* JADX INFO: renamed from: a */
    public bo3 f33549a;

    /* JADX INFO: renamed from: b */
    public wh3 f33550b;

    /* JADX INFO: renamed from: d */
    public String f33552d;

    /* JADX INFO: renamed from: e */
    public av1 f33553e;

    /* JADX INFO: renamed from: g */
    public d12 f33555g;

    /* JADX INFO: renamed from: h */
    public xo3 f33556h;

    /* JADX INFO: renamed from: i */
    public xo3 f33557i;

    /* JADX INFO: renamed from: j */
    public xo3 f33558j;

    /* JADX INFO: renamed from: k */
    public long f33559k;

    /* JADX INFO: renamed from: l */
    public long f33560l;

    /* JADX INFO: renamed from: m */
    public g90 f33561m;

    /* JADX INFO: renamed from: c */
    public int f33551c = -1;

    /* JADX INFO: renamed from: f */
    public tv1 f33554f = new tv1((byte) 0);

    /* JADX INFO: renamed from: b */
    public static void m12343b(String str, xo3 xo3Var) {
        if (xo3Var != null) {
            if (xo3Var.f34500g != null) {
                C1077qn.m9988n(str.concat(".body != null"));
                return;
            }
            if (xo3Var.f34501h != null) {
                C1077qn.m9988n(str.concat(".networkResponse != null"));
            } else if (xo3Var.f34502i != null) {
                C1077qn.m9988n(str.concat(".cacheResponse != null"));
            } else {
                if (xo3Var.f34503j == null) {
                    return;
                }
                C1077qn.m9988n(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final xo3 m12344a() {
        int i = this.f33551c;
        if (i < 0) {
            xd2.m12664k(this.f33551c, "code < 0: ");
            return null;
        }
        bo3 bo3Var = this.f33549a;
        if (bo3Var == null) {
            C1077qn.m9989o("request == null");
            return null;
        }
        wh3 wh3Var = this.f33550b;
        if (wh3Var == null) {
            C1077qn.m9989o("protocol == null");
            return null;
        }
        String str = this.f33552d;
        if (str == null) {
            C1077qn.m9989o("message == null");
            return null;
        }
        av1 av1Var = this.f33553e;
        uv1 uv1VarM11167c = this.f33554f.m11167c();
        d12 d12Var = this.f33555g;
        xo3 xo3Var = this.f33556h;
        xo3 xo3Var2 = this.f33557i;
        xo3 xo3Var3 = this.f33558j;
        long j = this.f33559k;
        long j2 = this.f33560l;
        g90 g90Var = this.f33561m;
        xo3 xo3Var4 = new xo3();
        xo3Var4.f34494a = bo3Var;
        xo3Var4.f34495b = wh3Var;
        xo3Var4.f34496c = str;
        xo3Var4.f34497d = i;
        xo3Var4.f34498e = av1Var;
        xo3Var4.f34499f = uv1VarM11167c;
        xo3Var4.f34500g = d12Var;
        xo3Var4.f34501h = xo3Var;
        xo3Var4.f34502i = xo3Var2;
        xo3Var4.f34503j = xo3Var3;
        xo3Var4.f34504k = j;
        xo3Var4.f34505l = j2;
        xo3Var4.f34506m = g90Var;
        VarHandle.storeStoreFence();
        return xo3Var4;
    }
}
