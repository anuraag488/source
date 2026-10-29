package p000;

/* JADX INFO: renamed from: ne */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0943ne extends xq1 implements yp1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ej2 f25726b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0943ne(ej2 ej2Var) {
        super(1, y62.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f25726b = ej2Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        float[] fArr = ((rq2) obj).f29528a;
        cf2 cf2Var = (cf2) this.f25726b.f18142r.getValue();
        if (cf2Var != null) {
            if (!cf2Var.mo4000K()) {
                cf2Var = null;
            }
            if (cf2Var != null) {
                cf2Var.mo4001N(fArr);
            }
        }
        return ju4.f22634a;
    }
}
