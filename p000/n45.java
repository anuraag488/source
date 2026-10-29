package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n45 extends mj3 implements Serializable {

    /* JADX INFO: renamed from: b */
    public int f25449b;

    /* JADX INFO: renamed from: c */
    public int f25450c;

    /* JADX INFO: renamed from: d */
    public int f25451d;

    /* JADX INFO: renamed from: e */
    public int f25452e;

    /* JADX INFO: renamed from: f */
    public int f25453f;

    /* JADX INFO: renamed from: g */
    public int f25454g;

    @Override // p000.mj3
    /* JADX INFO: renamed from: a */
    public final int mo3403a(int i) {
        return (mo3405d() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // p000.mj3
    /* JADX INFO: renamed from: d */
    public final int mo3405d() {
        int i = this.f25449b;
        int i2 = i ^ (i >>> 2);
        this.f25449b = this.f25450c;
        this.f25450c = this.f25451d;
        this.f25451d = this.f25452e;
        int i3 = this.f25453f;
        this.f25452e = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f25453f = i4;
        int i5 = this.f25454g + 362437;
        this.f25454g = i5;
        return i4 + i5;
    }
}
