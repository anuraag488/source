package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rw0 implements tx3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ sw0 f29676a;

    @Override // p000.tx3
    /* JADX INFO: renamed from: a */
    public final float mo3369a(float f) {
        sw0 sw0Var = this.f29676a;
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        float fFloatValue = ((Number) sw0Var.f30605a.invoke(Float.valueOf(f))).floatValue();
        sw0Var.f30609e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        sw0Var.f30610f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
