package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lx3 extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C0459am f24437A;

    /* JADX INFO: renamed from: t */
    public boolean f24438t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ u93 f24439u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zo0 f24440v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ sw2 f24441w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1354y3 f24442x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ gr1 f24443y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ xn2 f24444z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx3(u93 u93Var, zo0 zo0Var, sw2 sw2Var, C1354y3 c1354y3, gr1 gr1Var, xn2 xn2Var, C0459am c0459am, wm0 wm0Var) {
        super(1, wm0Var);
        this.f24439u = u93Var;
        this.f24440v = zo0Var;
        this.f24441w = sw2Var;
        this.f24442x = c1354y3;
        this.f24443y = gr1Var;
        this.f24444z = xn2Var;
        this.f24437A = c0459am;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        xn2 xn2Var = this.f24444z;
        C0459am c0459am = this.f24437A;
        return new lx3(this.f24439u, this.f24440v, this.f24441w, this.f24442x, this.f24443y, xn2Var, c0459am, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f24438t;
        if (!z) {
            k43.m7376J(obj);
            this.f24438t = true;
            obj = this.f24439u.mo11771c(this);
            if (obj == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ju4 ju4Var = ju4.f22634a;
        if (zBooleanValue) {
            int i = ox3.f27193g;
            sw2 sw2Var = this.f24441w;
            if (((t82) sw2Var.getValue()) == null) {
                t82 t82VarM7910S = lb5.m7910S(this.f24440v, null, null, new C1031pe(this.f24442x, this.f24443y, this.f24444z, this.f24437A, (wm0) null, (byte) 21), 3);
                C0761ih c0761ih = new C0761ih((byte) 9);
                c0761ih.f21416b = sw2Var;
                VarHandle.storeStoreFence();
                ((e92) t82VarM7910S).mo4972C(c0761ih);
                sw2Var.setValue(t82VarM7910S);
                return ju4Var;
            }
            t82 t82Var = (t82) sw2Var.getValue();
            if (t82Var != null) {
                t82Var.mo4993a(null);
            }
        }
        return ju4Var;
    }
}
