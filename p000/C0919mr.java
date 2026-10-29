package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: mr */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0919mr implements m23 {

    /* JADX INFO: renamed from: a */
    public static final C0919mr f25161a = new C0919mr();

    /* JADX INFO: renamed from: b */
    public static final pe1 f25162b;

    static {
        z32 z32VarM9500a = pe1.m9500a("storageMetrics");
        C1264vp c1264vp = new C1264vp();
        c1264vp.f32767a = (byte) 1;
        VarHandle.storeStoreFence();
        z32VarM9500a.m13319Q(c1264vp);
        f25162b = z32VarM9500a.m13325s();
    }

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        ((n23) obj2).mo8479a(f25162b, ((ms1) obj).f25179a);
    }
}
