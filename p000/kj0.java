package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kj0 extends xh3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f23161b;

    /* JADX INFO: renamed from: c */
    public Object f23162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj0(wp1 wp1Var, byte b) {
        super(wp1Var);
        this.f23161b = b;
    }

    @Override // p000.xh3
    /* JADX INFO: renamed from: a */
    public final zh3 mo7523a(Object obj) {
        switch (this.f23161b) {
            case 0:
                return new zh3(this, obj, obj == null, null, null, null, true);
            default:
                return new zh3(this, obj, obj == null, (r94) this.f23162c, null, null, true);
        }
    }

    @Override // p000.xh3
    /* JADX INFO: renamed from: b */
    public nw4 mo7524b() {
        switch (this.f23161b) {
            case 0:
                return (lj0) this.f23162c;
            default:
                return super.mo7524b();
        }
    }
}
