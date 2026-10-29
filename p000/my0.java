package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class my0 implements ky0 {

    /* JADX INFO: renamed from: a */
    public float f25288a;

    /* JADX INFO: renamed from: b */
    public float f25289b;

    /* JADX INFO: renamed from: c */
    public qm1 f25290c;

    @Override // p000.ky0
    /* JADX INFO: renamed from: C */
    public final long mo3573C(float f) {
        return vd6.m11825I(4294967296L, this.f25290c.mo5729a(f));
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: O */
    public final float mo3577O(long j) {
        if (cm4.m4048b(bm4.m3633c(j), 4294967296L)) {
            return this.f25290c.mo5730b(bm4.m3634d(j));
        }
        C1077qn.m9989o("Only Sp can convert to Px");
        return 0.0f;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f25288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my0)) {
            return false;
        }
        my0 my0Var = (my0) obj;
        return Float.compare(this.f25288a, my0Var.f25288a) == 0 && Float.compare(this.f25289b, my0Var.f25289b) == 0 && this.f25290c.equals(my0Var.f25290c);
    }

    public final int hashCode() {
        return this.f25290c.hashCode() + c75.m3874f(this.f25289b, Float.hashCode(this.f25288a) * 31, 31);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f25289b;
    }

    public final String toString() {
        float f = this.f25288a;
        float f2 = this.f25289b;
        qm1 qm1Var = this.f25290c;
        StringBuilder sbM4370o = d55.m4370o("DensityWithConverter(density=", f, ", fontScale=", f2, ", converter=");
        sbM4370o.append(qm1Var);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
