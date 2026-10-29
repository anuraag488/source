package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ob2 extends mb2 {

    /* JADX INFO: renamed from: k */
    public List f26538k;

    /* JADX INFO: renamed from: l */
    public int f26539l;

    /* JADX INFO: renamed from: m */
    public int f26540m;

    @Override // p000.mb2, p000.AbstractC0893m1
    /* JADX INFO: renamed from: E */
    public final aa2 mo6323E(String str) {
        return this.f26540m % 2 == 0 ? ca2.m3929b(str) : (aa2) eq2.m5273L(str, this.f24794f);
    }

    @Override // p000.mb2, p000.AbstractC0893m1
    /* JADX INFO: renamed from: Q */
    public final String mo8185Q(g24 g24Var, int i) {
        return (String) this.f26538k.get(i / 2);
    }

    @Override // p000.mb2, p000.ri0
    /* JADX INFO: renamed from: j */
    public final int mo6325j(g24 g24Var) {
        int i = this.f26540m;
        if (i >= this.f26539l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.f26540m = i2;
        return i2;
    }

    @Override // p000.AbstractC0893m1, p000.ri0
    /* JADX INFO: renamed from: u */
    public final void mo5398u(g24 g24Var) {
    }
}
