package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o60 extends AbstractC0857l2 {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ p60 f26366h;

    @Override // p000.AbstractC0857l2
    /* JADX INFO: renamed from: i */
    public final String mo7818i() {
        m60 m60Var = (m60) this.f26366h.f27391a.get();
        if (m60Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + m60Var.f24678a + "]";
    }
}
