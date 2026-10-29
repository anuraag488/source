package p000;

/* JADX INFO: renamed from: dr */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0584dr implements m23 {

    /* JADX INFO: renamed from: a */
    public static final C0584dr f17291a = new C0584dr();

    /* JADX INFO: renamed from: b */
    public static final pe1 f17292b = pe1.m9501b("batteryLevel");

    /* JADX INFO: renamed from: c */
    public static final pe1 f17293c = pe1.m9501b("batteryVelocity");

    /* JADX INFO: renamed from: d */
    public static final pe1 f17294d = pe1.m9501b("proximityOn");

    /* JADX INFO: renamed from: e */
    public static final pe1 f17295e = pe1.m9501b("orientation");

    /* JADX INFO: renamed from: f */
    public static final pe1 f17296f = pe1.m9501b("ramUsed");

    /* JADX INFO: renamed from: g */
    public static final pe1 f17297g = pe1.m9501b("diskUsed");

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        kq0 kq0Var = (kq0) obj;
        n23 n23Var = (n23) obj2;
        n23Var.mo8479a(f17292b, ((C1046pt) kq0Var).f27955a);
        C1046pt c1046pt = (C1046pt) kq0Var;
        n23Var.mo8481e(f17293c, c1046pt.f27956b);
        n23Var.mo8480d(f17294d, c1046pt.f27957c);
        n23Var.mo8481e(f17295e, c1046pt.f27958d);
        n23Var.mo8483g(f17296f, c1046pt.f27959e);
        n23Var.mo8483g(f17297g, c1046pt.f27960f);
    }
}
