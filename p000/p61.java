package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p61 implements ei3 {

    /* JADX INFO: renamed from: f */
    public static final byte[] f27393f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27394a;

    /* JADX INFO: renamed from: b */
    public byte[] f27395b;

    /* JADX INFO: renamed from: c */
    public byte[] f27396c;

    /* JADX INFO: renamed from: d */
    public PublicKey f27397d;

    /* JADX INFO: renamed from: e */
    public Serializable f27398e;

    public /* synthetic */ p61(byte b) {
        this.f27394a = b;
    }

    /* JADX INFO: renamed from: b */
    public static p61 m9362b(m61 m61Var) throws GeneralSecurityException {
        Provider providerM13360S = z62.m13360S();
        if (providerM13360S == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        byte[] bArrM11250c = m61Var.f24683v.m11250c();
        byte[] bArrM11250c2 = m61Var.f24684w.m11250c();
        byte b = 0;
        byte[] bArr = m61Var.f24682u.f18783a != e61.f17838d ? new byte[0] : new byte[]{0};
        p61 p61Var = new p61(b);
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        if (bArrM11250c.length != 32) {
            C1077qn.m9987m("Given public key's length is not 32.");
            return null;
        }
        p61Var.f27397d = KeyFactory.getInstance("Ed25519", providerM13360S).generatePublic(new X509EncodedKeySpec(zc6.m13537w(f27393f, bArrM11250c)));
        p61Var.f27395b = bArrM11250c2;
        p61Var.f27396c = bArr;
        p61Var.f27398e = providerM13360S;
        VarHandle.storeStoreFence();
        return p61Var;
    }

    @Override // p000.ei3
    /* JADX INFO: renamed from: a */
    public final void mo4729a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        switch (this.f27394a) {
            case 0:
                int length = bArr.length;
                byte[] bArr3 = this.f27395b;
                if (length != bArr3.length + 64) {
                    xy4.m12788q("Invalid signature length: 64");
                } else if (!yv4.m13265b(bArr3, bArr)) {
                    xy4.m12788q("Invalid signature (output prefix mismatch)");
                } else {
                    Signature signature = Signature.getInstance("Ed25519", (Provider) this.f27398e);
                    signature.initVerify(this.f27397d);
                    signature.update(bArr2);
                    signature.update(this.f27396c);
                    try {
                        zVerify = signature.verify(bArr, bArr3.length, 64);
                    } catch (RuntimeException unused) {
                        zVerify = false;
                    }
                    if (!zVerify) {
                        xy4.m12788q("Signature check failed.");
                        break;
                    }
                }
                break;
            default:
                byte[] bArr4 = this.f27395b;
                if (bArr4.length == 0) {
                    m9363c(bArr, bArr2);
                } else if (!yv4.m13265b(bArr4, bArr)) {
                    xy4.m12788q("Invalid signature (output prefix mismatch)");
                } else {
                    m9363c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m9363c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrM6624s;
        aa1 aa1Var = (aa1) this.f27398e;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f27397d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            xy4.m12788q("invalid signature's length");
            return;
        }
        BigInteger bigIntegerM5351a0 = ev0.m5351a0(bArr);
        if (bigIntegerM5351a0.compareTo(modulus) >= 0) {
            xy4.m12788q("signature out of range");
            return;
        }
        byte[] bArrM5372v0 = ev0.m5372v0(bigIntegerM5351a0.modPow(publicExponent, modulus), iBitLength);
        kw4.m7672d(aa1Var);
        MessageDigest messageDigest = (MessageDigest) n81.f25516e.f25518a.mo3139g(gq6.m6073K(aa1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f27396c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = aa1Var.ordinal();
        int i = 2;
        if (iOrdinal == 2) {
            bArrM6624s = i25.m6624s("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrM6624s = i25.m6624s("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                xd2.m12666m(aa1Var, "Unsupported hash ");
                return;
            }
            bArrM6624s = i25.m6624s("3051300d060960864801650304020305000440");
        }
        int length = bArrM6624s.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            xy4.m12788q("intended encoded message length too short");
            return;
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i2 = 0;
        while (i2 < (iBitLength - length) - 3) {
            bArr4[i] = -1;
            i2++;
            i++;
        }
        int i3 = i + 1;
        bArr4[i] = 0;
        System.arraycopy(bArrM6624s, 0, bArr4, i3, bArrM6624s.length);
        System.arraycopy(bArrDigest, 0, bArr4, i3 + bArrM6624s.length, bArrDigest.length);
        if (MessageDigest.isEqual(bArrM5372v0, bArr4)) {
            return;
        }
        xy4.m12788q("invalid signature");
    }
}
