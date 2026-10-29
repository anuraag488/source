package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1174t9 {

    /* JADX INFO: renamed from: a */
    public static final x73 f31002a;

    /* JADX INFO: renamed from: b */
    public static final v73 f31003b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f31004c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f31005d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f31002a = x73.m12526a(new C0670g((byte) 25), C1137s9.class);
        f31003b = v73.m11756a(new C0670g((byte) 26), u50VarM13266c);
        f31004c = fd2.m5692a(new C0670g((byte) 27), C0975o9.class);
        f31005d = dd2.m4479a(new C0670g((byte) 28), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static j63 m10992a(C0641f8 c0641f8) throws GeneralSecurityException {
        if (C0641f8.f18810k == c0641f8) {
            return j63.f22045c;
        }
        if (C0641f8.f18811l == c0641f8) {
            return j63.f22048f;
        }
        if (C0641f8.f18812m == c0641f8) {
            return j63.f22047e;
        }
        xd2.m12666m(c0641f8, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0641f8 m10993b(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0641f8.f18810k;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C0641f8.f18812m;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
            }
        }
        return C0641f8.f18811l;
    }
}
