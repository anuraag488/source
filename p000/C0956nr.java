package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: nr */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0956nr implements m23 {

    /* JADX INFO: renamed from: a */
    public static final C0956nr f26044a = new C0956nr();

    /* JADX INFO: renamed from: b */
    public static final pe1 f26045b;

    /* JADX INFO: renamed from: c */
    public static final pe1 f26046c;

    static {
        z32 z32VarM9500a = pe1.m9500a("eventsDroppedCount");
        C1264vp c1264vp = new C1264vp();
        c1264vp.f32767a = (byte) 1;
        VarHandle.storeStoreFence();
        z32VarM9500a.m13319Q(c1264vp);
        f26045b = z32VarM9500a.m13325s();
        z32 z32VarM9500a2 = pe1.m9500a("reason");
        C1264vp c1264vp2 = new C1264vp();
        c1264vp2.f32767a = (byte) 3;
        VarHandle.storeStoreFence();
        z32VarM9500a2.m13319Q(c1264vp2);
        f26046c = z32VarM9500a2.m13325s();
    }

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        mn2 mn2Var = (mn2) obj;
        n23 n23Var = (n23) obj2;
        n23Var.mo8483g(f26045b, mn2Var.f25063a);
        n23Var.mo8479a(f26046c, mn2Var.f25064b);
    }
}
