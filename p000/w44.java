package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w44 implements w01 {

    /* JADX INFO: renamed from: a */
    public y44 f33092a;

    /* JADX INFO: renamed from: b */
    public long f33093b;

    /* JADX INFO: renamed from: c */
    public Object f33094c;

    /* JADX INFO: renamed from: d */
    public b70 f33095d;

    @Override // p000.w01
    /* JADX INFO: renamed from: a */
    public final void mo3937a() {
        y44 y44Var = this.f33092a;
        synchronized (y44Var) {
            if (this.f33093b >= y44Var.m12885o()) {
                Object[] objArr = y44Var.f34873h;
                long j = this.f33093b;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    z44.m13334d(objArr, j, z44.f35748a);
                    y44Var.m12881j();
                }
            }
        }
    }
}
