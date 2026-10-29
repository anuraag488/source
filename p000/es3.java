package p000;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class es3 {

    /* JADX INFO: renamed from: a */
    public static final x73 f18431a;

    /* JADX INFO: renamed from: b */
    public static final v73 f18432b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f18433c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f18434d;

    /* JADX INFO: renamed from: e */
    public static final fd2 f18435e;

    /* JADX INFO: renamed from: f */
    public static final dd2 f18436f;

    /* JADX INFO: renamed from: g */
    public static final nh3 f18437g;

    /* JADX INFO: renamed from: h */
    public static final nh3 f18438h;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        u50 u50VarM13266c2 = yv4.m13266c("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f18431a = x73.m12526a(new xd2((byte) 25), xr3.class);
        f18432b = v73.m11756a(new xd2((byte) 26), u50VarM13266c);
        f18433c = fd2.m5692a(new xd2((byte) 27), gs3.class);
        f18434d = dd2.m4479a(new xd2((byte) 28), u50VarM13266c2);
        f18435e = fd2.m5692a(new xd2((byte) 29), bs3.class);
        f18436f = dd2.m4479a(new ds3((byte) 0), u50VarM13266c);
        z91 z91VarM8733k = nh3.m8733k();
        z91VarM8733k.m13454a(j63.f22047e, wr3.f33661e);
        z91VarM8733k.m13454a(j63.f22045c, wr3.f33658b);
        z91VarM8733k.m13454a(j63.f22048f, wr3.f33659c);
        z91VarM8733k.m13454a(j63.f22046d, wr3.f33660d);
        f18437g = z91VarM8733k.m13456c();
        z91 z91VarM8733k2 = nh3.m8733k();
        z91VarM8733k2.m13454a(pv1.f28022e, vr3.f32809b);
        z91VarM8733k2.m13454a(pv1.f28021d, vr3.f32810c);
        z91VarM8733k2.m13454a(pv1.f28023f, vr3.f32811d);
        f18438h = z91VarM8733k2.m13456c();
    }

    /* JADX INFO: renamed from: a */
    public static w42 m5319a(t50 t50Var) {
        return w42.m12081j(ev0.m5351a0(t50Var.m10981l()));
    }

    /* JADX INFO: renamed from: b */
    public static o50 m5320b(BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            C1077qn.m9987m("n must not be negative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        o50 o50Var = t50.f30782b;
        return t50.m10980d(byteArray, 0, byteArray.length);
    }

    /* JADX INFO: renamed from: c */
    public static hs3 m5321c(gs3 gs3Var) {
        fs3 fs3VarM6492C = hs3.m6492C();
        xr3 xr3Var = gs3Var.f20093u;
        yr3 yr3VarM13730z = zr3.m13730z();
        pv1 pv1Var = (pv1) f18438h.m8745L(xr3Var.f34567d);
        yr3VarM13730z.m9631e();
        ((zr3) yr3VarM13730z.f27912b).m13731A(pv1Var);
        zr3 zr3Var = (zr3) yr3VarM13730z.m9628b();
        fs3VarM6492C.m9631e();
        ((hs3) fs3VarM6492C.f27912b).m6500H(zr3Var);
        o50 o50VarM5320b = m5320b(gs3Var.f20094v);
        fs3VarM6492C.m9631e();
        ((hs3) fs3VarM6492C.f27912b).m6499G(o50VarM5320b);
        o50 o50VarM5320b2 = m5320b(gs3Var.f20093u.f34565b);
        fs3VarM6492C.m9631e();
        ((hs3) fs3VarM6492C.f27912b).m6498F(o50VarM5320b2);
        return (hs3) fs3VarM6492C.m9628b();
    }
}
