package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class je4 extends y44 implements yb4 {
    @Override // p000.yb4
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f34873h;
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f34874i + ((long) ((int) ((m12885o() + ((long) this.f34876k)) - this.f34874i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: v */
    public final void m7088v(int i) {
        synchronized (this) {
            Object[] objArr = this.f34873h;
            mo197f(Integer.valueOf(((Number) objArr[((int) ((this.f34874i + ((long) ((int) ((m12885o() + ((long) this.f34876k)) - this.f34874i)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
