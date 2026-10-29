package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: xi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1332xi extends ue2 implements mq1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34291i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ dp4 f34292j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ r93 f34293k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ yp1 f34294l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0727hj f34295m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ w94 f34296n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ pg0 f34297o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332xi(Object obj, dp4 dp4Var, r93 r93Var, yp1 yp1Var, C0727hj c0727hj, w94 w94Var, pg0 pg0Var) {
        super(2);
        this.f34291i = obj;
        this.f34292j = dp4Var;
        this.f34293k = r93Var;
        this.f34294l = yp1Var;
        this.f34295m = c0727hj;
        this.f34296n = w94Var;
        this.f34297o = pg0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        km0 km0Var;
        mc1 mc1Var;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Number) obj2).intValue();
        byte b = 0;
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            dp4 dp4Var = this.f34292j;
            d83 d83Var = dp4Var.f17262e;
            d83 d83Var2 = dp4Var.f17261d;
            Object value = d83Var.getValue();
            Object obj3 = this.f34291i;
            boolean zM6892h = ir1Var.m6892h(z62.m13387o(obj3, value));
            Object objM6869O = ir1Var.m6869O();
            yp1 yp1Var = this.f34294l;
            r93 r93Var = this.f34293k;
            i50 i50Var = ki0.f23136a;
            C0727hj c0727hj = this.f34295m;
            if (zM6892h || objM6869O == i50Var) {
                if (!z62.m13387o(obj3, d83Var.getValue()) || r93Var == null) {
                    km0Var = (z62.m13387o(obj3, dp4Var.m4645g().mo3110a()) || z62.m13387o(obj3, dp4Var.m4645g().mo3111d())) ? (km0) yp1Var.invoke(c0727hj) : (km0) yp1Var.invoke(new r93(c0727hj, dp4Var.m4645g().mo3110a(), obj3));
                } else {
                    km0Var = (km0) yp1Var.invoke(r93Var);
                }
                objM6869O = km0Var;
                ir1Var.m6905n0(objM6869O);
            }
            km0 km0Var2 = (km0) objM6869O;
            boolean zM6892h2 = ir1Var.m6892h(z62.m13387o(dp4Var.m4645g().mo3111d(), obj3)) | ir1Var.m6892h(z62.m13387o(obj3, d83Var.getValue()));
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6892h2 || objM6869O2 == i50Var) {
                if (z62.m13387o(dp4Var.m4645g().mo3111d(), obj3) || (z62.m13387o(obj3, d83Var.getValue()) && r93Var != null)) {
                    mc1Var = mc1.f24811b;
                } else {
                    mc1Var = (z62.m13387o(obj3, dp4Var.m4645g().mo3110a()) || z62.m13387o(obj3, dp4Var.m4645g().mo3111d())) ? ((km0) yp1Var.invoke(c0727hj)).f23229b : ((km0) yp1Var.invoke(new r93(c0727hj, obj3, dp4Var.m4645g().mo3110a()))).f23229b;
                }
                objM6869O2 = mc1Var;
                ir1Var.m6905n0(objM6869O2);
            }
            mc1 mc1Var2 = (mc1) objM6869O2;
            Object objM6869O3 = ir1Var.m6869O();
            Object obj4 = objM6869O3;
            if (objM6869O3 == i50Var) {
                boolean zM13387o = z62.m13387o(obj3, d83Var2.getValue());
                C0529cj c0529cj = new C0529cj();
                c0529cj.f16056a = k43.m7398w(Boolean.valueOf(zM13387o));
                c0529cj.f16057b = k43.m7398w(Boolean.FALSE);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0529cj);
                obj4 = c0529cj;
            }
            C0529cj c0529cj2 = (C0529cj) obj4;
            p91 p91Var = km0Var2.f23228a;
            float fM13399h = km0Var2.f23230c.m13399h();
            q45 q45Var = new q45();
            q45Var.f28218a = fM13399h;
            q45Var.f28219b = obj3;
            VarHandle.storeStoreFence();
            c0529cj2.f16056a.setValue(Boolean.valueOf(z62.m13387o(obj3, d83Var2.getValue())));
            c0529cj2.f16057b.setValue(Boolean.valueOf((!z62.m13387o(obj3, d83Var.getValue()) || z62.m13387o(obj3, d83Var2.getValue()) || z62.m13387o(obj3, dp4Var.f17258a.mo11188l())) ? false : true));
            nt2 nt2VarMo7630d = q45Var.mo7630d(c0529cj2);
            boolean zM6894i = ir1Var.m6894i(obj3);
            Object objM6869O4 = ir1Var.m6869O();
            if (zM6894i || objM6869O4 == i50Var) {
                objM6869O4 = new C1183ti(obj3, b);
                ir1Var.m6905n0(objM6869O4);
            }
            yp1 yp1Var2 = (yp1) objM6869O4;
            boolean zM6890g = ir1Var.m6890g(mc1Var2);
            Object objM6869O5 = ir1Var.m6869O();
            if (zM6890g || objM6869O5 == i50Var) {
                objM6869O5 = new C1220ui(mc1Var2, b);
                ir1Var.m6905n0(objM6869O5);
            }
            z62.m13368a(dp4Var, yp1Var2, nt2VarMo7630d, p91Var, mc1Var2, (mq1) objM6869O5, vd6.m11834R(1831990167, new C1294wi(obj3, this.f34296n, c0727hj, this.f34297o, (byte) 0), ir1Var), ir1Var, 100663296);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
