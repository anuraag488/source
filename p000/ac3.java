package p000;

import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ac3 extends AbstractC0476b2 {
    @Override // p000.mj3
    /* JADX INFO: renamed from: c */
    public final double mo191c() {
        return ThreadLocalRandom.current().nextDouble(1.0d);
    }

    @Override // p000.mj3
    /* JADX INFO: renamed from: f */
    public final long mo192f() {
        return ThreadLocalRandom.current().nextLong(0L, 10000000000000000L);
    }
}
