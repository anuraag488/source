package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o70 implements InterfaceC0517c7 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f26403a = i25.m6624s("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: b */
    public static final byte[] f26404b = i25.m6624s("070000004041424344454647");

    /* JADX INFO: renamed from: c */
    public static final byte[] f26405c = i25.m6624s("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: a */
    public static Cipher m8976a() {
        Cipher cipher = (Cipher) n81.f25513b.f25518a.mo3139g("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f26404b);
            byte[] bArr = f26403a;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f26405c;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        xy4.m12788q("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }
}
