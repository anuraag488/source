package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: u7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1209u7 {

    /* JADX INFO: renamed from: a */
    public static final x73 f31687a;

    /* JADX INFO: renamed from: b */
    public static final v73 f31688b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f31689c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f31690d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f31687a = x73.m12526a(new C0670g((byte) 5), C1024p7.class);
        f31688b = v73.m11756a(new C0670g((byte) 6), u50VarM13266c);
        f31689c = fd2.m5692a(new C0670g((byte) 7), C0825k7.class);
        f31690d = dd2.m4479a(new C0670g((byte) 8), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static j63 m11269a(C0973o7 c0973o7) throws GeneralSecurityException {
        if (C0973o7.f26377c == c0973o7) {
            return j63.f22045c;
        }
        if (C0973o7.f26378d == c0973o7) {
            return j63.f22048f;
        }
        if (C0973o7.f26380f == c0973o7) {
            return j63.f22047e;
        }
        if (C0973o7.f26379e == c0973o7) {
            return j63.f22046d;
        }
        xd2.m12666m(c0973o7, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0973o7 m11270b(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0973o7.f26377c;
        }
        if (iOrdinal == 2) {
            return C0973o7.f26379e;
        }
        if (iOrdinal == 3) {
            return C0973o7.f26380f;
        }
        if (iOrdinal == 4) {
            return C0973o7.f26378d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
    }
}
