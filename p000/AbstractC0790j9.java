package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0790j9 {

    /* JADX INFO: renamed from: a */
    public static final x73 f22104a;

    /* JADX INFO: renamed from: b */
    public static final v73 f22105b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f22106c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f22107d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f22104a = x73.m12526a(new C0670g((byte) 20), C0754i9.class);
        f22105b = v73.m11756a(new C0670g((byte) 21), u50VarM13266c);
        f22106c = fd2.m5692a(new C0670g((byte) 22), C0603e9.class);
        f22107d = dd2.m4479a(new C0670g((byte) 23), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static j63 m7052a(C0973o7 c0973o7) throws GeneralSecurityException {
        if (C0973o7.f26384j == c0973o7) {
            return j63.f22045c;
        }
        if (C0973o7.f26385k == c0973o7) {
            return j63.f22048f;
        }
        if (C0973o7.f26386l == c0973o7) {
            return j63.f22047e;
        }
        xd2.m12666m(c0973o7, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0973o7 m7053b(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0973o7.f26384j;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C0973o7.f26386l;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
            }
        }
        return C0973o7.f26385k;
    }

    /* JADX INFO: renamed from: c */
    public static void m7054c(C0754i9 c0754i9) {
        int i = c0754i9.f21181c;
        int i2 = c0754i9.f21180b;
        if (i != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(c0754i9.f21181c)));
        }
        if (i2 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i2)));
        }
    }
}
