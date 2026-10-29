package p000;

import ads_mobile_sdk.C0313rh;
import com.materialkolor.ktx.ColorKt;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb0 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f35081a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f35082b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sw2 f35083c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f35084d;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i = this.f35081a;
        yp1 yp1Var = this.f35082b;
        sw2 sw2Var = this.f35083c;
        sw2 sw2Var2 = this.f35084d;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
            oz3 oz3VarM10799H = sj3.m10799H(null, new xy3(bc0.m3544b(sw2Var), pb0.m9464c(ColorKt.m13924isLight8_81llA(((pb0) sw2Var.getValue()).f27503a) ? pb0.f27495b : pb0.f27497d, 1.0f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ColorKt.m13924isLight8_81llA(((pb0) sw2Var.getValue()).f27503a) ? pb0.f27495b : pb0.f27497d, 0.74f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ColorKt.m13924isLight8_81llA(((pb0) sw2Var.getValue()).f27503a) ? pb0.f27495b : pb0.f27497d, 0.74f, 0.0f, 0.0f, 0.0f, 14)), null, ir1Var, 12582912, C0313rh.f10802l1);
            xk4 xk4Var = (xk4) sw2Var2.getValue();
            boolean zM6886e = ir1Var.m6886e(i) | ir1Var.m6892h(false) | ir1Var.m6890g(yp1Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6886e || objM6869O == ki0.f23136a) {
                obj4 = objM6869O;
                sb0 sb0Var = new sb0((byte) 0);
                sb0Var.f30047b = i;
                sb0Var.f30049d = sw2Var2;
                sb0Var.f30048c = yp1Var;
                sb0Var.f30050e = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(sb0Var);
                obj4 = sb0Var;
            }
            obj4 = objM6869O;
            mz3.m8467i(xk4Var, (yp1) obj4, null, null, oz3VarM10799H, null, y42.f34861c, null, ir1Var, 1572864, 172);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
