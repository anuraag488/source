package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ab1 extends cb1 {

    /* JADX INFO: renamed from: c */
    public final b70 f230c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eb1 f231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab1(eb1 eb1Var, long j, b70 b70Var) {
        super(j);
        this.f231d = eb1Var;
        this.f230c = b70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f230c.m3481D(this.f231d);
    }

    @Override // p000.cb1
    public final String toString() {
        return super.toString() + this.f230c;
    }
}
