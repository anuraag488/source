package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: lr */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0882lr implements m23 {

    /* JADX INFO: renamed from: a */
    public static final C0882lr f24293a = new C0882lr();

    /* JADX INFO: renamed from: b */
    public static final pe1 f24294b;

    /* JADX INFO: renamed from: c */
    public static final pe1 f24295c;

    /* JADX INFO: renamed from: d */
    public static final pe1 f24296d;

    /* JADX INFO: renamed from: e */
    public static final pe1 f24297e;

    static {
        z32 z32VarM9500a = pe1.m9500a("window");
        C1264vp c1264vp = new C1264vp();
        c1264vp.f32767a = (byte) 1;
        VarHandle.storeStoreFence();
        z32VarM9500a.m13319Q(c1264vp);
        f24294b = z32VarM9500a.m13325s();
        z32 z32VarM9500a2 = pe1.m9500a("logSourceMetrics");
        C1264vp c1264vp2 = new C1264vp();
        c1264vp2.f32767a = (byte) 2;
        VarHandle.storeStoreFence();
        z32VarM9500a2.m13319Q(c1264vp2);
        f24295c = z32VarM9500a2.m13325s();
        z32 z32VarM9500a3 = pe1.m9500a("globalMetrics");
        C1264vp c1264vp3 = new C1264vp();
        c1264vp3.f32767a = (byte) 3;
        VarHandle.storeStoreFence();
        z32VarM9500a3.m13319Q(c1264vp3);
        f24296d = z32VarM9500a3.m13325s();
        z32 z32VarM9500a4 = pe1.m9500a("appNamespace");
        C1264vp c1264vp4 = new C1264vp();
        c1264vp4.f32767a = (byte) 4;
        VarHandle.storeStoreFence();
        z32VarM9500a4.m13319Q(c1264vp4);
        f24297e = z32VarM9500a4.m13325s();
    }

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        ea0 ea0Var = (ea0) obj;
        n23 n23Var = (n23) obj2;
        n23Var.mo8479a(f24294b, ea0Var.f17918a);
        n23Var.mo8479a(f24295c, ea0Var.f17919b);
        n23Var.mo8479a(f24296d, ea0Var.f17920c);
        n23Var.mo8479a(f24297e, ea0Var.f17921d);
    }
}
