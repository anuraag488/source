package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kv2 {

    /* JADX INFO: renamed from: a */
    public int[] f23537a;

    /* JADX INFO: renamed from: b */
    public int f23538b;

    public kv2(int i) {
        this.f23537a = i == 0 ? v52.f32420a : new int[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m7633a(int i) {
        m7634b(this.f23538b + 1);
        int[] iArr = this.f23537a;
        int i2 = this.f23538b;
        iArr[i2] = i;
        this.f23538b = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m7634b(int i) {
        int[] iArr = this.f23537a;
        if (iArr.length < i) {
            this.f23537a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m7635c(int i) {
        if (i >= 0 && i < this.f23538b) {
            return this.f23537a[i];
        }
        kx5.m7733s0("Index must be between 0 and size");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final int m7636d() {
        int i = this.f23538b;
        if (i != 0) {
            return this.f23537a[i - 1];
        }
        kx5.m7737u0("IntList is empty.");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m7637e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f23538b)) {
            kx5.m7733s0("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f23537a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC0990oo.m9199T(iArr, iArr, i, i + 1, i2);
        }
        this.f23538b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kv2) {
            kv2 kv2Var = (kv2) obj;
            int i = kv2Var.f23538b;
            int i2 = this.f23538b;
            if (i == i2) {
                int[] iArr = this.f23537a;
                int[] iArr2 = kv2Var.f23537a;
                r52 r52VarM10660c0 = sc6.m10660c0(0, i2);
                int i3 = r52VarM10660c0.f27382a;
                int i4 = r52VarM10660c0.f27383b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m7638f(int i, int i2) {
        if (i < 0 || i >= this.f23538b) {
            kx5.m7733s0("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f23537a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.f23537a;
        int i = this.f23538b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.f23537a;
        int i = this.f23538b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(i3);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ kv2() {
        this(16);
    }
}
