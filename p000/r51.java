package p000;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class r51 {

    /* JADX INFO: renamed from: a */
    public static final x73 f29020a;

    /* JADX INFO: renamed from: b */
    public static final v73 f29021b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f29022c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f29023d;

    /* JADX INFO: renamed from: e */
    public static final fd2 f29024e;

    /* JADX INFO: renamed from: f */
    public static final dd2 f29025f;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        u50 u50VarM13266c2 = yv4.m13266c("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f29020a = x73.m12526a(new nm0((byte) 13), l51.class);
        f29021b = v73.m11756a(new nm0((byte) 14), u50VarM13266c);
        f29022c = fd2.m5692a(new nm0((byte) 15), t51.class);
        f29023d = dd2.m4479a(new nm0((byte) 16), u50VarM13266c2);
        f29024e = fd2.m5692a(new nm0((byte) 17), p51.class);
        f29025f = dd2.m4479a(new nm0((byte) 18), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static int m10208a(k51 k51Var) {
        if (k51.f22897c.equals(k51Var)) {
            return 33;
        }
        if (k51.f22898d.equals(k51Var)) {
            return 49;
        }
        if (k51.f22899e.equals(k51Var)) {
            return 67;
        }
        xd2.m12666m(k51Var, "Unable to serialize CurveType ");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static n51 m10209b(l51 l51Var) {
        pv1 pv1Var;
        g71 g71Var;
        x51 x51Var;
        m51 m51VarM8528B = n51.m8528B();
        C0973o7 c0973o7 = l51Var.f23794c;
        if (C0973o7.f26390p == c0973o7) {
            pv1Var = pv1.f28022e;
        } else if (C0973o7.f26391q == c0973o7) {
            pv1Var = pv1.f28021d;
        } else {
            if (C0973o7.f26392r != c0973o7) {
                xd2.m12666m(c0973o7, "Unable to serialize HashType ");
                return null;
            }
            pv1Var = pv1.f28023f;
        }
        m51VarM8528B.m9631e();
        ((n51) m51VarM8528B.f27912b).m8533E(pv1Var);
        k51 k51Var = l51Var.f23793b;
        if (k51.f22897c.equals(k51Var)) {
            g71Var = g71.f19628c;
        } else if (k51.f22898d.equals(k51Var)) {
            g71Var = g71.f19629d;
        } else {
            if (!k51.f22899e.equals(k51Var)) {
                xd2.m12666m(k51Var, "Unable to serialize CurveType ");
                return null;
            }
            g71Var = g71.f19630e;
        }
        m51VarM8528B.m9631e();
        ((n51) m51VarM8528B.f27912b).m8531C(g71Var);
        C0641f8 c0641f8 = l51Var.f23792a;
        if (C0641f8.f18813n == c0641f8) {
            x51Var = x51.f34008c;
        } else {
            if (C0641f8.f18814o != c0641f8) {
                xd2.m12666m(c0641f8, "Unable to serialize SignatureEncoding ");
                return null;
            }
            x51Var = x51.f34009d;
        }
        m51VarM8528B.m9631e();
        ((n51) m51VarM8528B.f27912b).m8532D(x51Var);
        return (n51) m51VarM8528B.m9628b();
    }

    /* JADX INFO: renamed from: c */
    public static u51 m10210c(t51 t51Var) {
        int iM10208a = m10208a(t51Var.f30785u.f23793b);
        ECPoint eCPoint = t51Var.f30786v;
        s51 s51VarM11251C = u51.m11251C();
        n51 n51VarM10209b = m10209b(t51Var.f30785u);
        s51VarM11251C.m9631e();
        ((u51) s51VarM11251C.f27912b).m11257F(n51VarM10209b);
        byte[] bArrM5372v0 = ev0.m5372v0(eCPoint.getAffineX(), iM10208a);
        o50 o50VarM10980d = t50.m10980d(bArrM5372v0, 0, bArrM5372v0.length);
        s51VarM11251C.m9631e();
        ((u51) s51VarM11251C.f27912b).m11258G(o50VarM10980d);
        byte[] bArrM5372v1 = ev0.m5372v0(eCPoint.getAffineY(), iM10208a);
        o50 o50VarM10980d2 = t50.m10980d(bArrM5372v1, 0, bArrM5372v1.length);
        s51VarM11251C.m9631e();
        ((u51) s51VarM11251C.f27912b).m11259H(o50VarM10980d2);
        return (u51) s51VarM11251C.m9628b();
    }

    /* JADX INFO: renamed from: d */
    public static k51 m10211d(g71 g71Var) throws GeneralSecurityException {
        int iOrdinal = g71Var.ordinal();
        if (iOrdinal == 1) {
            return k51.f22897c;
        }
        if (iOrdinal == 2) {
            return k51.f22898d;
        }
        if (iOrdinal == 3) {
            return k51.f22899e;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + g71Var.m5908a());
    }

    /* JADX INFO: renamed from: e */
    public static C0973o7 m10212e(pv1 pv1Var) throws GeneralSecurityException {
        int iOrdinal = pv1Var.ordinal();
        if (iOrdinal == 2) {
            return C0973o7.f26391q;
        }
        if (iOrdinal == 3) {
            return C0973o7.f26390p;
        }
        if (iOrdinal == 4) {
            return C0973o7.f26392r;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + pv1Var.m9681b());
    }

    /* JADX INFO: renamed from: f */
    public static j63 m10213f(C0973o7 c0973o7) throws GeneralSecurityException {
        if (C0973o7.f26393s == c0973o7) {
            return j63.f22045c;
        }
        if (C0973o7.f26394t == c0973o7) {
            return j63.f22048f;
        }
        if (C0973o7.f26396v == c0973o7) {
            return j63.f22047e;
        }
        if (C0973o7.f26395u == c0973o7) {
            return j63.f22046d;
        }
        xd2.m12666m(c0973o7, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static C0641f8 m10214g(x51 x51Var) throws GeneralSecurityException {
        int iOrdinal = x51Var.ordinal();
        if (iOrdinal == 1) {
            return C0641f8.f18813n;
        }
        if (iOrdinal == 2) {
            return C0641f8.f18814o;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + x51Var.m12483a());
    }

    /* JADX INFO: renamed from: h */
    public static C0973o7 m10215h(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0973o7.f26393s;
        }
        if (iOrdinal == 2) {
            return C0973o7.f26395u;
        }
        if (iOrdinal == 3) {
            return C0973o7.f26396v;
        }
        if (iOrdinal == 4) {
            return C0973o7.f26394t;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
    }
}
