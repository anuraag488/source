package p000;

/* JADX INFO: renamed from: ak */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0457ak implements xb4 {

    /* JADX INFO: renamed from: a */
    public final sq4 f14571a;

    /* JADX INFO: renamed from: b */
    public final d83 f14572b;

    /* JADX INFO: renamed from: c */
    public AbstractC0654fk f14573c;

    /* JADX INFO: renamed from: d */
    public long f14574d;

    /* JADX INFO: renamed from: e */
    public long f14575e;

    /* JADX INFO: renamed from: f */
    public boolean f14576f;

    public C0457ak(sq4 sq4Var, Object obj, AbstractC0654fk abstractC0654fk, long j, long j2, boolean z) {
        AbstractC0654fk abstractC0654fkM10824t;
        this.f14571a = sq4Var;
        this.f14572b = k43.m7398w(obj);
        if (abstractC0654fk != null) {
            abstractC0654fkM10824t = sj3.m10824t(abstractC0654fk);
        } else {
            abstractC0654fkM10824t = (AbstractC0654fk) sq4Var.f30508a.invoke(obj);
            abstractC0654fkM10824t.mo3609d();
        }
        this.f14573c = abstractC0654fkM10824t;
        this.f14574d = j;
        this.f14575e = j2;
        this.f14576f = z;
    }

    /* JADX INFO: renamed from: a */
    public final Object m3020a() {
        return this.f14571a.f30509b.invoke(this.f14573c);
    }

    @Override // p000.xb4
    public final Object getValue() {
        return this.f14572b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f14572b.getValue() + ", velocity=" + m3020a() + ", isRunning=" + this.f14576f + ", lastFrameTimeNanos=" + this.f14574d + ", finishedTimeNanos=" + this.f14575e + ")";
    }

    public /* synthetic */ C0457ak(sq4 sq4Var, Object obj, AbstractC0654fk abstractC0654fk, int i) {
        this(sq4Var, obj, (i & 4) != 0 ? null : abstractC0654fk, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
