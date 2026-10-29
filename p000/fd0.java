package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 implements yk4 {

    /* JADX INFO: renamed from: a */
    public long f18920a;

    @Override // p000.yk4
    /* JADX INFO: renamed from: a */
    public final long mo5689a() {
        return this.f18920a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd0)) {
            return false;
        }
        long j = this.f18920a;
        long j2 = ((fd0) obj).f18920a;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2);
    }

    @Override // p000.yk4
    /* JADX INFO: renamed from: f */
    public final t30 mo5690f() {
        return null;
    }

    @Override // p000.yk4
    /* JADX INFO: renamed from: h */
    public final float mo5691h() {
        return pb0.m9465d(this.f18920a);
    }

    public final int hashCode() {
        long j = this.f18920a;
        int i = pb0.f27502i;
        return Long.hashCode(j);
    }

    public final String toString() {
        return zi4.m13621u("ColorStyle(value=", pb0.m9470i(this.f18920a), ")");
    }
}
