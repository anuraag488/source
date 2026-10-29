package p000;

import android.os.Build;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dt3 implements ei3 {

    /* JADX INFO: renamed from: g */
    public static final byte[] f17371g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final byte[] f17372h = {0};

    /* JADX INFO: renamed from: a */
    public RSAPublicKey f17373a;

    /* JADX INFO: renamed from: b */
    public String f17374b;

    /* JADX INFO: renamed from: c */
    public PSSParameterSpec f17375c;

    /* JADX INFO: renamed from: d */
    public byte[] f17376d;

    /* JADX INFO: renamed from: e */
    public byte[] f17377e;

    /* JADX INFO: renamed from: f */
    public Provider f17378f;

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: b */
    public static dt3 m4726b(zs3 zs3Var) throws GeneralSecurityException {
        Provider providerM13360S;
        int i = yv4.f35553a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            if ((!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() <= 23) {
                providerM13360S = null;
            } else {
                providerM13360S = z62.m13360S();
            }
        } else {
            providerM13360S = z62.m13360S();
        }
        if (providerM13360S == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerM13360S);
        BigInteger bigInteger = zs3Var.f36343v;
        rs3 rs3Var = zs3Var.f36342u;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, rs3Var.f29583b));
        ps3 ps3Var = rs3Var.f29585d;
        ps3 ps3Var2 = rs3Var.f29586e;
        int i2 = rs3Var.f29587f;
        byte[] bArrM11250c = zs3Var.f36344w.m11250c();
        byte[] bArr = rs3Var.f29584c.equals(qs3.f28763d) ? f17372h : f17371g;
        dt3 dt3Var = new dt3();
        if (!zi4.m13604d(2)) {
            xy4.m12788q("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        if (!ps3Var.equals(ps3Var2)) {
            xy4.m12788q("sigHash and mgf1Hash must be the same");
            return null;
        }
        kw4.m7670b(rSAPublicKey.getModulus().bitLength());
        kw4.m7671c(rSAPublicKey.getPublicExponent());
        dt3Var.f17373a = rSAPublicKey;
        dt3Var.f17374b = m4727c(ps3Var);
        dt3Var.f17375c = m4728d(ps3Var, ps3Var2, i2);
        dt3Var.f17376d = bArrM11250c;
        dt3Var.f17377e = bArr;
        dt3Var.f17378f = providerM13360S;
        VarHandle.storeStoreFence();
        return dt3Var;
    }

    /* JADX INFO: renamed from: c */
    public static String m4727c(ps3 ps3Var) {
        if (ps3Var == ps3.f27947b) {
            return "SHA256withRSA/PSS";
        }
        if (ps3Var == ps3.f27948c) {
            return "SHA384withRSA/PSS";
        }
        if (ps3Var == ps3.f27949d) {
            return "SHA512withRSA/PSS";
        }
        wb1.m12195o(ps3Var, "Unsupported hash: ");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static PSSParameterSpec m4728d(ps3 ps3Var, ps3 ps3Var2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        ps3 ps3Var3 = ps3.f27949d;
        ps3 ps3Var4 = ps3.f27948c;
        ps3 ps3Var5 = ps3.f27947b;
        if (ps3Var == ps3Var5) {
            str = "SHA-256";
        } else if (ps3Var == ps3Var4) {
            str = "SHA-384";
        } else {
            if (ps3Var != ps3Var3) {
                wb1.m12195o(ps3Var, "Unsupported MD hash: ");
                return null;
            }
            str = "SHA-512";
        }
        if (ps3Var2 == ps3Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (ps3Var2 == ps3Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (ps3Var2 != ps3Var3) {
                wb1.m12195o(ps3Var2, "Unsupported MGF1 hash: ");
                return null;
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    @Override // p000.ei3
    /* JADX INFO: renamed from: a */
    public final void mo4729a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f17376d;
        if (!yv4.m13265b(bArr3, bArr)) {
            xy4.m12788q("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.f17374b, this.f17378f);
        signature.initVerify(this.f17373a);
        signature.setParameter(this.f17375c);
        signature.update(bArr2);
        byte[] bArr4 = this.f17377e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        if (signature.verify(bArr, bArr3.length, bArr.length - bArr3.length)) {
            return;
        }
        xy4.m12788q("signature verification failed");
    }
}
