package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int[] f16077a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f16078b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f16079c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f16080d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ db3[] f16081e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ dk1 f16082f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f16083g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ df2 f16084h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ int[] f16085i;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        int[] iArr = this.f16077a;
        int i = this.f16078b;
        int i2 = this.f16079c;
        int i3 = this.f16080d;
        db3[] db3VarArr = this.f16081e;
        dk1 dk1Var = this.f16082f;
        int i4 = this.f16083g;
        int[] iArr2 = this.f16085i;
        cb3 cb3Var = (cb3) obj;
        int i5 = iArr != null ? iArr[i] : 0;
        for (int i6 = i2; i6 < i3; i6++) {
            db3 db3Var = db3VarArr[i6];
            db3Var.mo4423m();
            ur0 ur0Var = dk1Var.f17116d;
            cb3Var.m3952k(db3Var, iArr2[i6 - i2], Math.round((1.0f - 1.0f) * ((i4 - db3Var.mo4420i0()) / 2.0f)) + i5, 0.0f);
        }
        return ju4.f22634a;
    }
}
