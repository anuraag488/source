package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w00 extends of3 {

    /* JADX INFO: renamed from: a */
    public boolean[] f33002a;

    /* JADX INFO: renamed from: b */
    public int f33003b;

    @Override // p000.of3
    /* JADX INFO: renamed from: a */
    public final Object mo4730a() {
        return Arrays.copyOf(this.f33002a, this.f33003b);
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: b */
    public final void mo4731b(int i) {
        boolean[] zArr = this.f33002a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f33002a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p000.of3
    /* JADX INFO: renamed from: d */
    public final int mo4732d() {
        return this.f33003b;
    }
}
