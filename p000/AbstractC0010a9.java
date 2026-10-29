package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: a9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0010a9 {

    /* JADX INFO: renamed from: a */
    public static final x73 f171a;

    /* JADX INFO: renamed from: b */
    public static final v73 f172b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f173c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f174d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f171a = x73.m12526a(new C0670g((byte) 15), C1322x8.class);
        f172b = v73.m11756a(new C0670g((byte) 16), u50VarM13266c);
        f173c = fd2.m5692a(new C0670g((byte) 17), C1173t8.class);
        f174d = dd2.m4479a(new C0670g((byte) 18), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static C1396z8 m142a(C1322x8 c1322x8) {
        if (c1322x8.f34056c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c1322x8.f34056c)));
        }
        C1359y8 c1359y8M13447z = C1396z8.m13447z();
        int i = c1322x8.f34055b;
        c1359y8M13447z.m9631e();
        ((C1396z8) c1359y8M13447z.f27912b).m13448A(i);
        return (C1396z8) c1359y8M13447z.m9628b();
    }

    /* JADX INFO: renamed from: b */
    public static j63 m143b(C0641f8 c0641f8) throws GeneralSecurityException {
        if (C0641f8.f18807h == c0641f8) {
            return j63.f22045c;
        }
        if (C0641f8.f18808i == c0641f8) {
            return j63.f22048f;
        }
        if (C0641f8.f18809j == c0641f8) {
            return j63.f22047e;
        }
        xd2.m12666m(c0641f8, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C0641f8 m144c(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0641f8.f18807h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C0641f8.f18809j;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
            }
        }
        return C0641f8.f18808i;
    }
}
