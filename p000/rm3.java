package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rm3 implements zo0, pm3 {

    /* JADX INFO: renamed from: e */
    public static final g70 f29414e = new g70(0);

    /* JADX INFO: renamed from: a */
    public ro0 f29415a;

    /* JADX INFO: renamed from: b */
    public ro0 f29416b;

    /* JADX INFO: renamed from: c */
    public rm3 f29417c;

    /* JADX INFO: renamed from: d */
    public volatile ro0 f29418d;

    /* JADX INFO: renamed from: a */
    public final void m10372a() {
        synchronized (this.f29417c) {
            try {
                ro0 ro0Var = this.f29418d;
                if (ro0Var == null) {
                    this.f29418d = f29414e;
                } else {
                    y70.m13032l(ro0Var, new fn1((byte) 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: d */
    public final void mo38d() {
        m10372a();
    }

    @Override // p000.zo0
    /* JADX INFO: renamed from: f */
    public final ro0 mo6367f() {
        ro0 ro0VarPlus;
        ro0 ro0Var = this.f29418d;
        if (ro0Var != null && ro0Var != f29414e) {
            return ro0Var;
        }
        xi0 xi0Var = (xi0) this.f29415a.get(xi0.f34298b);
        ro0 qm3Var = xi0Var != null ? new qm3(xi0Var, this) : r71.f29063a;
        synchronized (this.f29417c) {
            try {
                ro0 ro0Var2 = this.f29418d;
                if (ro0Var2 == null) {
                    ro0 ro0Var3 = this.f29415a;
                    ro0VarPlus = ro0Var3.plus(new v82((t82) ro0Var3.get(o85.f26448h))).plus(this.f29416b).plus(qm3Var);
                } else if (ro0Var2 == f29414e) {
                    ro0 ro0Var4 = this.f29415a;
                    v82 v82Var = new v82((t82) ro0Var4.get(o85.f26448h));
                    v82Var.mo5009y(new fn1((byte) 0));
                    ro0VarPlus = ro0Var4.plus(v82Var).plus(this.f29416b).plus(qm3Var);
                } else {
                    ro0VarPlus = ro0Var2;
                }
                this.f29418d = ro0VarPlus;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ro0VarPlus;
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: h */
    public final void mo41h() {
        m10372a();
    }

    @Override // p000.pm3
    /* JADX INFO: renamed from: c */
    public final void mo37c() {
    }
}
