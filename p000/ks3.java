package p000;

import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ks3 implements ei3 {

    /* JADX INFO: renamed from: f */
    public static final byte[] f23384f = new byte[0];

    /* JADX INFO: renamed from: g */
    public static final byte[] f23385g = {0};

    /* JADX INFO: renamed from: a */
    public RSAPublicKey f23386a;

    /* JADX INFO: renamed from: b */
    public String f23387b;

    /* JADX INFO: renamed from: c */
    public byte[] f23388c;

    /* JADX INFO: renamed from: d */
    public byte[] f23389d;

    /* JADX INFO: renamed from: e */
    public Provider f23390e;

    /* JADX INFO: renamed from: b */
    public static ks3 m7592b(gs3 gs3Var, Provider provider) throws GeneralSecurityException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = gs3Var.f20094v;
        xr3 xr3Var = gs3Var.f20093u;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, xr3Var.f34565b));
        vr3 vr3Var = xr3Var.f34567d;
        byte[] bArrM11250c = gs3Var.f20095w.m11250c();
        byte[] bArr = xr3Var.f34566c.equals(wr3.f33660d) ? f23385g : f23384f;
        ks3 ks3Var = new ks3();
        if (!zi4.m13604d(2)) {
            xy4.m12788q("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        kw4.m7670b(rSAPublicKey.getModulus().bitLength());
        kw4.m7671c(rSAPublicKey.getPublicExponent());
        ks3Var.f23386a = rSAPublicKey;
        ks3Var.f23387b = m7593c(vr3Var);
        ks3Var.f23388c = bArrM11250c;
        ks3Var.f23389d = bArr;
        ks3Var.f23390e = provider;
        VarHandle.storeStoreFence();
        return ks3Var;
    }

    /* JADX INFO: renamed from: c */
    public static String m7593c(vr3 vr3Var) throws GeneralSecurityException {
        if (vr3Var == vr3.f32809b) {
            return "SHA256withRSA";
        }
        if (vr3Var == vr3.f32810c) {
            return "SHA384withRSA";
        }
        if (vr3Var == vr3.f32811d) {
            return "SHA512withRSA";
        }
        xy4.m12788q("unknown hash type");
        return null;
    }

    @Override // p000.ei3
    /* JADX INFO: renamed from: a */
    public final void mo4729a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        byte[] bArr3 = this.f23388c;
        if (!yv4.m13265b(bArr3, bArr)) {
            xy4.m12788q("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.f23387b, this.f23390e);
        signature.initVerify(this.f23386a);
        signature.update(bArr2);
        byte[] bArr4 = this.f23389d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            zVerify = signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length));
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (zVerify) {
            return;
        }
        xy4.m12788q("Invalid signature");
    }
}
