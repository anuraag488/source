package p000;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: h5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0713h5 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20392a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ lu2 f20393b;

    public /* synthetic */ C0713h5(byte b) {
        this.f20392a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f20392a;
        lu2 lu2Var = this.f20393b;
        InterfaceC0493bj interfaceC0493bj = (InterfaceC0493bj) obj;
        switch (b) {
            case 0:
                return new km0(k91.m7438c(lu2Var.mo7286c(), 2), k91.m7439d(lu2Var.mo7286c(), 2));
            case 1:
                return new km0(k91.m7438c(lu2Var.mo7286c(), 2).m9439a(k91.m7440e(lu2Var.mo7289f(), 0.0f, 6)), k91.m7439d(lu2Var.mo7288e(), 2).m8273a(k91.m7441f(lu2Var.mo7284a(), 0.0f, 6)));
            case 2:
                return new km0(k91.m7438c(lu2Var.mo7289f(), 2), k91.m7439d(lu2Var.mo7284a(), 2));
            case 3:
                return interfaceC0493bj.mo3605c(new km0(k91.m7438c(lu2Var.mo7285b(), 2).m9439a(k91.m7440e(lu2Var.mo7287d(), 0.0f, 6)), k91.m7439d(lu2Var.mo7286c(), 2).m8273a(k91.m7441f(lu2Var.mo7289f(), 0.0f, 6))));
            case 4:
                db4 db4VarMo7289f = lu2Var.mo7289f();
                kr2 kr2Var = new kr2((byte) 14);
                sq4 sq4Var = k91.f23003a;
                return new km0(new p91(new cp4((xc1) null, new t74(new j91(kr2Var, (byte) 0), db4VarMo7289f), (z70) null, (rv3) null, (LinkedHashMap) null, 125)).m9439a(k91.m7438c(lu2Var.mo7286c(), 2)), new mc1(new cp4((xc1) null, new t74(new j91(new kr2((byte) 15), (byte) 2), lu2Var.mo7289f()), (z70) null, (rv3) null, (LinkedHashMap) null, 125)).m8273a(k91.m7439d(lu2Var.mo7286c(), 2)));
            default:
                return new km0(k91.m7438c(lu2Var.mo7286c(), 2), k91.m7439d(lu2Var.mo7286c(), 2));
        }
    }
}
