package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n04 implements wp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ xa0 f25366a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f25367b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f25368c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ rd6 f25369d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ pg2 f25370e;

    @Override // p000.wp1
    public final Object invoke() {
        xa0 xa0Var = this.f25366a;
        jl4 jl4Var = (jl4) xa0Var.f34095e;
        int i = this.f25367b;
        int i2 = this.f25368c;
        rd6 rd6Var = this.f25369d;
        int iIntValue = ((Number) this.f25370e.getValue()).intValue();
        boolean z = rd6Var.f29196b;
        boolean z2 = rd6Var.m10303b() == vr0.f32805a;
        long jM7183i = jl4Var.m7183i(i);
        yu2 yu2Var = jl4Var.f22401b;
        int i3 = ql4.f28557c;
        int iM7180f = (int) (jM7183i >> 32);
        int i4 = yu2Var.f35537f;
        if (yu2Var.m13245d(iM7180f) != iIntValue) {
            iM7180f = iIntValue >= i4 ? jl4Var.m7180f(i4 - 1) : jl4Var.m7180f(iIntValue);
        }
        int iM13244c = (int) (jM7183i & 4294967295L);
        if (yu2Var.m13245d(iM13244c) != iIntValue) {
            iM13244c = iIntValue >= i4 ? yu2Var.m13244c(i4 - 1, false) : yu2Var.m13244c(iIntValue, false);
        }
        if (iM7180f == i2) {
            return xa0Var.m12595a(iM13244c);
        }
        if (iM13244c == i2) {
            return xa0Var.m12595a(iM7180f);
        }
        if (!(z ^ z2) ? i >= iM7180f : i > iM13244c) {
            iM7180f = iM13244c;
        }
        return xa0Var.m12595a(iM7180f);
    }
}
