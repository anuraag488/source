package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nb2 extends AbstractC0893m1 {

    /* JADX INFO: renamed from: f */
    public final n92 f25626f;

    /* JADX INFO: renamed from: g */
    public final int f25627g;

    /* JADX INFO: renamed from: h */
    public int f25628h;

    public nb2(i92 i92Var, n92 n92Var) {
        super(i92Var, null);
        this.f25626f = n92Var;
        this.f25627g = n92Var.f25566a.size();
        this.f25628h = -1;
    }

    @Override // p000.AbstractC0893m1
    /* JADX INFO: renamed from: E */
    public final aa2 mo6323E(String str) {
        return (aa2) this.f25626f.f25566a.get(Integer.parseInt(str));
    }

    @Override // p000.AbstractC0893m1
    /* JADX INFO: renamed from: Q */
    public final String mo8185Q(g24 g24Var, int i) {
        return String.valueOf(i);
    }

    @Override // p000.AbstractC0893m1
    /* JADX INFO: renamed from: S */
    public final aa2 mo6324S() {
        return this.f25626f;
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: j */
    public final int mo6325j(g24 g24Var) {
        int i = this.f25628h;
        if (i >= this.f25627g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f25628h = i2;
        return i2;
    }
}
