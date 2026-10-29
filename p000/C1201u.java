package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: u */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1201u implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31572a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31573b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31574c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f31575d;

    public /* synthetic */ C1201u(byte b) {
        this.f31572a = b;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(pc3 pc3Var, wm0 wm0Var) {
        byte b = this.f31572a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                a44 a44Var = (a44) this.f31573b;
                yp1 yp1Var = (yp1) this.f31574c;
                a83 a83Var = (a83) this.f31575d;
                C1164t c1164t = new C1164t((byte) 0);
                c1164t.f30700c = a44Var;
                c1164t.f30699b = yp1Var;
                c1164t.f30701d = a83Var;
                VarHandle.storeStoreFence();
                Object objM5720d = fi4.m5720d(pc3Var, null, c1164t, wm0Var, 7);
                return objM5720d == ap0.f14763a ? objM5720d : ju4Var;
            default:
                ek4 ek4Var = new ek4((zo0) this.f31573b, (sw2) this.f31574c, null);
                sw2 sw2Var = this.f31575d;
                C0761ih c0761ih = new C0761ih((byte) 13);
                c0761ih.f21416b = sw2Var;
                VarHandle.storeStoreFence();
                d31 d31Var = fi4.f19017a;
                Object objM13685q = zp0.m13685q(new C0980oe(pc3Var, ek4Var, c0761ih, new df3(pc3Var), (wm0) null, (byte) 10), wm0Var);
                ap0 ap0Var = ap0.f14763a;
                if (objM13685q != ap0Var) {
                    objM13685q = ju4Var;
                }
                return objM13685q == ap0Var ? objM13685q : ju4Var;
        }
    }
}
