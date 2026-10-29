package p000;

/* JADX INFO: renamed from: wq */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1303wq implements m23 {

    /* JADX INFO: renamed from: a */
    public static final C1303wq f33594a = new C1303wq();

    /* JADX INFO: renamed from: b */
    public static final pe1 f33595b = pe1.m9501b("baseAddress");

    /* JADX INFO: renamed from: c */
    public static final pe1 f33596c = pe1.m9501b("size");

    /* JADX INFO: renamed from: d */
    public static final pe1 f33597d = pe1.m9501b("name");

    /* JADX INFO: renamed from: e */
    public static final pe1 f33598e = pe1.m9501b("uuid");

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        cq0 cq0Var = (cq0) obj;
        n23 n23Var = (n23) obj2;
        n23Var.mo8483g(f33595b, ((C0550ct) cq0Var).f16438a);
        C0550ct c0550ct = (C0550ct) cq0Var;
        n23Var.mo8483g(f33596c, c0550ct.f16439b);
        n23Var.mo8479a(f33597d, c0550ct.f16440c);
        String str = c0550ct.f16441d;
        n23Var.mo8479a(f33598e, str != null ? str.getBytes(tq0.f31331a) : null);
    }
}
