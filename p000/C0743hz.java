package p000;

/* JADX INFO: renamed from: hz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0743hz implements InterfaceC0520ca {

    /* JADX INFO: renamed from: a */
    public final float f20948a;

    public C0743hz(float f) {
        this.f20948a = f;
    }

    @Override // p000.InterfaceC0520ca
    /* JADX INFO: renamed from: a */
    public final long mo3927a(long j, long j2, df2 df2Var) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((1.0f + this.f20948a) * (((int) (j3 >> 32)) / 2.0f))) << 32) | (((long) Math.round(0.0f * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0743hz) && Float.compare(this.f20948a, ((C0743hz) obj).f20948a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f20948a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f20948a + ", verticalBias=-1.0)";
    }
}
