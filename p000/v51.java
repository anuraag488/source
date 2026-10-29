package p000;

import android.os.Build;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v51 implements ci3 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f32415a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final byte[] f32416b = {0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f32417c = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    /* JADX INFO: renamed from: d */
    public static final byte[] f32418d = new byte[0];

    /* JADX INFO: renamed from: e */
    public static final byte[] f32419e = {0};

    /* JADX INFO: renamed from: a */
    public static v51 m11748a(h61 h61Var) throws GeneralSecurityException {
        Provider providerM13360S = z62.m13360S();
        if (providerM13360S == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        byte[] bArrM11250c = ((u50) h61Var.f20407v.f33259b).m11250c();
        h61Var.m11754k0().m11250c();
        v51 v51Var = new v51();
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        if (bArrM11250c.length != 32) {
            C1077qn.m9987m("Given private key's length is not 32");
            return null;
        }
        KeyFactory.getInstance("Ed25519", providerM13360S).generatePrivate(new PKCS8EncodedKeySpec(zc6.m13537w(f32417c, bArrM11250c)));
        VarHandle.storeStoreFence();
        return v51Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: b */
    public static v51 m11749b(vs3 vs3Var) throws GeneralSecurityException {
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
        rs3 rs3Var = vs3Var.f32834u.f36342u;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(vs3Var.f32834u.f36343v, rs3Var.f29583b, (BigInteger) vs3Var.f32835v.f33090b, (BigInteger) vs3Var.f32836w.f33090b, (BigInteger) vs3Var.f32837x.f33090b, (BigInteger) vs3Var.f32838y.f33090b, (BigInteger) vs3Var.f32839z.f33090b, (BigInteger) vs3Var.f32833A.f33090b));
        ps3 ps3Var = rs3Var.f29585d;
        ps3 ps3Var2 = rs3Var.f29586e;
        int i2 = rs3Var.f29587f;
        vs3Var.m11754k0().m11250c();
        rs3Var.f29584c.equals(qs3.f28763d);
        v51 v51Var = new v51();
        if (!zi4.m13604d(2)) {
            xy4.m12788q("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        kw4.m7670b(rSAPrivateCrtKey.getModulus().bitLength());
        kw4.m7671c(rSAPrivateCrtKey.getPublicExponent());
        dt3.m4727c(ps3Var);
        dt3.m4728d(ps3Var, ps3Var2, i2);
        VarHandle.storeStoreFence();
        return v51Var;
    }
}
