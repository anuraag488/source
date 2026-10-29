package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class w70 {

    /* JADX INFO: renamed from: a */
    public static final x73 f33130a;

    /* JADX INFO: renamed from: b */
    public static final v73 f33131b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f33132c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f33133d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f33130a = x73.m12526a(new C1077qn((byte) 9), v70.class);
        f33131b = v73.m11756a(new C1077qn((byte) 10), u50VarM13266c);
        f33132c = fd2.m5692a(new C1077qn((byte) 11), r70.class);
        f33133d = dd2.m4479a(new C1077qn((byte) 12), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static j63 m12151a(C0973o7 c0973o7) {
        if (C0973o7.f26387m == c0973o7) {
            return j63.f22045c;
        }
        if (C0973o7.f26388n == c0973o7) {
            return j63.f22048f;
        }
        if (C0973o7.f26389o == c0973o7) {
            return j63.f22047e;
        }
        xd2.m12666m(c0973o7, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0973o7 m12152b(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0973o7.f26387m;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C0973o7.f26389o;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
            }
        }
        return C0973o7.f26388n;
    }
}
