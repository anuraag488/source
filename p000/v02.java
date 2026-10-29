package p000;

import com.materialkolor.ktx.ImageBitmapKt;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v02 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ t02 f32283t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f32284u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f32285v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f32286w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ sw2 f32287x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v02(t02 t02Var, long j, boolean z, int i, sw2 sw2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32283t = t02Var;
        this.f32284u = j;
        this.f32285v = z;
        this.f32286w = i;
        this.f32287x = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new v02(this.f32283t, this.f32284u, this.f32285v, this.f32286w, this.f32287x, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        v02 v02Var = (v02) create((wm0) obj2, (zo0) obj);
        ju4 ju4Var = ju4.f22634a;
        v02Var.invokeSuspend(ju4Var);
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        k43.m7376J(obj);
        this.f32287x.setValue(pb0.m9462a(ImageBitmapKt.m13953themeColorRPmYEkk(this.f32283t, this.f32284u, this.f32285v, this.f32286w)));
        return ju4.f22634a;
    }
}
