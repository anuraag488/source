package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y51 implements ei3 {

    /* JADX INFO: renamed from: g */
    public static final byte[] f34899g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final byte[] f34900h = {0};

    /* JADX INFO: renamed from: i */
    public static final nh3 f34901i;

    /* JADX INFO: renamed from: j */
    public static final nh3 f34902j;

    /* JADX INFO: renamed from: k */
    public static final nh3 f34903k;

    /* JADX INFO: renamed from: a */
    public ECPublicKey f34904a;

    /* JADX INFO: renamed from: b */
    public String f34905b;

    /* JADX INFO: renamed from: c */
    public i71 f34906c;

    /* JADX INFO: renamed from: d */
    public byte[] f34907d;

    /* JADX INFO: renamed from: e */
    public byte[] f34908e;

    /* JADX INFO: renamed from: f */
    public Provider f34909f;

    static {
        z91 z91VarM8733k = nh3.m8733k();
        z91VarM8733k.m13454a(aa1.f204a, C0973o7.f26390p);
        z91VarM8733k.m13454a(aa1.f205b, C0973o7.f26391q);
        z91VarM8733k.m13454a(aa1.f206c, C0973o7.f26392r);
        f34901i = z91VarM8733k.m13456c();
        z91 z91VarM8733k2 = nh3.m8733k();
        z91VarM8733k2.m13454a(i71.f21150a, C0641f8.f18813n);
        z91VarM8733k2.m13454a(i71.f21151b, C0641f8.f18814o);
        f34902j = z91VarM8733k2.m13456c();
        z91 z91VarM8733k3 = nh3.m8733k();
        z91VarM8733k3.m13454a(h71.f20413a, k51.f22897c);
        z91VarM8733k3.m13454a(h71.f20414b, k51.f22898d);
        z91VarM8733k3.m13454a(h71.f20415c, k51.f22899e);
        f34903k = z91VarM8733k3.m13456c();
    }

    @Override // p000.ei3
    /* JADX INFO: renamed from: a */
    public final void mo4729a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f34907d;
        if (bArr3.length == 0) {
            m12934b(bArr, bArr2);
        } else if (yv4.m13265b(bArr3, bArr)) {
            m12934b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        } else {
            xy4.m12788q("Invalid signature (output prefix mismatch)");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12934b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int i;
        ECPublicKey eCPublicKey = this.f34904a;
        boolean zVerify = false;
        if (this.f34906c == i71.f21150a) {
            if (bArr.length != ((k71.m7415d(eCPublicKey.getParams().getCurve()).subtract(BigInteger.ONE).bitLength() + 7) / 8) * 2) {
                xy4.m12788q("Invalid signature");
                return;
            }
            if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
                xy4.m12788q("Invalid IEEE_P1363 encoding");
                return;
            }
            byte[] bArrM7739v0 = kx5.m7739v0(Arrays.copyOf(bArr, bArr.length / 2));
            byte[] bArrM7739v1 = kx5.m7739v0(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
            int length = bArrM7739v0.length + 4 + bArrM7739v1.length;
            if (length >= 128) {
                bArr3 = new byte[length + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) length;
                i = 3;
            } else {
                bArr3 = new byte[length + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) length;
                i = 2;
            }
            int i2 = i + 1;
            bArr3[i] = 2;
            int i3 = i + 2;
            bArr3[i2] = (byte) bArrM7739v0.length;
            System.arraycopy(bArrM7739v0, 0, bArr3, i3, bArrM7739v0.length);
            int length2 = i3 + bArrM7739v0.length;
            bArr3[length2] = 2;
            bArr3[length2 + 1] = (byte) bArrM7739v1.length;
            System.arraycopy(bArrM7739v1, 0, bArr3, length2 + 2, bArrM7739v1.length);
            bArr = bArr3;
        }
        if (!kx5.m7693X(bArr)) {
            xy4.m12788q("Invalid signature");
            return;
        }
        String str = this.f34905b;
        Provider provider = this.f34909f;
        Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) n81.f25515d.f25518a.mo3139g(str);
        signature.initVerify(eCPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.f34908e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            zVerify = signature.verify(bArr);
        } catch (RuntimeException unused) {
        }
        if (zVerify) {
            return;
        }
        xy4.m12788q("Invalid signature");
    }
}
