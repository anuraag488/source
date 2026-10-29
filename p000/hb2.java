package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hb2 extends AbstractC0893m1 {

    /* JADX INFO: renamed from: f */
    public final aa2 f20467f;

    public hb2(i92 i92Var, aa2 aa2Var, String str) {
        super(i92Var, str);
        this.f20467f = aa2Var;
        this.f24524a.add("primitive");
    }

    @Override // p000.AbstractC0893m1
    /* JADX INFO: renamed from: E */
    public final aa2 mo6323E(String str) {
        if (str.equals("primitive")) {
            return this.f20467f;
        }
        C1077qn.m9987m("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // p000.AbstractC0893m1
    /* JADX INFO: renamed from: S */
    public final aa2 mo6324S() {
        return this.f20467f;
    }

    @Override // p000.ri0
    /* JADX INFO: renamed from: j */
    public final int mo6325j(g24 g24Var) {
        return 0;
    }
}
