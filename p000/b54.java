package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b54 {

    /* JADX INFO: renamed from: a */
    public final d83 f15089a;

    /* JADX INFO: renamed from: b */
    public final d83 f15090b;

    /* JADX INFO: renamed from: c */
    public final C1372yl f15091c;

    /* JADX INFO: renamed from: d */
    public final long f15092d;

    /* JADX INFO: renamed from: e */
    public long f15093e;

    /* JADX INFO: renamed from: f */
    public float f15094f;

    /* JADX INFO: renamed from: g */
    public float f15095g;

    /* JADX INFO: renamed from: h */
    public long f15096h;

    /* JADX INFO: renamed from: i */
    public long f15097i;

    /* JADX INFO: renamed from: j */
    public lx4 f15098j;

    public b54() {
        Boolean bool = Boolean.FALSE;
        this.f15089a = k43.m7398w(bool);
        this.f15090b = k43.m7398w(bool);
        C1372yl c1372yl = new C1372yl();
        c1372yl.f35304a = k43.m7398w(bool);
        c1372yl.f35305b = new z73(1.0f);
        c1372yl.f35306c = k43.m7398w(bool);
        c1372yl.f35307d = new z73(1.0f);
        c1372yl.f35308e = k43.m7398w(bool);
        long j = to4.f31292b;
        c1372yl.f35309f = k43.m7398w(to4.m11080a(j));
        c1372yl.f35310g = k43.m7398w(bool);
        long j2 = pb0.f27500g;
        c1372yl.f35311h = k43.m7398w(pb0.m9462a(j2));
        VarHandle.storeStoreFence();
        this.f15091c = c1372yl;
        this.f15092d = wt2.m12419a();
        this.f15093e = j2;
        this.f15094f = 1.0f;
        this.f15095g = 1.0f;
        this.f15096h = j;
        this.f15097i = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3456a() {
        return ((Boolean) this.f15090b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3457b() {
        return ((Boolean) this.f15089a.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m3458c(boolean z) {
        d83 d83Var = this.f15089a;
        boolean zBooleanValue = ((Boolean) d83Var.getValue()).booleanValue();
        d83 d83Var2 = this.f15090b;
        if (zBooleanValue && !z) {
            d83Var2.setValue(Boolean.TRUE);
        } else if (z) {
            d83Var2.setValue(Boolean.FALSE);
        }
        d83Var.setValue(Boolean.valueOf(z));
    }
}
