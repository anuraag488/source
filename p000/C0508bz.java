package p000;

/* JADX INFO: renamed from: bz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0508bz implements gl0 {

    /* JADX INFO: renamed from: a */
    public final C0556cz f15688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f15689b;

    public C0508bz(C0556cz c0556cz, byte b) {
        this.f15689b = b;
        this.f15688a = c0556cz;
    }

    @Override // p000.gl0
    /* JADX INFO: renamed from: a */
    public final boolean mo3762a(q25 q25Var) {
        switch (this.f15689b) {
            case 0:
                return q25Var.f28171j.f22384c;
            case 1:
                return q25Var.f28171j.f22386e;
            default:
                return q25Var.f28171j.f22387f;
        }
    }

    @Override // p000.gl0
    /* JADX INFO: renamed from: b */
    public final l60 mo3763b(jl0 jl0Var) {
        return new l60(new C0594e0((Object) this, (wm0) null, (byte) 8), r71.f29063a, -2, y30.f34832a);
    }

    /* JADX INFO: renamed from: c */
    public final int m3764c() {
        switch (this.f15689b) {
            case 0:
                return 6;
            case 1:
                return 5;
            default:
                return 9;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3765d(Object obj) {
        boolean zBooleanValue;
        switch (this.f15689b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
