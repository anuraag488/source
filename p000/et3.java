package p000;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class et3 implements ei3 {

    /* JADX INFO: renamed from: a */
    public RSAPublicKey f18471a;

    /* JADX INFO: renamed from: b */
    public aa1 f18472b;

    /* JADX INFO: renamed from: c */
    public aa1 f18473c;

    /* JADX INFO: renamed from: d */
    public int f18474d;

    /* JADX INFO: renamed from: e */
    public byte[] f18475e;

    /* JADX INFO: renamed from: f */
    public byte[] f18476f;

    @Override // p000.ei3
    /* JADX INFO: renamed from: a */
    public final void mo4729a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f18475e;
        if (bArr3.length == 0) {
            m5326b(bArr, bArr2);
        } else if (yv4.m13265b(bArr3, bArr)) {
            m5326b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        } else {
            xy4.m12788q("Invalid signature (output prefix mismatch)");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5326b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f18471a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        int iBitLength2 = (modulus.bitLength() + 6) / 8;
        if (iBitLength != bArr.length) {
            xy4.m12788q("invalid signature's length");
            return;
        }
        BigInteger bigIntegerM5351a0 = ev0.m5351a0(bArr);
        if (bigIntegerM5351a0.compareTo(modulus) >= 0) {
            xy4.m12788q("signature out of range");
            return;
        }
        byte[] bArrM5372v0 = ev0.m5372v0(bigIntegerM5351a0.modPow(publicExponent, modulus), iBitLength2);
        byte b = 1;
        int iBitLength3 = modulus.bitLength() - 1;
        int i = this.f18474d;
        aa1 aa1Var = this.f18472b;
        kw4.m7672d(aa1Var);
        MessageDigest messageDigest = (MessageDigest) n81.f25516e.f25518a.mo3139g(gq6.m6073K(aa1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f18476f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrM5372v0.length;
        if (length < digestLength + i + 2) {
            xy4.m12788q("inconsistent");
            return;
        }
        if (bArrM5372v0[bArrM5372v0.length - 1] != -68) {
            xy4.m12788q("inconsistent");
            return;
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrM5372v0, i3);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM5372v0, bArrCopyOf.length, bArrCopyOf.length + digestLength);
        int i4 = 0;
        while (true) {
            byte b2 = b;
            int i5 = i4;
            long j = (((long) length) * 8) - ((long) iBitLength3);
            if (i4 < j) {
                if (((bArrCopyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) != 0) {
                    xy4.m12788q("inconsistent");
                    return;
                } else {
                    i4 = i5 + 1;
                    b = b2;
                }
            } else {
                aa1 aa1Var2 = this.f18473c;
                MessageDigest messageDigest2 = (MessageDigest) n81.f25516e.f25518a.mo3139g(gq6.m6073K(aa1Var2));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i3];
                int i6 = 0;
                int length2 = 0;
                while (i6 <= (i3 - 1) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    long j2 = j;
                    messageDigest2.update(ev0.m5372v0(BigInteger.valueOf(i6), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    System.arraycopy(bArrDigest2, 0, bArr4, length2, Math.min(bArrDigest2.length, i3 - length2));
                    length2 += bArrDigest2.length;
                    i6++;
                    j = j2;
                }
                long j3 = j;
                int length3 = bArr4.length;
                byte[] bArr5 = new byte[length3];
                for (int i7 = 0; i7 < length3; i7++) {
                    bArr5[i7] = (byte) (bArr4[i7] ^ bArrCopyOf[i7]);
                }
                for (int i8 = 0; i8 <= j3; i8++) {
                    int i9 = i8 / 8;
                    bArr5[i9] = (byte) ((~(b2 << (7 - (i8 % 8)))) & bArr5[i9]);
                }
                int i10 = 0;
                while (true) {
                    int i11 = (i2 - i) - 2;
                    if (i10 >= i11) {
                        if (bArr5[i11] != b2) {
                            xy4.m12788q("inconsistent");
                            return;
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, length3 - i, length3);
                        int i12 = digestLength + 8;
                        byte[] bArr6 = new byte[i12 + i];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i12, bArrCopyOfRange2.length);
                        if (MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            return;
                        }
                        xy4.m12788q("inconsistent");
                        return;
                    }
                    if (bArr5[i10] != 0) {
                        xy4.m12788q("inconsistent");
                        return;
                    }
                    i10++;
                }
            }
        }
    }
}
