package p000;

import com.materialkolor.ktx.ImageBitmapKt;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w02 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ t02 f33004t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f33005u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f33006v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f33007w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f33008x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ sw2 f33009y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w02(t02 t02Var, int i, long j, boolean z, int i2, sw2 sw2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33004t = t02Var;
        this.f33005u = i;
        this.f33006v = j;
        this.f33007w = z;
        this.f33008x = i2;
        this.f33009y = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new w02(this.f33004t, this.f33005u, this.f33006v, this.f33007w, this.f33008x, this.f33009y, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        w02 w02Var = (w02) create((wm0) obj2, (zo0) obj);
        ju4 ju4Var = ju4.f22634a;
        w02Var.invokeSuspend(ju4Var);
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        k43.m7376J(obj);
        this.f33009y.setValue(ImageBitmapKt.m13955themeColorsXOJAsU(this.f33004t, this.f33005u, this.f33006v, this.f33007w, this.f33008x));
        return ju4.f22634a;
    }
}
