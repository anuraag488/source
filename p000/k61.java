package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class k61 {

    /* JADX INFO: renamed from: a */
    public static final x73 f22932a;

    /* JADX INFO: renamed from: b */
    public static final v73 f22933b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f22934c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f22935d;

    /* JADX INFO: renamed from: e */
    public static final fd2 f22936e;

    /* JADX INFO: renamed from: f */
    public static final dd2 f22937f;

    /* JADX INFO: renamed from: g */
    public static final nh3 f22938g;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        u50 u50VarM13266c2 = yv4.m13266c("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f22932a = x73.m12526a(new nm0((byte) 23), f61.class);
        f22933b = v73.m11756a(new nm0((byte) 24), u50VarM13266c);
        f22934c = fd2.m5692a(new nm0((byte) 25), m61.class);
        f22935d = dd2.m4479a(new nm0((byte) 26), u50VarM13266c2);
        f22936e = fd2.m5692a(new nm0((byte) 27), h61.class);
        f22937f = dd2.m4479a(new nm0((byte) 28), u50VarM13266c);
        z91 z91VarM8733k = nh3.m8733k();
        z91VarM8733k.m13454a(j63.f22047e, e61.f17839e);
        z91VarM8733k.m13454a(j63.f22045c, e61.f17836b);
        z91VarM8733k.m13454a(j63.f22048f, e61.f17837c);
        z91VarM8733k.m13454a(j63.f22046d, e61.f17838d);
        f22938g = z91VarM8733k.m13456c();
    }

    /* JADX INFO: renamed from: a */
    public static n61 m7407a(m61 m61Var) {
        l61 l61VarM8538A = n61.m8538A();
        byte[] bArrM11250c = m61Var.f24683v.m11250c();
        o50 o50VarM10980d = t50.m10980d(bArrM11250c, 0, bArrM11250c.length);
        l61VarM8538A.m9631e();
        ((n61) l61VarM8538A.f27912b).m8542D(o50VarM10980d);
        return (n61) l61VarM8538A.m9628b();
    }
}
