package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: b2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0476b2 extends mj3 {
    @Override // p000.mj3
    /* JADX INFO: renamed from: a */
    public final int mo3403a(int i) {
        return (mo3407g().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // p000.mj3
    /* JADX INFO: renamed from: b */
    public final double mo3404b() {
        return mo3407g().nextDouble();
    }

    @Override // p000.mj3
    /* JADX INFO: renamed from: d */
    public final int mo3405d() {
        return mo3407g().nextInt();
    }

    @Override // p000.mj3
    /* JADX INFO: renamed from: e */
    public final long mo3406e() {
        return mo3407g().nextLong();
    }

    /* JADX INFO: renamed from: g */
    public Random mo3407g() {
        return ThreadLocalRandom.current();
    }

    /* JADX INFO: renamed from: h */
    public final int m3408h(int i) {
        return mo3407g().nextInt(i);
    }
}
