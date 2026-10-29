package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q12 {

    /* JADX INFO: renamed from: a */
    public Object[] f28139a;

    /* JADX INFO: renamed from: b */
    public int f28140b;

    /* JADX INFO: renamed from: c */
    public boolean f28141c;

    /* JADX INFO: renamed from: b */
    public static int m9697b(int i, int i2) {
        if (i2 < 0) {
            C1077qn.m9985k("cannot store more than MAX_VALUE elements");
            return 0;
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: a */
    public final void m9698a(Object... objArr) {
        int length = objArr.length;
        se0.m10730k(length, objArr);
        int i = this.f28140b + length;
        Object[] objArr2 = this.f28139a;
        if (objArr2.length < i) {
            this.f28139a = Arrays.copyOf(objArr2, m9697b(objArr2.length, i));
            this.f28141c = false;
        } else if (this.f28141c) {
            this.f28139a = (Object[]) objArr2.clone();
            this.f28141c = false;
        }
        System.arraycopy(objArr, 0, this.f28139a, this.f28140b, length);
        this.f28140b += length;
    }
}
