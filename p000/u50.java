package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u50 {

    /* JADX INFO: renamed from: a */
    public byte[] f31654a;

    /* JADX INFO: renamed from: a */
    public static u50 m11248a(int i, byte[] bArr) {
        if (bArr == null) {
            xy4.m12782k("data must be non-null");
            return null;
        }
        if (i > bArr.length) {
            i = bArr.length;
        }
        u50 u50Var = new u50();
        byte[] bArr2 = new byte[i];
        u50Var.f31654a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
        VarHandle.storeStoreFence();
        return u50Var;
    }

    /* JADX INFO: renamed from: b */
    public static u50 m11249b(byte[] bArr) {
        if (bArr != null) {
            return m11248a(bArr.length, bArr);
        }
        xy4.m12782k("data must be non-null");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m11250c() {
        byte[] bArr = this.f31654a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u50) {
            return Arrays.equals(((u50) obj).f31654a, this.f31654a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31654a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bytes(");
        byte[] bArr = this.f31654a;
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb2.append("0123456789abcdef".charAt(i / 16));
            sb2.append("0123456789abcdef".charAt(i % 16));
        }
        sb.append(sb2.toString());
        sb.append(")");
        return sb.toString();
    }
}
