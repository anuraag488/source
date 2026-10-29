package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class kj2 {

    /* JADX INFO: renamed from: a */
    public static final x73 f23166a;

    /* JADX INFO: renamed from: b */
    public static final v73 f23167b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f23168c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f23169d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f23166a = x73.m12526a(new xd2((byte) 6), jj2.class);
        f23167b = v73.m11756a(new xd2((byte) 7), u50VarM13266c);
        f23168c = fd2.m5692a(new xd2((byte) 8), ij2.class);
        f23169d = dd2.m4479a(new xd2((byte) 9), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static j63 m7525a(C0973o7 c0973o7) throws GeneralSecurityException {
        if (C0973o7.f26397w == c0973o7) {
            return j63.f22045c;
        }
        if (C0973o7.f26398x == c0973o7) {
            return j63.f22047e;
        }
        xd2.m12666m(c0973o7, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0973o7 m7526b(j63 j63Var) {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0973o7.f26397w;
        }
        if (iOrdinal == 3) {
            return C0973o7.f26398x;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
    }
}
