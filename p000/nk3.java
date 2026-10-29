package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nk3 {

    /* JADX INFO: renamed from: a */
    public final ek3 f25906a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f25907b;

    /* JADX INFO: renamed from: c */
    public final int f25908c;

    /* JADX INFO: renamed from: d */
    public final g90 f25909d;

    /* JADX INFO: renamed from: e */
    public final bo3 f25910e;

    /* JADX INFO: renamed from: f */
    public final short f25911f;

    /* JADX INFO: renamed from: g */
    public final short f25912g;

    /* JADX INFO: renamed from: h */
    public final short f25913h;

    /* JADX INFO: renamed from: i */
    public int f25914i;

    /* JADX WARN: Multi-variable type inference failed */
    public nk3(ek3 ek3Var, ArrayList arrayList, int i, g90 g90Var, bo3 bo3Var, int i2, int i3, int i4) {
        this.f25906a = ek3Var;
        this.f25907b = arrayList;
        this.f25908c = i;
        this.f25909d = g90Var;
        this.f25910e = bo3Var;
        this.f25911f = i2;
        this.f25912g = i3;
        this.f25913h = i4;
    }

    /* JADX INFO: renamed from: a */
    public static nk3 m8791a(nk3 nk3Var, int i, g90 g90Var, bo3 bo3Var, int i2) {
        if ((i2 & 1) != 0) {
            i = nk3Var.f25908c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            g90Var = nk3Var.f25909d;
        }
        g90 g90Var2 = g90Var;
        if ((i2 & 4) != 0) {
            bo3Var = nk3Var.f25910e;
        }
        short s = nk3Var.f25911f;
        short s2 = nk3Var.f25912g;
        short s3 = nk3Var.f25913h;
        return new nk3(nk3Var.f25906a, nk3Var.f25907b, i3, g90Var2, bo3Var, s, s2, s3);
    }

    /* JADX INFO: renamed from: b */
    public final xo3 m8792b(bo3 bo3Var) {
        ArrayList arrayList = this.f25907b;
        int size = arrayList.size();
        int i = this.f25908c;
        if (i >= size) {
            C1077qn.m9989o("Check failed.");
            return null;
        }
        this.f25914i++;
        g90 g90Var = this.f25909d;
        if (g90Var != null) {
            nb1 nb1Var = (nb1) g90Var.f19663c;
            dz1 dz1Var = bo3Var.f15462a;
            dz1 dz1Var2 = nb1Var.f25618b.f35775h;
            if (dz1Var.f17522e != dz1Var2.f17522e || !z62.m13387o(dz1Var.f17521d, dz1Var2.f17521d)) {
                nm0.m8796h("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.f25914i != 1) {
                nm0.m8796h("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        nk3 nk3VarM8791a = m8791a(this, i2, null, bo3Var, 58);
        g62 g62Var = (g62) arrayList.get(i);
        xo3 xo3VarIntercept = g62Var.intercept(nk3VarM8791a);
        if (xo3VarIntercept == null) {
            throw new NullPointerException("interceptor " + g62Var + " returned null");
        }
        if (g90Var != null && i2 < arrayList.size() && nk3VarM8791a.f25914i != 1) {
            nm0.m8796h("network interceptor ", g62Var, " must call proceed() exactly once");
            return null;
        }
        if (xo3VarIntercept.f34500g != null) {
            return xo3VarIntercept;
        }
        nm0.m8796h("interceptor ", g62Var, " returned a response with no body");
        return null;
    }
}
