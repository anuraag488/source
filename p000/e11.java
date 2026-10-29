package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e11 extends of3 {

    /* JADX INFO: renamed from: a */
    public double[] f17583a;

    /* JADX INFO: renamed from: b */
    public int f17584b;

    @Override // p000.of3
    /* JADX INFO: renamed from: a */
    public final Object mo4730a() {
        return Arrays.copyOf(this.f17583a, this.f17584b);
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: b */
    public final void mo4731b(int i) {
        double[] dArr = this.f17583a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f17583a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: d */
    public final int mo4732d() {
        return this.f17584b;
    }
}
