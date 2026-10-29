package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class z51 {

    /* JADX INFO: renamed from: a */
    public final long[] f35752a;

    /* JADX INFO: renamed from: b */
    public final long[] f35753b;

    /* JADX INFO: renamed from: c */
    public final long[] f35754c;

    public z51() {
        z51 z51Var = b61.f15102a;
        this.f35752a = Arrays.copyOf(z51Var.f35752a, 10);
        this.f35753b = Arrays.copyOf(z51Var.f35753b, 10);
        this.f35754c = Arrays.copyOf(z51Var.f35754c, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m13339a(z51 z51Var, int i) {
        qq2.m10030n(this.f35752a, z51Var.f35752a, i);
        qq2.m10030n(this.f35753b, z51Var.f35753b, i);
        qq2.m10030n(this.f35754c, z51Var.f35754c, i);
    }

    /* JADX INFO: renamed from: b */
    public void mo102b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public z51(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f35752a = jArr;
        this.f35753b = jArr2;
        this.f35754c = jArr3;
    }
}
