package p000;

import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj3 {

    /* JADX INFO: renamed from: a */
    public static final C0753i8 f25889a = new C0753i8(8);

    /* JADX INFO: renamed from: a */
    public static byte[] m8784a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f25889a.get()).nextBytes(bArr);
        return bArr;
    }
}
