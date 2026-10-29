package p000;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class c45 {

    /* JADX INFO: renamed from: a */
    public static final x73 f15802a;

    /* JADX INFO: renamed from: b */
    public static final v73 f15803b;

    /* JADX INFO: renamed from: c */
    public static final fd2 f15804c;

    /* JADX INFO: renamed from: d */
    public static final dd2 f15805d;

    static {
        u50 u50VarM13266c = yv4.m13266c("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f15802a = x73.m12526a(new xy4((byte) 6), z35.class);
        f15803b = v73.m11756a(new xy4((byte) 7), u50VarM13266c);
        f15804c = fd2.m5692a(new xy4((byte) 8), v35.class);
        f15805d = dd2.m4479a(new xy4((byte) 9), u50VarM13266c);
    }

    /* JADX INFO: renamed from: a */
    public static j63 m3841a(C0641f8 c0641f8) throws GeneralSecurityException {
        if (c0641f8 == C0641f8.f18824y) {
            return j63.f22045c;
        }
        if (c0641f8 == C0641f8.f18825z) {
            return j63.f22047e;
        }
        xd2.m12666m(c0641f8, "Unable to serialize variant: ");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0641f8 m3842b(j63 j63Var) throws GeneralSecurityException {
        int iOrdinal = j63Var.ordinal();
        if (iOrdinal == 1) {
            return C0641f8.f18824y;
        }
        if (iOrdinal == 3) {
            return C0641f8.f18825z;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + j63Var.m7024b());
    }
}
