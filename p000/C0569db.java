package p000;

/* JADX INFO: renamed from: db */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0569db extends ym0 {

    /* JADX INFO: renamed from: t */
    public nl3 f16888t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16889u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0719hb f16890v;

    /* JADX INFO: renamed from: w */
    public int f16891w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0569db(C0719hb c0719hb, ym0 ym0Var) {
        super(ym0Var);
        this.f16890v = c0719hb;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f16889u = obj;
        this.f16891w |= Integer.MIN_VALUE;
        return this.f16890v.m6292j1(0.0f, this);
    }
}
