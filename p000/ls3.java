package p000;

import android.os.Build;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ls3 implements ei3 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f24331a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final byte[] f24332b = {0};

    /* JADX INFO: renamed from: c */
    public static final nh3 f24333c;

    static {
        z91 z91VarM8733k = nh3.m8733k();
        z91VarM8733k.m13454a(aa1.f204a, vr3.f32809b);
        z91VarM8733k.m13454a(aa1.f205b, vr3.f32810c);
        z91VarM8733k.m13454a(aa1.f206c, vr3.f32811d);
        f24333c = z91VarM8733k.m13456c();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d A[Catch: NoSuchProviderException -> 0x0040, TryCatch #0 {NoSuchProviderException -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0023, B:14:0x0033, B:16:0x0038, B:17:0x003f, B:8:0x001d, B:12:0x002d), top: B:28:0x0001 }] */
    /* JADX INFO: renamed from: b */
    public static ei3 m8103b(gs3 gs3Var) throws GeneralSecurityException {
        Provider providerM13360S;
        try {
            int i = yv4.f35553a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                if ((!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() <= 21) {
                    providerM13360S = null;
                } else {
                    providerM13360S = z62.m13360S();
                }
            } else {
                providerM13360S = z62.m13360S();
            }
            if (providerM13360S != null) {
                return ks3.m7592b(gs3Var, providerM13360S);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) n81.f25517f.f25518a.mo3139g("RSA");
            BigInteger bigInteger = gs3Var.f20094v;
            xr3 xr3Var = gs3Var.f20093u;
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, xr3Var.f34565b));
            aa1 aa1Var = (aa1) f24333c.m8745L(xr3Var.f34567d);
            byte[] bArrM11250c = gs3Var.f20095w.m11250c();
            byte[] bArr = xr3Var.f34566c.equals(wr3.f33660d) ? f24332b : f24331a;
            p61 p61Var = new p61((byte) 1);
            if (cn4.m4052a()) {
                xy4.m12788q("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
                return null;
            }
            kw4.m7672d(aa1Var);
            kw4.m7670b(rSAPublicKey.getModulus().bitLength());
            kw4.m7671c(rSAPublicKey.getPublicExponent());
            p61Var.f27397d = rSAPublicKey;
            p61Var.f27398e = aa1Var;
            p61Var.f27395b = bArrM11250c;
            p61Var.f27396c = bArr;
            VarHandle.storeStoreFence();
            return p61Var;
        }
    }
}
