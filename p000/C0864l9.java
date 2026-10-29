package p000;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l9 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0864l9 implements InterfaceC0517c7 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f23861a = i25.m6624s("7a806c");

    /* JADX INFO: renamed from: b */
    public static final byte[] f23862b = i25.m6624s("46bb91c3c5");

    /* JADX INFO: renamed from: c */
    public static final byte[] f23863c = i25.m6624s("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: d */
    public static final byte[] f23864d = i25.m6624s("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: e */
    public static final byte[] f23865e = i25.m6624s("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a */
    public static boolean m7873a(Cipher cipher) {
        try {
            byte[] bArr = f23864d;
            cipher.init(2, new SecretKeySpec(f23863c, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f23862b);
            byte[] bArr2 = f23865e;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f23861a);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
