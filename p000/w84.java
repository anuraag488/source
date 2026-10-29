package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w84 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public nl3 f33156t;

    /* JADX INFO: renamed from: u */
    public byte f33157u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ z84 f33158v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f33159w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ yp1 f33160x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ tx3 f33161y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w84(z84 z84Var, float f, yp1 yp1Var, tx3 tx3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33158v = z84Var;
        this.f33159w = f;
        this.f33160x = yp1Var;
        this.f33161y = tx3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new w84(this.f33158v, this.f33159w, this.f33160x, this.f33161y, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((w84) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        nl3 nl3Var;
        z84 z84Var;
        Object objM13452d;
        Object objM11652b;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f33157u;
        yp1 yp1Var = this.f33160x;
        z84 z84Var2 = this.f33158v;
        if (b == 0) {
            k43.m7376J(obj);
            gv0 gv0Var = z84Var2.f35874b;
            float f = this.f33159w;
            ks5.m7611l(gv0Var, 0.0f, f);
            if (Float.isNaN(0.0f)) {
                t32.m10970c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            nl3Var = new nl3();
            float fSignum = Math.signum(f) * Math.abs(0.0f);
            nl3Var.f25933a = fSignum;
            yp1Var.invoke(new Float(fSignum));
            float f2 = nl3Var.f25933a;
            v84 v84Var = new v84((byte) 0);
            v84Var.f32465b = nl3Var;
            v84Var.f32466c = yp1Var;
            VarHandle.storeStoreFence();
            this.f33156t = nl3Var;
            this.f33157u = (byte) 1;
            z84Var = z84Var2;
            objM13452d = z84Var.m13452d(this.f33161y, f2, this.f33159w, v84Var, this);
            if (objM13452d != ap0Var) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                k43.m7376J(obj);
                return obj;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        nl3 nl3Var2 = this.f33156t;
        k43.m7376J(obj);
        nl3Var = nl3Var2;
        z84Var = z84Var2;
        objM13452d = obj;
        C0457ak c0457ak = (C0457ak) objM13452d;
        jp0 jp0Var = z84Var.f35873a;
        float fFloatValue = ((Number) c0457ak.m3020a()).floatValue();
        C0940nb c0940nb = (C0940nb) jp0Var.f22481b;
        float fM8675m = c0940nb.m8675m();
        uv0 uv0VarM8670h = c0940nb.m8670h();
        yp1 yp1Var2 = (yp1) jp0Var.f22482c;
        C1286wa c1286wa = (C1286wa) jp0Var.f22483d;
        C0891m c0891m = AbstractC0485bb.f15192a;
        if (Float.isNaN(fM8675m)) {
            C1077qn.m9987m("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(fFloatValue) > 0.0f;
        boolean z2 = z && fFloatValue > 0.0f;
        if (!z) {
            objM11652b = uv0VarM8670h.m11651a(fM8675m);
        } else if (Math.abs(fFloatValue) >= Math.abs(((Number) c1286wa.invoke()).floatValue())) {
            objM11652b = uv0VarM8670h.m11652b(fM8675m, z2);
        } else {
            objM11652b = uv0VarM8670h.m11652b(fM8675m, false);
            float fM11656f = uv0VarM8670h.m11656f(objM11652b);
            Object objM11652b2 = uv0VarM8670h.m11652b(fM8675m, true);
            float fM11656f2 = uv0VarM8670h.m11656f(objM11652b2);
            float fAbs = Math.abs(((Number) yp1Var2.invoke(Float.valueOf(Math.abs(fM11656f - fM11656f2)))).floatValue());
            if (!z2) {
                fM11656f = fM11656f2;
            }
            boolean z3 = Math.abs(fM11656f - fM8675m) >= fAbs;
            if (z3) {
                if (z2) {
                    objM11652b = objM11652b2;
                }
            } else {
                if (z3) {
                    C0670g.m5864c();
                    return null;
                }
                if (!z2) {
                    objM11652b = objM11652b2;
                }
            }
        }
        if (!((Boolean) ((yp1) c0940nb.f25605b).invoke(objM11652b)).booleanValue()) {
            objM11652b = ((d83) c0940nb.f25608e).getValue();
        }
        float fM11656f3 = c0940nb.m8670h().m11656f(objM11652b) - fM8675m;
        if (Float.isNaN(fM11656f3)) {
            t32.m10970c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        nl3Var.f25933a = fM11656f3;
        C0457ak c0457akM7388m = k43.m7388m(c0457ak, 0.0f, 0.0f, 30);
        InterfaceC1407zj interfaceC1407zj = z84Var.f35875c;
        v84 v84Var2 = new v84((byte) 1);
        v84Var2.f32465b = nl3Var;
        v84Var2.f32466c = yp1Var;
        VarHandle.storeStoreFence();
        this.f33156t = null;
        this.f33157u = (byte) 2;
        Object objM13679k = zp0.m13679k(this.f33161y, fM11656f3, fM11656f3, c0457akM7388m, interfaceC1407zj, v84Var2, this);
        return objM13679k == ap0Var ? ap0Var : objM13679k;
    }
}
