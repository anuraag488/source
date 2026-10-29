package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gd1 {

    /* JADX INFO: renamed from: a */
    public static final List f19744a;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        l73 l73Var = new l73(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        f19744a = kx5.m7694Y(l73Var, new l73(fValueOf2, fValueOf2));
    }

    /* JADX INFO: renamed from: a */
    public static final long m5972a(fd1 fd1Var) {
        List list = fd1Var.f18921a;
        return ji1.m7130a((((as0) hb0.m6306R0(list)).m3215a() + ((as0) hb0.m6299K0(list)).f14841a[0]) / 2.0f, (((as0) hb0.m6306R0(list)).m3216b() + ((as0) hb0.m6299K0(list)).f14841a[1]) / 2.0f);
    }
}
