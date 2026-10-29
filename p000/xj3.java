package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xj3 implements yb4, si1, yq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yb4 f34322a;
    private final t82 job;

    public xj3(ac4 ac4Var, nb4 nb4Var) {
        this.f34322a = ac4Var;
        this.job = nb4Var;
    }

    @Override // p000.yq1
    /* JADX INFO: renamed from: a */
    public final si1 mo193a(ro0 ro0Var, int i, y30 y30Var) {
        return (((i < 0 || i >= 2) && i != -2) || y30Var != y30.f34833b) ? z44.m13333c(this, ro0Var, i, y30Var) : this;
    }

    @Override // p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) {
        return this.f34322a.collect(ti1Var, wm0Var);
    }

    @Override // p000.yb4
    public final Object getValue() {
        return this.f34322a.getValue();
    }
}
