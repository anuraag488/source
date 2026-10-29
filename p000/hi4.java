package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hi4 implements InterfaceC1221uj {

    /* JADX INFO: renamed from: a */
    public final yw4 f20603a;

    /* JADX INFO: renamed from: b */
    public final sq4 f20604b;

    /* JADX INFO: renamed from: c */
    public Object f20605c;

    /* JADX INFO: renamed from: d */
    public Object f20606d;

    /* JADX INFO: renamed from: e */
    public AbstractC0654fk f20607e;

    /* JADX INFO: renamed from: f */
    public AbstractC0654fk f20608f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0654fk f20609g;

    /* JADX INFO: renamed from: h */
    public long f20610h;

    /* JADX INFO: renamed from: i */
    public AbstractC0654fk f20611i;

    public hi4(InterfaceC1407zj interfaceC1407zj, sq4 sq4Var, Object obj, Object obj2, AbstractC0654fk abstractC0654fk) {
        this.f20603a = interfaceC1407zj.mo4410a(sq4Var);
        this.f20604b = sq4Var;
        this.f20605c = obj2;
        this.f20606d = obj;
        this.f20607e = (AbstractC0654fk) sq4Var.f30508a.invoke(obj);
        yp1 yp1Var = sq4Var.f30508a;
        this.f20608f = (AbstractC0654fk) yp1Var.invoke(obj2);
        this.f20609g = abstractC0654fk != null ? sj3.m10824t(abstractC0654fk) : ((AbstractC0654fk) yp1Var.invoke(obj)).mo4035c();
        this.f20610h = -1L;
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: a */
    public final boolean mo5812a() {
        return this.f20603a.mo3759a();
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: b */
    public final Object mo5813b(long j) {
        if (m11569g(j)) {
            return this.f20605c;
        }
        AbstractC0654fk abstractC0654fkMo4795s = this.f20603a.mo4795s(j, this.f20607e, this.f20608f, this.f20609g);
        int iMo4034b = abstractC0654fkMo4795s.mo4034b();
        for (int i = 0; i < iMo4034b; i++) {
            if (Float.isNaN(abstractC0654fkMo4795s.mo3608a(i))) {
                md3.m8285b("AnimationVector cannot contain a NaN. " + abstractC0654fkMo4795s + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f20604b.f30509b.invoke(abstractC0654fkMo4795s);
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: c */
    public final long mo5814c() {
        long j = this.f20610h;
        if (j >= 0) {
            return j;
        }
        long jMo3358c = this.f20603a.mo3358c(this.f20607e, this.f20608f, this.f20609g);
        this.f20610h = jMo3358c;
        return jMo3358c;
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: d */
    public final sq4 mo5815d() {
        return this.f20604b;
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: e */
    public final Object mo5816e() {
        return this.f20605c;
    }

    @Override // p000.InterfaceC1221uj
    /* JADX INFO: renamed from: f */
    public final AbstractC0654fk mo5817f(long j) {
        if (!m11569g(j)) {
            return this.f20603a.mo4794p(j, this.f20607e, this.f20608f, this.f20609g);
        }
        AbstractC0654fk abstractC0654fk = this.f20611i;
        if (abstractC0654fk != null) {
            return abstractC0654fk;
        }
        AbstractC0654fk abstractC0654fkMo12090t = this.f20603a.mo12090t(this.f20607e, this.f20608f, this.f20609g);
        this.f20611i = abstractC0654fkMo12090t;
        return abstractC0654fkMo12090t;
    }

    /* JADX INFO: renamed from: h */
    public final void m6411h(Object obj) {
        if (z62.m13387o(obj, this.f20606d)) {
            return;
        }
        this.f20606d = obj;
        this.f20607e = (AbstractC0654fk) this.f20604b.f30508a.invoke(obj);
        this.f20611i = null;
        this.f20610h = -1L;
    }

    /* JADX INFO: renamed from: i */
    public final void m6412i(Object obj) {
        if (z62.m13387o(this.f20605c, obj)) {
            return;
        }
        this.f20605c = obj;
        this.f20608f = (AbstractC0654fk) this.f20604b.f30508a.invoke(obj);
        this.f20611i = null;
        this.f20610h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f20606d + " -> " + this.f20605c + ",initial velocity: " + this.f20609g + ", duration: " + (mo5814c() / 1000000) + " ms,animationSpec: " + this.f20603a;
    }
}
