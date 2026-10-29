package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m93 extends ym0 {

    /* JADX INFO: renamed from: t */
    public yp1 f24767t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f24768u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1034ph f24769v;

    /* JADX INFO: renamed from: w */
    public int f24770w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m93(C1034ph c1034ph, wm0 wm0Var) {
        super(wm0Var);
        this.f24769v = c1034ph;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        this.f24768u = obj;
        this.f24770w |= Integer.MIN_VALUE;
        return this.f24769v.mo9530l(null, this);
    }
}
