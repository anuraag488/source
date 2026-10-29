package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f31 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f18700i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f18701j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f18702k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f18703l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f18704m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f31(yp1 yp1Var, sw2 sw2Var, zo0 zo0Var, sw2 sw2Var2) {
        super(1);
        this.f18700i = (byte) 1;
        this.f18704m = yp1Var;
        this.f18701j = sw2Var;
        this.f18702k = zo0Var;
        this.f18703l = sw2Var2;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        long j;
        byte b = this.f18700i;
        ju4 ju4Var = ju4.f22634a;
        to4 to4VarM11080a = null;
        Object obj2 = this.f18701j;
        Object obj3 = this.f18704m;
        Object obj4 = this.f18702k;
        byte b2 = 1;
        Object obj5 = this.f18703l;
        switch (b) {
            case 0:
                lv0 lv0Var = new lv0(b2);
                lv0Var.f24385c = (wp1) obj3;
                lv0Var.f24384b = (sw2) obj2;
                lv0Var.f24386d = (sw2) obj5;
                lv0Var.f24387e = (zo0) obj4;
                VarHandle.storeStoreFence();
                return lv0Var;
            case 1:
                long j2 = ((b33) obj).f15059a;
                ((sw2) obj2).setValue(Boolean.TRUE);
                x21 x21Var = new x21();
                lb5.m7910S((zo0) obj4, null, null, new e31(x21Var, null, (byte) 1), 3);
                ((sw2) obj5).setValue(x21Var);
                ((yp1) obj3).invoke(b33.m3423a(j2));
                return ju4Var;
            case 2:
                jp3 jp3Var = (jp3) obj;
                b54 b54Var = (b54) obj3;
                xb4 xb4Var = (xb4) obj2;
                float fFloatValue = xb4Var != null ? ((Number) xb4Var.getValue()).floatValue() : 1.0f;
                C1372yl c1372yl = b54Var.f15091c;
                float fM13399h = fFloatValue * ((b54Var.m3457b() && ((Boolean) ((d83) c1372yl.f35304a).getValue()).booleanValue()) ? ((z73) c1372yl.f35305b).m13399h() : 1.0f);
                if (b54Var.m3457b()) {
                    b54Var.f15094f = fM13399h;
                }
                jp3Var.m7253b(fM13399h);
                xb4 xb4Var2 = (xb4) obj5;
                float fFloatValue2 = xb4Var2 != null ? ((Number) xb4Var2.getValue()).floatValue() : 1.0f;
                b2 = (b54Var.m3457b() && ((Boolean) ((d83) c1372yl.f35306c).getValue()).booleanValue()) ? (byte) 1 : (byte) 0;
                float fM13399h2 = fFloatValue2 * (b2 != 0 ? ((z73) c1372yl.f35307d).m13399h() : 1.0f);
                if (b54Var.m3457b()) {
                    b54Var.f15095g = fM13399h2;
                    if (b2 != 0) {
                        ((z73) c1372yl.f35307d).m13399h();
                    }
                    if (b2 != 0) {
                        lx4 lx4Var = b54Var.f15098j;
                        if (lx4Var == null) {
                            lx4Var = new lx4(false);
                            b54Var.f15098j = lx4Var;
                        }
                        lx4Var.m8145a(i41.m6647f(vm4.m11940a(b54Var.f15092d)), fM13399h2);
                    }
                }
                jp3Var.m7257k(fM13399h2);
                jp3Var.m7258l(fM13399h2);
                xb4 xb4Var3 = (xb4) obj4;
                long j3 = xb4Var3 != null ? ((to4) xb4Var3.getValue()).f31294a : to4.f31292b;
                if (b54Var.m3457b() && ((Boolean) ((d83) c1372yl.f35308e).getValue()).booleanValue()) {
                    j3 = ((to4) ((d83) c1372yl.f35309f).getValue()).f31294a;
                }
                if (b54Var.m3457b()) {
                    b54Var.f15096h = j3;
                }
                jp3Var.m7262u(j3);
                return ju4Var;
            default:
                mc1 mc1Var = (mc1) obj5;
                int iOrdinal = ((b91) obj).ordinal();
                if (iOrdinal == 0) {
                    rv3 rv3Var = ((p91) obj2).f27464a.f16337d;
                    if (rv3Var != null) {
                        j = rv3Var.f29667b;
                    } else {
                        rv3 rv3Var2 = mc1Var.f24813a.f16337d;
                        if (rv3Var2 != null) {
                            j = rv3Var2.f29667b;
                        }
                    }
                    to4VarM11080a = to4.m11080a(j);
                } else if (iOrdinal == 1) {
                    to4VarM11080a = (to4) obj3;
                } else {
                    if (iOrdinal != 2) {
                        C0670g.m5864c();
                        return null;
                    }
                    rv3 rv3Var3 = mc1Var.f24813a.f16337d;
                    to4VarM11080a = to4.m11080a(rv3Var3 != null ? rv3Var3.f29667b : ((b54) obj4).f15096h);
                }
                return to4.m11080a(to4VarM11080a != null ? to4VarM11080a.f31294a : to4.f31292b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f31(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.f18700i = b;
        this.f18704m = obj;
        this.f18701j = obj2;
        this.f18703l = obj3;
        this.f18702k = obj4;
    }
}
