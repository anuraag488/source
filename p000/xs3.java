package p000;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xs3 {

    /* JADX INFO: renamed from: a */
    public static final x73 f34590a;

    /* JADX INFO: renamed from: b */
    public static final v73 f34591b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f34592c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f34593d;

    /* JADX INFO: renamed from: e */
    public static final fd2 f34594e;

    /* JADX INFO: renamed from: f */
    public static final dd2 f34595f;

    /* JADX INFO: renamed from: g */
    public static final nh3 f34596g;

    /* JADX INFO: renamed from: h */
    public static final nh3 f34597h;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        u50 u50VarM13266c2 = yv4.m13266c("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f34590a = x73.m12526a(new ds3((byte) 3), rs3.class);
        f34591b = v73.m11756a(new ds3((byte) 4), u50VarM13266c);
        f34592c = fd2.m5692a(new ds3((byte) 5), zs3.class);
        f34593d = dd2.m4479a(new ds3((byte) 6), u50VarM13266c2);
        f34594e = fd2.m5692a(new ds3((byte) 7), vs3.class);
        f34595f = dd2.m4479a(new ds3((byte) 8), u50VarM13266c);
        z91 z91VarM8733k = nh3.m8733k();
        z91VarM8733k.m13454a(j63.f22047e, qs3.f28764e);
        z91VarM8733k.m13454a(j63.f22045c, qs3.f28761b);
        z91VarM8733k.m13454a(j63.f22048f, qs3.f28762c);
        z91VarM8733k.m13454a(j63.f22046d, qs3.f28763d);
        f34596g = z91VarM8733k.m13456c();
        z91 z91VarM8733k2 = nh3.m8733k();
        z91VarM8733k2.m13454a(pv1.f28022e, ps3.f27947b);
        z91VarM8733k2.m13454a(pv1.f28021d, ps3.f27948c);
        z91VarM8733k2.m13454a(pv1.f28023f, ps3.f27949d);
        f34597h = z91VarM8733k2.m13456c();
    }

    /* JADX INFO: renamed from: a */
    public static w42 m12755a(t50 t50Var) {
        return w42.m12081j(ev0.m5351a0(t50Var.m10981l()));
    }

    /* JADX INFO: renamed from: b */
    public static o50 m12756b(BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            C1077qn.m9987m("n must not be negative");
            return null;
        }
        byte[] byteArray = bigInteger.toByteArray();
        o50 o50Var = t50.f30782b;
        return t50.m10980d(byteArray, 0, byteArray.length);
    }

    /* JADX INFO: renamed from: c */
    public static ts3 m12757c(rs3 rs3Var) {
        ss3 ss3VarM11121B = ts3.m11121B();
        ps3 ps3Var = rs3Var.f29585d;
        nh3 nh3Var = f34597h;
        pv1 pv1Var = (pv1) nh3Var.m8745L(ps3Var);
        ss3VarM11121B.m9631e();
        ((ts3) ss3VarM11121B.f27912b).m11126E(pv1Var);
        pv1 pv1Var2 = (pv1) nh3Var.m8745L(rs3Var.f29586e);
        ss3VarM11121B.m9631e();
        ((ts3) ss3VarM11121B.f27912b).m11124C(pv1Var2);
        int i = rs3Var.f29587f;
        ss3VarM11121B.m9631e();
        ((ts3) ss3VarM11121B.f27912b).m11125D(i);
        return (ts3) ss3VarM11121B.m9628b();
    }

    /* JADX INFO: renamed from: d */
    public static at3 m12758d(zs3 zs3Var) {
        ys3 ys3VarM3296C = at3.m3296C();
        ts3 ts3VarM12757c = m12757c(zs3Var.f36342u);
        ys3VarM3296C.m9631e();
        ((at3) ys3VarM3296C.f27912b).m3304H(ts3VarM12757c);
        o50 o50VarM12756b = m12756b(zs3Var.f36343v);
        ys3VarM3296C.m9631e();
        ((at3) ys3VarM3296C.f27912b).m3303G(o50VarM12756b);
        o50 o50VarM12756b2 = m12756b(zs3Var.f36342u.f29583b);
        ys3VarM3296C.m9631e();
        ((at3) ys3VarM3296C.f27912b).m3302F(o50VarM12756b2);
        ys3VarM3296C.m9631e();
        ((at3) ys3VarM3296C.f27912b).m3305I();
        return (at3) ys3VarM3296C.m9628b();
    }
}
