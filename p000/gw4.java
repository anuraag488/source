package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gw4 implements Comparable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final gw4 f20153c = new gw4(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f20154a;

    /* JADX INFO: renamed from: b */
    public final long f20155b;

    public gw4(long j, long j2) {
        this.f20154a = j;
        this.f20155b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gw4 gw4Var = (gw4) obj;
        long j = gw4Var.f20154a;
        long j2 = this.f20154a;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.f20155b, gw4Var.f20155b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw4)) {
            return false;
        }
        gw4 gw4Var = (gw4) obj;
        return this.f20154a == gw4Var.f20154a && this.f20155b == gw4Var.f20155b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20154a ^ this.f20155b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        oh6.m9113s(this.f20154a, bArr, 0, 0, 4);
        bArr[8] = 45;
        oh6.m9113s(this.f20154a, bArr, 9, 4, 6);
        bArr[13] = 45;
        oh6.m9113s(this.f20154a, bArr, 14, 6, 8);
        bArr[18] = 45;
        oh6.m9113s(this.f20155b, bArr, 19, 0, 2);
        bArr[23] = 45;
        oh6.m9113s(this.f20155b, bArr, 24, 2, 8);
        return new String(bArr, z80.f35863a);
    }
}
