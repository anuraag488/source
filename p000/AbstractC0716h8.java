package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: h8 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0716h8 {

    /* JADX INFO: renamed from: a */
    public static final x73 f20419a;

    /* JADX INFO: renamed from: b */
    public static final v73 f20420b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f20421c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f20422d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f20419a = x73.m12526a(new C0670g((byte) 10), C0679g8.class);
        f20420b = v73.m11756a(new C0670g((byte) 11), u50VarM13266c);
        f20421c = fd2.m5692a(new C0670g((byte) 12), C1358y7.class);
        f20422d = dd2.m4479a(new C0670g((byte) 13), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static bx1 m6276a(C0679g8 c0679g8) {
        pv1 pv1Var;
        ax1 ax1VarM3753A = bx1.m3753A();
        int i = c0679g8.f19650d;
        ax1VarM3753A.m9631e();
        ((bx1) ax1VarM3753A.f27912b).m3756C(i);
        C0641f8 c0641f8 = c0679g8.f19652f;
        if (C0641f8.f18802c == c0641f8) {
            pv1Var = pv1.f28020c;
        } else if (C0641f8.f18803d == c0641f8) {
            pv1Var = pv1.f28024g;
        } else if (C0641f8.f18804e == c0641f8) {
            pv1Var = pv1.f28022e;
        } else if (C0641f8.f18805f == c0641f8) {
            pv1Var = pv1.f28021d;
        } else {
            if (C0641f8.f18806g != c0641f8) {
                xd2.m12666m(c0641f8, "Unable to serialize HashType ");
                return null;
            }
            pv1Var = pv1.f28023f;
        }
        ax1VarM3753A.m9631e();
        ((bx1) ax1VarM3753A.f27912b).m3755B(pv1Var);
        return (bx1) ax1VarM3753A.m9628b();
    }

    /* JADX INFO: renamed from: b */
    public static C0641f8 m6277b(pv1 pv1Var) throws GeneralSecurityException {
        int iOrdinal = pv1Var.ordinal();
        if (iOrdinal == 1) {
            return C0641f8.f18802c;
        }
        if (iOrdinal == 2) {
            return C0641f8.f18805f;
        }
        if (iOrdinal == 3) {
            return C0641f8.f18804e;
        }
        if (iOrdinal == 4) {
            return C0641f8.f18806g;
        }
        if (iOrdinal == 5) {
            return C0641f8.f18803d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + pv1Var.m9681b());
    }

    /* JADX INFO: renamed from: c */
    public static j63 m6278c(C0973o7 c0973o7) throws GeneralSecurityException {
        if (C0973o7.f26381g == c0973o7) {
            return j63.f22045c;
        }
        if (C0973o7.f26382h == c0973o7) {
            return j63.f22048f;
        }
        if (C0973o7.f26383i == c0973o7) {
            return j63.f22047e;
        }
        xd2.m12666m(c0973o7, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static C0973o7 m6279d(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0973o7.f26381g;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C0973o7.f26383i;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
            }
        }
        return C0973o7.f26382h;
    }
}
