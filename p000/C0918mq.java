package p000;

/* JADX INFO: renamed from: mq */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0918mq implements m23 {

    /* JADX INFO: renamed from: a */
    public static final C0918mq f25122a = new C0918mq();

    /* JADX INFO: renamed from: b */
    public static final pe1 f25123b = pe1.m9501b("pid");

    /* JADX INFO: renamed from: c */
    public static final pe1 f25124c = pe1.m9501b("processName");

    /* JADX INFO: renamed from: d */
    public static final pe1 f25125d = pe1.m9501b("reasonCode");

    /* JADX INFO: renamed from: e */
    public static final pe1 f25126e = pe1.m9501b("importance");

    /* JADX INFO: renamed from: f */
    public static final pe1 f25127f = pe1.m9501b("pss");

    /* JADX INFO: renamed from: g */
    public static final pe1 f25128g = pe1.m9501b("rss");

    /* JADX INFO: renamed from: h */
    public static final pe1 f25129h = pe1.m9501b("timestamp");

    /* JADX INFO: renamed from: i */
    public static final pe1 f25130i = pe1.m9501b("traceFile");

    /* JADX INFO: renamed from: j */
    public static final pe1 f25131j = pe1.m9501b("buildIdMappingForArch");

    @Override // p000.h81
    /* JADX INFO: renamed from: a */
    public final void mo3114a(Object obj, Object obj2) {
        vp0 vp0Var = (vp0) obj;
        n23 n23Var = (n23) obj2;
        n23Var.mo8481e(f25123b, ((C0883ls) vp0Var).f24321a);
        C0883ls c0883ls = (C0883ls) vp0Var;
        n23Var.mo8479a(f25124c, c0883ls.f24322b);
        n23Var.mo8481e(f25125d, c0883ls.f24323c);
        n23Var.mo8481e(f25126e, c0883ls.f24324d);
        n23Var.mo8483g(f25127f, c0883ls.f24325e);
        n23Var.mo8483g(f25128g, c0883ls.f24326f);
        n23Var.mo8483g(f25129h, c0883ls.f24327g);
        n23Var.mo8479a(f25130i, c0883ls.f24328h);
        n23Var.mo8479a(f25131j, c0883ls.f24329i);
    }
}
