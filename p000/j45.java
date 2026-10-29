package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class j45 {

    /* JADX INFO: renamed from: a */
    public static final x73 f22014a;

    /* JADX INFO: renamed from: b */
    public static final v73 f22015b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f22016c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f22017d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f22014a = x73.m12526a(new xy4((byte) 11), i45.class);
        f22015b = v73.m11756a(new xy4((byte) 12), u50VarM13266c);
        f22016c = fd2.m5692a(new xy4((byte) 13), f45.class);
        f22017d = dd2.m4479a(new xy4((byte) 14), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static j63 m7001a(C0973o7 c0973o7) throws GeneralSecurityException {
        if (C0973o7.f26374A == c0973o7) {
            return j63.f22045c;
        }
        if (C0973o7.f26375B == c0973o7) {
            return j63.f22048f;
        }
        if (C0973o7.f26376C == c0973o7) {
            return j63.f22047e;
        }
        xd2.m12666m(c0973o7, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0973o7 m7002b(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0973o7.f26374A;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C0973o7.f26376C;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
            }
        }
        return C0973o7.f26375B;
    }
}
